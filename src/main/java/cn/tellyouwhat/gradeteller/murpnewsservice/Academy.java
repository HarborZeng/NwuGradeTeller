
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Academy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取academyCode属性的值。
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
     * 设置academyCode属性的值。
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
     * 获取academyName属性的值。
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
     * 设置academyName属性的值。
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
     * 获取spe属性的值。
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
     * 设置spe属性的值。
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
