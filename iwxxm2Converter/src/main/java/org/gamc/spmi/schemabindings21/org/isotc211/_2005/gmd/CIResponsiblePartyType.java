//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package schemabindings21.org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import schemabindings21.org.isotc211._2005.gco.AbstractObjectType;
import schemabindings21.org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * Identification of, and means of communication with, person(s) and organisations associated with the dataset
 * 
 * <p>Java class for CI_ResponsibleParty_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CI_ResponsibleParty_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="individualName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="organisationName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="positionName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.isotc211.org/2005/gmd}CI_Contact_PropertyType" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.isotc211.org/2005/gmd}CI_RoleCode_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_ResponsibleParty_Type", propOrder = {
    "individualName",
    "organisationName",
    "positionName",
    "contactInfo",
    "role"
})
public class CIResponsiblePartyType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType individualName;
    protected CharacterStringPropertyType organisationName;
    protected CharacterStringPropertyType positionName;
    protected CIContactPropertyType contactInfo;
    @XmlElement(required = true)
    protected CIRoleCodePropertyType role;

    /**
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setIndividualName(CharacterStringPropertyType value) {
        this.individualName = value;
    }

    public boolean isSetIndividualName() {
        return (this.individualName!= null);
    }

    /**
     * Gets the value of the organisationName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrganisationName() {
        return organisationName;
    }

    /**
     * Sets the value of the organisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrganisationName(CharacterStringPropertyType value) {
        this.organisationName = value;
    }

    public boolean isSetOrganisationName() {
        return (this.organisationName!= null);
    }

    /**
     * Gets the value of the positionName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPositionName(CharacterStringPropertyType value) {
        this.positionName = value;
    }

    public boolean isSetPositionName() {
        return (this.positionName!= null);
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CIContactPropertyType }
     *     
     */
    public CIContactPropertyType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIContactPropertyType }
     *     
     */
    public void setContactInfo(CIContactPropertyType value) {
        this.contactInfo = value;
    }

    public boolean isSetContactInfo() {
        return (this.contactInfo!= null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public CIRoleCodePropertyType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public void setRole(CIRoleCodePropertyType value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

}
