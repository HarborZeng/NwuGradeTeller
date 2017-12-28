
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Academy complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Academy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spe" type="{http://murpcn.com/murpwebservice/}ArrayOfSpecility" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Academy", propOrder = {
    "academyCode",
    "academyName",
    "spe"
})
public class Academy {

    @XmlElement(name = "AcademyCode")
    protected String academyCode;
    @XmlElement(name = "AcademyName")
    protected String academyName;
    protected ArrayOfSpecility spe;

    /**
     * ��ȡacademyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademyCode() {
        return academyCode;
    }

    /**
     * ����academyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademyCode(String value) {
        this.academyCode = value;
    }

    /**
     * ��ȡacademyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademyName() {
        return academyName;
    }

    /**
     * ����academyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademyName(String value) {
        this.academyName = value;
    }

    /**
     * ��ȡspe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecility }
     *     
     */
    public ArrayOfSpecility getSpe() {
        return spe;
    }

    /**
     * ����spe���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecility }
     *     
     */
    public void setSpe(ArrayOfSpecility value) {
        this.spe = value;
    }

}
