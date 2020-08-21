//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.net.opengis.gml.v_3_2_1.TimePrimitivePropertyType;


/**
 * Adds in the AIXM specific properties, such as 'interpretation'.
 * 
 * <p>Java class for AbstractAIXMTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}interpretation"/>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}sequenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}correctionNumber" minOccurs="0"/>
 *         &lt;element name="timeSliceMetadata" type="{http://www.aixm.aero/schema/5.1.1}FeatureTimeSliceMetadataPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}featureLifetime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMTimeSliceType", propOrder = {
    "interpretation",
    "sequenceNumber",
    "correctionNumber",
    "timeSliceMetadata",
    "featureLifetime"
})
@XmlSeeAlso({
    RulesProceduresTimeSliceType.class,
    CheckpointINSTimeSliceType.class,
    AirTrafficControlServiceTimeSliceType.class,
    CirclingAreaTimeSliceType.class,
    InstrumentApproachProcedureTimeSliceType.class,
    MarkerBeaconTimeSliceType.class,
    StandardInstrumentArrivalTimeSliceType.class,
    RunwayMarkingTimeSliceType.class,
    AeronauticalGroundLightTimeSliceType.class,
    StandardLevelColumnTimeSliceType.class,
    SearchRescueServiceTimeSliceType.class,
    AirspaceTimeSliceType.class,
    ArrivalLegTimeSliceType.class,
    TaxiwayTimeSliceType.class,
    AirTrafficManagementServiceTimeSliceType.class,
    NonMovementAreaTimeSliceType.class,
    SurveyControlPointTimeSliceType.class,
    ArrivalFeederLegTimeSliceType.class,
    StandMarkingTimeSliceType.class,
    TaxiwayMarkingTimeSliceType.class,
    InformationServiceTimeSliceType.class,
    RunwayVisualRangeTimeSliceType.class,
    RouteSegmentTimeSliceType.class,
    AirportClearanceServiceTimeSliceType.class,
    SeaplaneLandingAreaTimeSliceType.class,
    SpecialNavigationStationTimeSliceType.class,
    ProcedureDMETimeSliceType.class,
    LocalizerTimeSliceType.class,
    SeaplaneRampSiteTimeSliceType.class,
    TaxiHoldingPositionMarkingTimeSliceType.class,
    RunwayElementTimeSliceType.class,
    RouteDMETimeSliceType.class,
    SignificantPointInAirspaceTimeSliceType.class,
    TaxiwayLightSystemTimeSliceType.class,
    AngleIndicationTimeSliceType.class,
    GroundTrafficControlServiceTimeSliceType.class,
    AuthorityForAirspaceTimeSliceType.class,
    InitialLegTimeSliceType.class,
    TouchDownLiftOffSafeAreaTimeSliceType.class,
    StandardLevelTableTimeSliceType.class,
    NavaidTimeSliceType.class,
    HoldingPatternTimeSliceType.class,
    ApronMarkingTimeSliceType.class,
    HoldingAssessmentTimeSliceType.class,
    GlidepathTimeSliceType.class,
    ElevationTimeSliceType.class,
    FinalLegTimeSliceType.class,
    AltimeterSourceTimeSliceType.class,
    TouchDownLiftOffTimeSliceType.class,
    UnplannedHoldingTimeSliceType.class,
    TaxiwayElementTimeSliceType.class,
    AirportSuppliesServiceTimeSliceType.class,
    DMETimeSliceType.class,
    NavigationAreaTimeSliceType.class,
    GuidanceLineLightSystemTimeSliceType.class,
    DeicingAreaTimeSliceType.class,
    PilotControlledLightingTimeSliceType.class,
    NDBTimeSliceType.class,
    ApproachLightingSystemTimeSliceType.class,
    AzimuthTimeSliceType.class,
    PassengerLoadingBridgeTimeSliceType.class,
    StandardInstrumentDepartureTimeSliceType.class,
    TaxiHoldingPositionTimeSliceType.class,
    SDFTimeSliceType.class,
    StandardLevelSectorTimeSliceType.class,
    RunwayTimeSliceType.class,
    UnitTimeSliceType.class,
    AerialRefuellingTimeSliceType.class,
    RunwayCentrelinePointTimeSliceType.class,
    AirportHeliportTimeSliceType.class,
    RunwayProtectAreaLightSystemTimeSliceType.class,
    RunwayDirectionLightSystemTimeSliceType.class,
    ApronLightSystemTimeSliceType.class,
    AirportProtectionAreaMarkingTimeSliceType.class,
    SafeAltitudeAreaTimeSliceType.class,
    SpecialNavigationSystemTimeSliceType.class,
    MarkingBuoyTimeSliceType.class,
    AirportHeliportCollocationTimeSliceType.class,
    ApronTimeSliceType.class,
    VORTimeSliceType.class,
    AirspaceBorderCrossingTimeSliceType.class,
    VerticalStructureTimeSliceType.class,
    DirectionFinderTimeSliceType.class,
    IntermediateLegTimeSliceType.class,
    AircraftGroundServiceTimeSliceType.class,
    MissedApproachLegTimeSliceType.class,
    SpecialDateTimeSliceType.class,
    RadarSystemTimeSliceType.class,
    ApronElementTimeSliceType.class,
    OrganisationAuthorityTimeSliceType.class,
    GuidanceLineTimeSliceType.class,
    TerminalArrivalAreaTimeSliceType.class,
    RouteTimeSliceType.class,
    TACANTimeSliceType.class,
    AirportHotSpotTimeSliceType.class,
    PrimarySurveillanceRadarTimeSliceType.class,
    ArrestingGearTimeSliceType.class,
    RoadTimeSliceType.class,
    GuidanceLineMarkingTimeSliceType.class,
    FloatingDockSiteTimeSliceType.class,
    FlightRestrictionTimeSliceType.class,
    DesignatedPointTimeSliceType.class,
    DeicingAreaMarkingTimeSliceType.class,
    ObstacleAreaTimeSliceType.class,
    AircraftStandTimeSliceType.class,
    SecondarySurveillanceRadarTimeSliceType.class,
    CheckpointVORTimeSliceType.class,
    DepartureLegTimeSliceType.class,
    RunwayBlastPadTimeSliceType.class,
    FireFightingServiceTimeSliceType.class,
    GeoBorderTimeSliceType.class,
    ChangeOverPointTimeSliceType.class,
    TaxiHoldingPositionLightSystemTimeSliceType.class,
    RunwayProtectAreaTimeSliceType.class,
    WorkAreaTimeSliceType.class,
    PassengerServiceTimeSliceType.class,
    RadioCommunicationChannelTimeSliceType.class,
    VisualGlideSlopeIndicatorTimeSliceType.class,
    TouchDownLiftOffLightSystemTimeSliceType.class,
    DistanceIndicationTimeSliceType.class,
    NavigationAreaRestrictionTimeSliceType.class,
    PrecisionApproachRadarTimeSliceType.class,
    RadioFrequencyAreaTimeSliceType.class,
    TouchDownLiftOffMarkingTimeSliceType.class,
    RunwayDirectionTimeSliceType.class
})
public abstract class AbstractAIXMTimeSliceType
    extends AbstractAIXMTimeSliceBaseType
{

    @XmlElement(required = true)
    protected String interpretation;
    protected Long sequenceNumber;
    protected Long correctionNumber;
    protected FeatureTimeSliceMetadataPropertyType timeSliceMetadata;
    protected TimePrimitivePropertyType featureLifetime;

    /**
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    public boolean isSetInterpretation() {
        return (this.interpretation!= null);
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    public boolean isSetSequenceNumber() {
        return (this.sequenceNumber!= null);
    }

    /**
     * Gets the value of the correctionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCorrectionNumber() {
        return correctionNumber;
    }

    /**
     * Sets the value of the correctionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCorrectionNumber(Long value) {
        this.correctionNumber = value;
    }

    public boolean isSetCorrectionNumber() {
        return (this.correctionNumber!= null);
    }

    /**
     * Gets the value of the timeSliceMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    public FeatureTimeSliceMetadataPropertyType getTimeSliceMetadata() {
        return timeSliceMetadata;
    }

    /**
     * Sets the value of the timeSliceMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    public void setTimeSliceMetadata(FeatureTimeSliceMetadataPropertyType value) {
        this.timeSliceMetadata = value;
    }

    public boolean isSetTimeSliceMetadata() {
        return (this.timeSliceMetadata!= null);
    }

    /**
     * Gets the value of the featureLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getFeatureLifetime() {
        return featureLifetime;
    }

    /**
     * Sets the value of the featureLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setFeatureLifetime(TimePrimitivePropertyType value) {
        this.featureLifetime = value;
    }

    public boolean isSetFeatureLifetime() {
        return (this.featureLifetime!= null);
    }

}
