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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Description of the acquisition settings of the instrument prior to the start of the run.
 * 
 * <p>Java class for ScanSettingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanSettingsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/ms/mzml}ParamGroupType">
 *       &lt;sequence>
 *         &lt;element name="sourceFileRefList" type="{http://psi.hupo.org/ms/mzml}SourceFileRefListType" minOccurs="0"/>
 *         &lt;element name="targetList" type="{http://psi.hupo.org/ms/mzml}TargetListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanSettingsType", propOrder = {
    "sourceFileRefList",
    "targetList"
})
public class ScanSettingsType
    extends ParamGroupType
{

    protected SourceFileRefListType sourceFileRefList;
    protected TargetListType targetList;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the sourceFileRefList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceFileRefListType }
     *     
     */
    public SourceFileRefListType getSourceFileRefList() {
        return sourceFileRefList;
    }

    /**
     * Sets the value of the sourceFileRefList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceFileRefListType }
     *     
     */
    public void setSourceFileRefList(SourceFileRefListType value) {
        this.sourceFileRefList = value;
    }

    /**
     * Gets the value of the targetList property.
     * 
     * @return
     *     possible object is
     *     {@link TargetListType }
     *     
     */
    public TargetListType getTargetList() {
        return targetList;
    }

    /**
     * Sets the value of the targetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetListType }
     *     
     */
    public void setTargetList(TargetListType value) {
        this.targetList = value;
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
