
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Specility complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡspecilityCode���Ե�ֵ��
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
     * ����specilityCode���Ե�ֵ��
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
     * ��ȡspecilityName���Ե�ֵ��
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
     * ����specilityName���Ե�ֵ��
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
     * ��ȡcla���Ե�ֵ��
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
     * ����cla���Ե�ֵ��
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
