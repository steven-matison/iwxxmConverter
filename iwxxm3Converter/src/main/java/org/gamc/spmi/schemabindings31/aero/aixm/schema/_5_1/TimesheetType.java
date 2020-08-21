//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimesheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimesheetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}TimesheetPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTimesheetExtension"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimesheetType", propOrder = {
    "timeReference",
    "startDate",
    "endDate",
    "day",
    "dayTil",
    "startTime",
    "startEvent",
    "startTimeRelativeEvent",
    "startEventInterpretation",
    "endTime",
    "endEvent",
    "endTimeRelativeEvent",
    "endEventInterpretation",
    "daylightSavingAdjust",
    "excluded",
    "annotation",
    "extension"
})
public class TimesheetType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "timeReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeReferenceType> timeReference;
    @XmlElementRef(name = "startDate", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateMonthDayType> startDate;
    @XmlElementRef(name = "endDate", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateMonthDayType> endDate;
    @XmlElementRef(name = "day", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDayType> day;
    @XmlElementRef(name = "dayTil", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeDayType> dayTil;
    @XmlElementRef(name = "startTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> startTime;
    @XmlElementRef(name = "startEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventType> startEvent;
    @XmlElementRef(name = "startTimeRelativeEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> startTimeRelativeEvent;
    @XmlElementRef(name = "startEventInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventCombinationType> startEventInterpretation;
    @XmlElementRef(name = "endTime", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> endTime;
    @XmlElementRef(name = "endEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventType> endEvent;
    @XmlElementRef(name = "endTimeRelativeEvent", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDurationType> endTimeRelativeEvent;
    @XmlElementRef(name = "endEventInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTimeEventCombinationType> endEventInterpretation;
    @XmlElementRef(name = "daylightSavingAdjust", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> daylightSavingAdjust;
    @XmlElementRef(name = "excluded", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> excluded;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<TimesheetType.Extension> extension;

    /**
     * Gets the value of the timeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeReferenceType> getTimeReference() {
        return timeReference;
    }

    /**
     * Sets the value of the timeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeReferenceType }{@code >}
     *     
     */
    public void setTimeReference(JAXBElement<CodeTimeReferenceType> value) {
        this.timeReference = value;
    }

    public boolean isSetTimeReference() {
        return (this.timeReference!= null);
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public JAXBElement<DateMonthDayType> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<DateMonthDayType> value) {
        this.startDate = value;
    }

    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public JAXBElement<DateMonthDayType> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateMonthDayType }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<DateMonthDayType> value) {
        this.endDate = value;
    }

    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public JAXBElement<CodeDayType> getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public void setDay(JAXBElement<CodeDayType> value) {
        this.day = value;
    }

    public boolean isSetDay() {
        return (this.day!= null);
    }

    /**
     * Gets the value of the dayTil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public JAXBElement<CodeDayType> getDayTil() {
        return dayTil;
    }

    /**
     * Sets the value of the dayTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeDayType }{@code >}
     *     
     */
    public void setDayTil(JAXBElement<CodeDayType> value) {
        this.dayTil = value;
    }

    public boolean isSetDayTil() {
        return (this.dayTil!= null);
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public JAXBElement<TimeType> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<TimeType> value) {
        this.startTime = value;
    }

    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    /**
     * Gets the value of the startEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventType> getStartEvent() {
        return startEvent;
    }

    /**
     * Sets the value of the startEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public void setStartEvent(JAXBElement<CodeTimeEventType> value) {
        this.startEvent = value;
    }

    public boolean isSetStartEvent() {
        return (this.startEvent!= null);
    }

    /**
     * Gets the value of the startTimeRelativeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public JAXBElement<ValDurationType> getStartTimeRelativeEvent() {
        return startTimeRelativeEvent;
    }

    /**
     * Sets the value of the startTimeRelativeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setStartTimeRelativeEvent(JAXBElement<ValDurationType> value) {
        this.startTimeRelativeEvent = value;
    }

    public boolean isSetStartTimeRelativeEvent() {
        return (this.startTimeRelativeEvent!= null);
    }

    /**
     * Gets the value of the startEventInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventCombinationType> getStartEventInterpretation() {
        return startEventInterpretation;
    }

    /**
     * Sets the value of the startEventInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public void setStartEventInterpretation(JAXBElement<CodeTimeEventCombinationType> value) {
        this.startEventInterpretation = value;
    }

    public boolean isSetStartEventInterpretation() {
        return (this.startEventInterpretation!= null);
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public JAXBElement<TimeType> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<TimeType> value) {
        this.endTime = value;
    }

    public boolean isSetEndTime() {
        return (this.endTime!= null);
    }

    /**
     * Gets the value of the endEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventType> getEndEvent() {
        return endEvent;
    }

    /**
     * Sets the value of the endEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventType }{@code >}
     *     
     */
    public void setEndEvent(JAXBElement<CodeTimeEventType> value) {
        this.endEvent = value;
    }

    public boolean isSetEndEvent() {
        return (this.endEvent!= null);
    }

    /**
     * Gets the value of the endTimeRelativeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public JAXBElement<ValDurationType> getEndTimeRelativeEvent() {
        return endTimeRelativeEvent;
    }

    /**
     * Sets the value of the endTimeRelativeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDurationType }{@code >}
     *     
     */
    public void setEndTimeRelativeEvent(JAXBElement<ValDurationType> value) {
        this.endTimeRelativeEvent = value;
    }

    public boolean isSetEndTimeRelativeEvent() {
        return (this.endTimeRelativeEvent!= null);
    }

    /**
     * Gets the value of the endEventInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public JAXBElement<CodeTimeEventCombinationType> getEndEventInterpretation() {
        return endEventInterpretation;
    }

    /**
     * Sets the value of the endEventInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTimeEventCombinationType }{@code >}
     *     
     */
    public void setEndEventInterpretation(JAXBElement<CodeTimeEventCombinationType> value) {
        this.endEventInterpretation = value;
    }

    public boolean isSetEndEventInterpretation() {
        return (this.endEventInterpretation!= null);
    }

    /**
     * Gets the value of the daylightSavingAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDaylightSavingAdjust() {
        return daylightSavingAdjust;
    }

    /**
     * Sets the value of the daylightSavingAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDaylightSavingAdjust(JAXBElement<CodeYesNoType> value) {
        this.daylightSavingAdjust = value;
    }

    public boolean isSetDaylightSavingAdjust() {
        return (this.daylightSavingAdjust!= null);
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setExcluded(JAXBElement<CodeYesNoType> value) {
        this.excluded = value;
    }

    public boolean isSetExcluded() {
        return (this.excluded!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetType.Extension }
     * 
     * 
     */
    public List<TimesheetType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TimesheetType.Extension>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractTimesheetExtension"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractTimesheetExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractTimesheetExtension")
        protected AbstractExtensionType abstractTimesheetExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractTimesheetExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractTimesheetExtension() {
            return abstractTimesheetExtension;
        }

        /**
         * Sets the value of the abstractTimesheetExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractTimesheetExtension(AbstractExtensionType value) {
            this.abstractTimesheetExtension = value;
        }

        public boolean isSetAbstractTimesheetExtension() {
            return (this.abstractTimesheetExtension!= null);
        }

        /**
         * Gets the value of the owns property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Sets the value of the owns property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(boolean value) {
            this.owns = value;
        }

        public boolean isSetOwns() {
            return (this.owns!= null);
        }

        public void unsetOwns() {
            this.owns = null;
        }

    }

}
