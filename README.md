# Introduction
IwxxmConverter is JAXB-project intended to provide starting API(numerous of helper classes and methods) to allow other contributors to develop
their own applications in the area of **IWXXM** conversion, validation and distribution.

## Credits
Thanks to the many of IWXXM, ICAO, WMO people who provided clear XSD schemas of the new aviation weather format. 
One may find them here: 
[IWXXM2.0](http://schemas.wmo.int/iwxxm/2.0/zip/iwxxm-schema-bundle-2.0.zip)
[IWXXM2.1RC](http://schemas.wmo.int/iwxxm/2.1.1RC1/zip/iwxxm-schema-bundle-2.1.1RC1.zip)
			
## What has been done
This project contains already prepared java-classes, generated by xjc compiler and some binding classes 
(for example see /test/resources/iwxxm/2.1/binders1)  
Execution of `xjc iwxxm.xsd -extension -b binders1 -d output` leads to recompile all xsds into 'output' dir.   

BUT keep in mind that there are some edits and additions to generated classes.  
1. Namespaces prefixes are set either by annotation @XmlNs in each package-info file,  
    e.g. *xmlns={@XmlNs(namespaceURI = "http://icao.int/iwxxm/2.1", prefix = "iwxxm" )}*  
or by special mapper 'common.NameSpaceMapper' when (somehow) for xlink @XmlNs namespace annotation binding doesn't work.
2. Also there are direct changes in generated classes that remove some unnecessary(?) tags from output XML:
 - GML AbstractFeatureType - BoundedBy - made non-mandatory (removes \<boundedBy="nil"\> tag)
 - In these classes field 'final static TypeType TYPE' can be changed to a non-static property to remove \<xlink:type="simple"\>: 
 - GML ReferenceType 
 - GML TimeInstantPropertyType
 - GML FeaturePropertyType
3. The CRUX validation, provided by NCAR (thanks to [Aaron Braeckel](https://github.com/braeckel)), is included in POM and avaliable from unit tests.
But the performance of crux library taken from Maven is not very good.
Probably it caused by loading of xml schemas via http.

As an alternative way of validation the [PH-SHEMATRON](https://github.com/phax/ph-schematron) is provided. 
The comparing results look similar but ph-schematron's performance out-of-the-box is much better.   
Bonus: ph-shematron can generate SVRL report files with validation results.

## Using
There are some steps from TAC to IWXXM messages:
 - Parsing TAC
 - Creating internal representation of described elements
 - Applying transformation to JAXB-object 
 - Marshalling of the prepared object to XML-document
 - Validation of XML-file with schematron engine

If you're not interested in internal representation just use appropriate converter:

1. Conversion sample
```java
   String metar = "METAR UUEE 270830Z 02006MPS 2100 -SN OVC009 M04/M06 Q1008 R06L/590230\n" + 
    "     R06R/590230 TEMPO 1000 SHSN BKN012CB=";
    @Test
    public void testMetar() {
        METARConverter mc = new METARConverter();
        String result = mc.convertTacToXML(metar);
        System.out.println(result);
    }
```
Similar use TAFConverter and SPECIConverter.\

Also if you don't know the type of the converter you may delegate to choose one to ``ConverterFactory`` by following code:
```java
TacConverter<?, ?> converter = ConverterFactory.createForTac(tacMessage);
String convertedIwxxm = converter.convertTacToXML(tacMessage);
```
2. Validation sample. See IwxxmValidator class for details
```java
	@Test
	public void testValidation() {
		//create and init validator
		IwxxmValidator validator = new IwxxmValidator();
		validator.init();
		//convert taf
		String validTaf = "TAF LZIB 101058Z 1012/1112 24015KT 9999 -SHRA FEW018 BKN028 TX10/1112Z TN05/1100Z BECMG 1014/1017 18012KT BECMG 1104/1107 14022KT 7000 RADZ SCT010 BKN015CB OVC025";
		TAFConverter tafconverter = new TAFConverter();
		String iwxxm = tafconverter.convertTacToXML(validTaf);
		//send it to validator and check failures
		List<FailedAssert> failedResults = validator.validateString(iwxxm);
		assertTrue(failedResults.size()==0);
	}	
``` 
3. Using internal representation
If you need internal classes, see METARTacMessage, SPECITacMessage, TAFTacMessage classes and their interfaces.
When parsing from TAC use `parseMessage()` for whole message and `parseSection()` for Trends functions. 
```java
    String tafUUWW = "TAF UUWW 090750Z 0909/1008 30007MPS 9999 SCT015 TXM03/1009Z\r\n" + 
			"TNM06/0918Z TEMPO 0909/0913 30012MPS\r\nBECMG 0913/0915 OVC009 TEMPO\n" + 
			"0915/1009 3100 -SN OVC005=";
	@Test
	public void testTafCommonWeatherSection() throws TAFParsingException {
		//Init message and parse TAC 
		TAFTacMessage tafMessage = new TAFTacMessage(tafUUWW);
		tafMessage.parseMessage();
		//check field values after parsing
		assertEquals(23, tafMessage.getValidityInterval().toPeriod().toStandardHours().getHours());
		assertEquals(1,tafMessage.getBecomingSections().size());
		assertEquals(2,tafMessage.getTempoSections().size());
		assertEquals(BigDecimal.valueOf(-3),tafMessage.getCommonWeatherSection().getAirTemperatureMax());
		assertEquals(BigDecimal.valueOf(-6),tafMessage.getCommonWeatherSection().getAirTemperatureMin());
	}
```

4. Also you may init empty message object, fill them via setters and convert into IWXXM representation
```java
	@Test
	public void testIWXXMCreation() {
		//create empty object
		TAFTacMessage tafMessage = new TAFTacMessage("");
		
		//fill with data
		tafMessage.getCommonWeatherSection().setAirTemperatureMax(BigDecimal.TEN);
		tafMessage.getCommonWeatherSection().setAirTemperatureMaxTime(DateTime.now());

		// further field setters...
		
		TAFConverter tc = new TAFConverter(); 	      //create converter
		TAFType tt = tc.convertMessage(tafMessage);   //create iwxxm type
		String result = tc.marshallMessageToXML(tt);  //marshal to XML
		System.out.println(result);
	}
```  
5. Simple REST-services (Grizzly+Jersey) included in project as a samples of remote conversion and validation.
Build project and start embedded web-server by following command with arguments of your ip/hostname and port (localhost:8082 are default):
```java -cp iwxxmConverter.jar WebAppStarter xxx.xxx.xxx.xxx yyyy```

In the case of empty parameters base URI will be (http://localhost:8082/iwxxmConverter/api)

API methods:
 - test if REST is running \
 **method**: test 
 - get converted TAC in IWXXM format\
 **method**: convert\
 **parameter**: message 
 - get converted result in IWXXM format and list of validation errors\
 **method**: convertandvalidate\
 **parameter**: message
 - get validation results for input IWXXM message\
 **method**: validate\
 **parameter**:message
  	
So ask `http://localhost:8082/iwxxmConverter/api/convertandvalidate?message=METAR UUWW 090830Z 23005MPS CAVOK 14/03 Q1021 R24/000070 NOSIG`
to get converted and validated results.
  
  
## Contribution
Any help from the community will be highly appreciated. There is a lot of work to be done =):
 - This project needs much more test cases with tricky not well-formed TAC messages.
 - It currently supports only IWXXM2.1 METAR, SPECI and TAF, so it should be extended for all documented IWXXM format
 - After final release of the IWXXM 3 this project should be refactored to support new format
 - RMK sections are waiting for implementation  

## Licensing
 - The IwxxmConverter is distributed under The APACHE 2.0 License
 - CRUX software as dependency is distributed under The CRUX License
 - PH-Schematron as dependency is distributed under The APACHE 2.0 License.

## Contacts
Dmitry Moryakov  
Main aeronautical meteorological center, Moscow, Russia  
E-mail: moryakovdv@gmail.com
