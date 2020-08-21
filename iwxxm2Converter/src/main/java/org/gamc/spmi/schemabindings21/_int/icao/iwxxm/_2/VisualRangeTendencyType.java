//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21._int.icao.iwxxm._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisualRangeTendencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisualRangeTendencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPWARD"/>
 *     &lt;enumeration value="NO_CHANGE"/>
 *     &lt;enumeration value="DOWNWARD"/>
 *     &lt;enumeration value="MISSING_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisualRangeTendencyType")
@XmlEnum
public enum VisualRangeTendencyType {


    /**
     * Upward (increasing) tendency
     * 
     */
    UPWARD,

    /**
     * No distinct change
     * 
     */
    NO_CHANGE,

    /**
     * Downward (decreasing) tendency
     * 
     */
    DOWNWARD,

    /**
     * Missing value
     * 
     */
    MISSING_VALUE;

    public String value() {
        return name();
    }

    public static VisualRangeTendencyType fromValue(String v) {
        return valueOf(v);
    }

}
