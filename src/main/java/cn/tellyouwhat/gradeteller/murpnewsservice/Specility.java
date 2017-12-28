
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Specility complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Specility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cla" type="{http://murpcn.com/murpwebservice/}ArrayOfClasses" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specility", propOrder = {
    "specilityCode",
    "specilityName",
    "cla"
})
public class Specility {

    @XmlElement(name = "SpecilityCode")
    protected String specilityCode;
    @XmlElement(name = "SpecilityName")
    protected String specilityName;
    @XmlElement(name = "Cla")
    protected ArrayOfClasses cla;

    /**
     * 获取specilityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecilityCode() {
        return specilityCode;
    }

    /**
     * 设置specilityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecilityCode(String value) {
        this.specilityCode = value;
    }

    /**
     * 获取specilityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecilityName() {
        return specilityName;
    }

    /**
     * 设置specilityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecilityName(String value) {
        this.specilityName = value;
    }

    /**
     * 获取cla属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClasses }
     *     
     */
    public ArrayOfClasses getCla() {
        return cla;
    }

    /**
     * 设置cla属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClasses }
     *     
     */
    public void setCla(ArrayOfClasses value) {
        this.cla = value;
    }

}
