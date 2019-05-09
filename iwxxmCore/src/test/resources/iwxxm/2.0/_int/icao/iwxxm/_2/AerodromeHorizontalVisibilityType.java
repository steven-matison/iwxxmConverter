//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.18 at 02:04:43 PM MSK 
//


package _int.icao.iwxxm._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AngleType;
import net.opengis.gml.v_3_2_1.LengthType;


/**
 * <p>Java class for AerodromeHorizontalVisibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeHorizontalVisibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prevailingVisibility" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="prevailingVisibilityOperator" type="{http://icao.int/iwxxm/2.0}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="minimumVisibility" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="minimumVisibilityDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeHorizontalVisibilityType", propOrder = {
    "prevailingVisibility",
    "prevailingVisibilityOperator",
    "minimumVisibility",
    "minimumVisibilityDirection"
})
public class AerodromeHorizontalVisibilityType {

    @XmlElement(required = true)
    protected LengthType prevailingVisibility;
    protected RelationalOperatorType prevailingVisibilityOperator;
    protected LengthType minimumVisibility;
    protected AngleType minimumVisibilityDirection;

    /**
     * Gets the value of the prevailingVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPrevailingVisibility() {
        return prevailingVisibility;
    }

    /**
     * Sets the value of the prevailingVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPrevailingVisibility(LengthType value) {
        this.prevailingVisibility = value;
    }

    public boolean isSetPrevailingVisibility() {
        return (this.prevailingVisibility!= null);
    }

    /**
     * Gets the value of the prevailingVisibilityOperator property.
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getPrevailingVisibilityOperator() {
        return prevailingVisibilityOperator;
    }

    /**
     * Sets the value of the prevailingVisibilityOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setPrevailingVisibilityOperator(RelationalOperatorType value) {
        this.prevailingVisibilityOperator = value;
    }

    public boolean isSetPrevailingVisibilityOperator() {
        return (this.prevailingVisibilityOperator!= null);
    }

    /**
     * Gets the value of the minimumVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumVisibility() {
        return minimumVisibility;
    }

    /**
     * Sets the value of the minimumVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumVisibility(LengthType value) {
        this.minimumVisibility = value;
    }

    public boolean isSetMinimumVisibility() {
        return (this.minimumVisibility!= null);
    }

    /**
     * Gets the value of the minimumVisibilityDirection property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getMinimumVisibilityDirection() {
        return minimumVisibilityDirection;
    }

    /**
     * Sets the value of the minimumVisibilityDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setMinimumVisibilityDirection(AngleType value) {
        this.minimumVisibilityDirection = value;
    }

    public boolean isSetMinimumVisibilityDirection() {
        return (this.minimumVisibilityDirection!= null);
    }

}