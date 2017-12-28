
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="umcid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentlist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qd_tid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "umcid",
    "studentlist",
    "qdTid"
})
@XmlRootElement(name = "Checkin_dm_plqd")
public class CheckinDmPlqd {

    protected String umcid;
    protected String studentlist;
    @XmlElement(name = "qd_tid")
    protected String qdTid;

    /**
     * 获取umcid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmcid() {
        return umcid;
    }

    /**
     * 设置umcid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmcid(String value) {
        this.umcid = value;
    }

    /**
     * 获取studentlist属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentlist() {
        return studentlist;
    }

    /**
     * 设置studentlist属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentlist(String value) {
        this.studentlist = value;
    }

    /**
     * 获取qdTid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdTid() {
        return qdTid;
    }

    /**
     * 设置qdTid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdTid(String value) {
        this.qdTid = value;
    }

}
