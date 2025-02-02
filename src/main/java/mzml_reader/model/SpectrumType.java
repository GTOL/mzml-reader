//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.01 at 01:37:56 AM SGT 
//


package mzml_reader.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The structure that captures the generation of a peak list (including the underlying acquisitions). Also describes some of the parameters for the mass spectrometer for a given acquisition (or list of acquisitions).
 * 
 * <p>Java class for SpectrumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpectrumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/ms/mzml}ParamGroupType">
 *       &lt;sequence>
 *         &lt;element name="scanList" type="{http://psi.hupo.org/ms/mzml}ScanListType" minOccurs="0"/>
 *         &lt;element name="precursorList" type="{http://psi.hupo.org/ms/mzml}PrecursorListType" minOccurs="0"/>
 *         &lt;element name="productList" type="{http://psi.hupo.org/ms/mzml}ProductListType" minOccurs="0"/>
 *         &lt;element name="binaryDataArrayList" type="{http://psi.hupo.org/ms/mzml}BinaryDataArrayListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="\S+=\S+( \S+=\S+)*"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="spotID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="defaultArrayLength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dataProcessingRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="sourceFileRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpectrumType", propOrder = {
    "scanList",
    "precursorList",
    "productList",
    "binaryDataArrayList"
})
public class SpectrumType
    extends ParamGroupType
{

    protected ScanListType scanList;
    protected PrecursorListType precursorList;
    protected ProductListType productList;
    protected BinaryDataArrayListType binaryDataArrayList;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "spotID")
    protected String spotID;
    @XmlAttribute(name = "index", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger index;
    @XmlAttribute(name = "defaultArrayLength", required = true)
    protected int defaultArrayLength;
    @XmlAttribute(name = "dataProcessingRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object dataProcessingRef;
    @XmlAttribute(name = "sourceFileRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sourceFileRef;

    /**
     * Gets the value of the scanList property.
     * 
     * @return
     *     possible object is
     *     {@link ScanListType }
     *     
     */
    public ScanListType getScanList() {
        return scanList;
    }

    /**
     * Sets the value of the scanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanListType }
     *     
     */
    public void setScanList(ScanListType value) {
        this.scanList = value;
    }

    /**
     * Gets the value of the precursorList property.
     * 
     * @return
     *     possible object is
     *     {@link PrecursorListType }
     *     
     */
    public PrecursorListType getPrecursorList() {
        return precursorList;
    }

    /**
     * Sets the value of the precursorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecursorListType }
     *     
     */
    public void setPrecursorList(PrecursorListType value) {
        this.precursorList = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductListType }
     *     
     */
    public ProductListType getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductListType }
     *     
     */
    public void setProductList(ProductListType value) {
        this.productList = value;
    }

    /**
     * Gets the value of the binaryDataArrayList property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryDataArrayListType }
     *     
     */
    public BinaryDataArrayListType getBinaryDataArrayList() {
        return binaryDataArrayList;
    }

    /**
     * Sets the value of the binaryDataArrayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryDataArrayListType }
     *     
     */
    public void setBinaryDataArrayList(BinaryDataArrayListType value) {
        this.binaryDataArrayList = value;
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

    /**
     * Gets the value of the spotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpotID() {
        return spotID;
    }

    /**
     * Sets the value of the spotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpotID(String value) {
        this.spotID = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the defaultArrayLength property.
     * 
     */
    public int getDefaultArrayLength() {
        return defaultArrayLength;
    }

    /**
     * Sets the value of the defaultArrayLength property.
     * 
     */
    public void setDefaultArrayLength(int value) {
        this.defaultArrayLength = value;
    }

    /**
     * Gets the value of the dataProcessingRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataProcessingRef() {
        return dataProcessingRef;
    }

    /**
     * Sets the value of the dataProcessingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDataProcessingRef(Object value) {
        this.dataProcessingRef = value;
    }

    /**
     * Gets the value of the sourceFileRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSourceFileRef() {
        return sourceFileRef;
    }

    /**
     * Sets the value of the sourceFileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSourceFileRef(Object value) {
        this.sourceFileRef = value;
    }

}
