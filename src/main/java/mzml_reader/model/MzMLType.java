//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 01:37:56 AM SGT 
//


package mzml_reader.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the root element for the Proteomics Standards Initiative (PSI) mzML schema, which is intended to capture the use of a mass spectrometer, the data generated, and the initial processing of that data (to the level of the peak list).
 * 
 * <p>Java class for mzMLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mzMLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvList" type="{http://psi.hupo.org/ms/mzml}CVListType"/>
 *         &lt;element name="fileDescription" type="{http://psi.hupo.org/ms/mzml}FileDescriptionType"/>
 *         &lt;element name="referenceableParamGroupList" type="{http://psi.hupo.org/ms/mzml}ReferenceableParamGroupListType" minOccurs="0"/>
 *         &lt;element name="sampleList" type="{http://psi.hupo.org/ms/mzml}SampleListType" minOccurs="0"/>
 *         &lt;element name="softwareList" type="{http://psi.hupo.org/ms/mzml}SoftwareListType"/>
 *         &lt;element name="scanSettingsList" type="{http://psi.hupo.org/ms/mzml}ScanSettingsListType" minOccurs="0"/>
 *         &lt;element name="instrumentConfigurationList" type="{http://psi.hupo.org/ms/mzml}InstrumentConfigurationListType"/>
 *         &lt;element name="dataProcessingList" type="{http://psi.hupo.org/ms/mzml}DataProcessingListType"/>
 *         &lt;element name="run" type="{http://psi.hupo.org/ms/mzml}RunType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="accession" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mzMLType", propOrder = {
    "cvList",
    "fileDescription",
    "referenceableParamGroupList",
    "sampleList",
    "softwareList",
    "scanSettingsList",
    "instrumentConfigurationList",
    "dataProcessingList",
    "run"
})
public class MzMLType {

    @XmlElement(required = true)
    protected CVListType cvList;
    @XmlElement(required = true)
    protected FileDescriptionType fileDescription;
    protected ReferenceableParamGroupListType referenceableParamGroupList;
    protected SampleListType sampleList;
    @XmlElement(required = true)
    protected SoftwareListType softwareList;
    protected ScanSettingsListType scanSettingsList;
    @XmlElement(required = true)
    protected InstrumentConfigurationListType instrumentConfigurationList;
    @XmlElement(required = true)
    protected DataProcessingListType dataProcessingList;
    @XmlElement(required = true)
    protected RunType run;
    @XmlAttribute(name = "accession")
    protected String accession;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the cvList property.
     * 
     * @return
     *     possible object is
     *     {@link CVListType }
     *     
     */
    public CVListType getCvList() {
        return cvList;
    }

    /**
     * Sets the value of the cvList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVListType }
     *     
     */
    public void setCvList(CVListType value) {
        this.cvList = value;
    }

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FileDescriptionType }
     *     
     */
    public FileDescriptionType getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDescriptionType }
     *     
     */
    public void setFileDescription(FileDescriptionType value) {
        this.fileDescription = value;
    }

    /**
     * Gets the value of the referenceableParamGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceableParamGroupListType }
     *     
     */
    public ReferenceableParamGroupListType getReferenceableParamGroupList() {
        return referenceableParamGroupList;
    }

    /**
     * Sets the value of the referenceableParamGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceableParamGroupListType }
     *     
     */
    public void setReferenceableParamGroupList(ReferenceableParamGroupListType value) {
        this.referenceableParamGroupList = value;
    }

    /**
     * Gets the value of the sampleList property.
     * 
     * @return
     *     possible object is
     *     {@link SampleListType }
     *     
     */
    public SampleListType getSampleList() {
        return sampleList;
    }

    /**
     * Sets the value of the sampleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleListType }
     *     
     */
    public void setSampleList(SampleListType value) {
        this.sampleList = value;
    }

    /**
     * Gets the value of the softwareList property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareListType }
     *     
     */
    public SoftwareListType getSoftwareList() {
        return softwareList;
    }

    /**
     * Sets the value of the softwareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareListType }
     *     
     */
    public void setSoftwareList(SoftwareListType value) {
        this.softwareList = value;
    }

    /**
     * Gets the value of the scanSettingsList property.
     * 
     * @return
     *     possible object is
     *     {@link ScanSettingsListType }
     *     
     */
    public ScanSettingsListType getScanSettingsList() {
        return scanSettingsList;
    }

    /**
     * Sets the value of the scanSettingsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanSettingsListType }
     *     
     */
    public void setScanSettingsList(ScanSettingsListType value) {
        this.scanSettingsList = value;
    }

    /**
     * Gets the value of the instrumentConfigurationList property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentConfigurationListType }
     *     
     */
    public InstrumentConfigurationListType getInstrumentConfigurationList() {
        return instrumentConfigurationList;
    }

    /**
     * Sets the value of the instrumentConfigurationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentConfigurationListType }
     *     
     */
    public void setInstrumentConfigurationList(InstrumentConfigurationListType value) {
        this.instrumentConfigurationList = value;
    }

    /**
     * Gets the value of the dataProcessingList property.
     * 
     * @return
     *     possible object is
     *     {@link DataProcessingListType }
     *     
     */
    public DataProcessingListType getDataProcessingList() {
        return dataProcessingList;
    }

    /**
     * Sets the value of the dataProcessingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProcessingListType }
     *     
     */
    public void setDataProcessingList(DataProcessingListType value) {
        this.dataProcessingList = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link RunType }
     *     
     */
    public RunType getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunType }
     *     
     */
    public void setRun(RunType value) {
        this.run = value;
    }

    /**
     * Gets the value of the accession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccession() {
        return accession;
    }

    /**
     * Sets the value of the accession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccession(String value) {
        this.accession = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
