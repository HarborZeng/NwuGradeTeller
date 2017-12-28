
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="kcid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weeknum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="week" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jieci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xnxq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "kcid",
    "bid",
    "weeknum",
    "week",
    "jieci",
    "xnxq"
})
@XmlRootElement(name = "DmStuGetState")
public class DmStuGetState {

    protected String umcid;
    protected String kcid;
    protected String bid;
    protected String weeknum;
    protected String week;
    protected String jieci;
    protected String xnxq;

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
     * 获取kcid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKcid() {
        return kcid;
    }

    /**
     * 设置kcid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKcid(String value) {
        this.kcid = value;
    }

    /**
     * 获取bid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBid() {
        return bid;
    }

    /**
     * 设置bid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBid(String value) {
        this.bid = value;
    }

    /**
     * 获取weeknum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeknum() {
        return weeknum;
    }

    /**
     * 设置weeknum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeknum(String value) {
        this.weeknum = value;
    }

    /**
     * 获取week属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeek() {
        return week;
    }

    /**
     * 设置week属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeek(String value) {
        this.week = value;
    }

    /**
     * 获取jieci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJieci() {
        return jieci;
    }

    /**
     * 设置jieci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJieci(String value) {
        this.jieci = value;
    }

    /**
     * 获取xnxq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXnxq() {
        return xnxq;
    }

    /**
     * 设置xnxq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXnxq(String value) {
        this.xnxq = value;
    }

}
