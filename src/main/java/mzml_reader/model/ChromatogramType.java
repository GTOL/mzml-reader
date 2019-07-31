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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A single chromatogram.
 * 
 * <p>Java class for ChromatogramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChromatogramType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/ms/mzml}ParamGroupType">
 *       &lt;sequence>
 *         &lt;element name="precursor" type="{http://psi.hupo.org/ms/mzml}PrecursorType" minOccurs="0"/>
 *         &lt;element name="product" type="{http://psi.hupo.org/ms/mzml}ProductType" minOccurs="0"/>
 *         &lt;element name="binaryDataArrayList" type="{http://psi.hupo.org/ms/mzml}BinaryDataArrayListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="defaultArrayLength" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dataProcessingRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChromatogramType", propOrder = {
    "precursor",
    "product",
    "binaryDataArrayList"
})
public class ChromatogramType
    extends ParamGroupType
{

    protected PrecursorType precursor;
    protected ProductType product;
    @XmlElement(required = true)
    protected BinaryDataArrayListType binaryDataArrayList;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "index", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger index;
    @XmlAttribute(name = "defaultArrayLength", required = true)
    protected int defaultArrayLength;
    @XmlAttribute(name = "dataProcessingRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object dataProcessingRef;

    /**
     * Gets the value of the precursor property.
     * 
     * @return
     *     possible object is
     *     {@link PrecursorType }
     *     
     */
    public PrecursorType getPrecursor() {
        return precursor;
    }

    /**
     * Sets the value of the precursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecursorType }
     *     
     */
    public void setPrecursor(PrecursorType value) {
        this.precursor = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
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

}
