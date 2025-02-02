//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 01:37:56 AM SGT 
//


package mzml_reader.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://psi.hupo.org/ms/mzml}mzML"/>
 *         &lt;element name="indexList" type="{http://psi.hupo.org/ms/mzml}IndexListType"/>
 *         &lt;element name="indexListOffset" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fileChecksum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mzML",
    "indexList",
    "indexListOffset",
    "fileChecksum"
})
@XmlRootElement(name = "indexedmzML")
public class IndexedmzML {

    @XmlElement(required = true)
    protected MzMLType mzML;
    @XmlElement(required = true)
    protected IndexListType indexList;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long indexListOffset;
    @XmlElement(required = true)
    protected String fileChecksum;

    /**
     * Gets the value of the mzML property.
     * 
     * @return
     *     possible object is
     *     {@link MzMLType }
     *     
     */
    public MzMLType getMzML() {
        return mzML;
    }

    /**
     * Sets the value of the mzML property.
     * 
     * @param value
     *     allowed object is
     *     {@link MzMLType }
     *     
     */
    public void setMzML(MzMLType value) {
        this.mzML = value;
    }

    /**
     * Gets the value of the indexList property.
     * 
     * @return
     *     possible object is
     *     {@link IndexListType }
     *     
     */
    public IndexListType getIndexList() {
        return indexList;
    }

    /**
     * Sets the value of the indexList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexListType }
     *     
     */
    public void setIndexList(IndexListType value) {
        this.indexList = value;
    }

    /**
     * Gets the value of the indexListOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndexListOffset() {
        return indexListOffset;
    }

    /**
     * Sets the value of the indexListOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndexListOffset(Long value) {
        this.indexListOffset = value;
    }

    /**
     * Gets the value of the fileChecksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileChecksum() {
        return fileChecksum;
    }

    /**
     * Sets the value of the fileChecksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileChecksum(String value) {
        this.fileChecksum = value;
    }

}
