//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21._int.wmo.def.opm._2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeBoundsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeBoundsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangeStart" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rangeEnd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="endComparison" use="required" type="{http://def.wmo.int/opm/2013}ComparisonOperatorType" />
 *       &lt;attribute name="startComparison" use="required" type="{http://def.wmo.int/opm/2013}ComparisonOperatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeBoundsType", propOrder = {
    "rangeStart",
    "rangeEnd"
})
public class RangeBoundsType {

    protected double rangeStart;
    protected double rangeEnd;
    @XmlAttribute(name = "endComparison", required = true)
    protected ComparisonOperatorType endComparison;
    @XmlAttribute(name = "startComparison", required = true)
    protected ComparisonOperatorType startComparison;

    /**
     * Gets the value of the rangeStart property.
     * 
     */
    public double getRangeStart() {
        return rangeStart;
    }

    /**
     * Sets the value of the rangeStart property.
     * 
     */
    public void setRangeStart(double value) {
        this.rangeStart = value;
    }

    public boolean isSetRangeStart() {
        return true;
    }

    /**
     * Gets the value of the rangeEnd property.
     * 
     */
    public double getRangeEnd() {
        return rangeEnd;
    }

    /**
     * Sets the value of the rangeEnd property.
     * 
     */
    public void setRangeEnd(double value) {
        this.rangeEnd = value;
    }

    public boolean isSetRangeEnd() {
        return true;
    }

    /**
     * Gets the value of the endComparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public ComparisonOperatorType getEndComparison() {
        return endComparison;
    }

    /**
     * Sets the value of the endComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public void setEndComparison(ComparisonOperatorType value) {
        this.endComparison = value;
    }

    public boolean isSetEndComparison() {
        return (this.endComparison!= null);
    }

    /**
     * Gets the value of the startComparison property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public ComparisonOperatorType getStartComparison() {
        return startComparison;
    }

    /**
     * Sets the value of the startComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorType }
     *     
     */
    public void setStartComparison(ComparisonOperatorType value) {
        this.startComparison = value;
    }

    public boolean isSetStartComparison() {
        return (this.startComparison!= null);
    }

}
