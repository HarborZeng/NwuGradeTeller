
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Prog complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Prog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sfyx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="djksyq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mxdx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xzdx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sfbk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="describe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ch" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sfzh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sfjf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yzkzh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prog", propOrder = {
    "mc",
    "lb",
    "zh",
    "sfyx",
    "djksyq",
    "mxdx",
    "xzdx",
    "bz",
    "sfbk",
    "lname",
    "lid",
    "describe",
    "ch",
    "sfzh",
    "sfjf",
    "yzkzh"
})
public class Prog {

    protected String mc;
    protected String lb;
    protected String zh;
    protected String sfyx;
    protected String djksyq;
    protected String mxdx;
    protected String xzdx;
    protected String bz;
    protected String sfbk;
    protected String lname;
    protected String lid;
    protected String describe;
    protected double ch;
    protected String sfzh;
    protected String sfjf;
    protected String yzkzh;

    /**
     * 获取mc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMc() {
        return mc;
    }

    /**
     * 设置mc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMc(String value) {
        this.mc = value;
    }

    /**
     * 获取lb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLb() {
        return lb;
    }

    /**
     * 设置lb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLb(String value) {
        this.lb = value;
    }

    /**
     * 获取zh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZh() {
        return zh;
    }

    /**
     * 设置zh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZh(String value) {
        this.zh = value;
    }

    /**
     * 获取sfyx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfyx() {
        return sfyx;
    }

    /**
     * 设置sfyx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfyx(String value) {
        this.sfyx = value;
    }

    /**
     * 获取djksyq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDjksyq() {
        return djksyq;
    }

    /**
     * 设置djksyq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDjksyq(String value) {
        this.djksyq = value;
    }

    /**
     * 获取mxdx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMxdx() {
        return mxdx;
    }

    /**
     * 设置mxdx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMxdx(String value) {
        this.mxdx = value;
    }

    /**
     * 获取xzdx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXzdx() {
        return xzdx;
    }

    /**
     * 设置xzdx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXzdx(String value) {
        this.xzdx = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBz() {
        return bz;
    }

    /**
     * 设置bz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBz(String value) {
        this.bz = value;
    }

    /**
     * 获取sfbk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfbk() {
        return sfbk;
    }

    /**
     * 设置sfbk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfbk(String value) {
        this.sfbk = value;
    }

    /**
     * 获取lname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLname() {
        return lname;
    }

    /**
     * 设置lname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLname(String value) {
        this.lname = value;
    }

    /**
     * 获取lid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLid() {
        return lid;
    }

    /**
     * 设置lid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLid(String value) {
        this.lid = value;
    }

    /**
     * 获取describe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置describe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescribe(String value) {
        this.describe = value;
    }

    /**
     * 获取ch属性的值。
     * 
     */
    public double getCh() {
        return ch;
    }

    /**
     * 设置ch属性的值。
     * 
     */
    public void setCh(double value) {
        this.ch = value;
    }

    /**
     * 获取sfzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzh() {
        return sfzh;
    }

    /**
     * 设置sfzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzh(String value) {
        this.sfzh = value;
    }

    /**
     * 获取sfjf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfjf() {
        return sfjf;
    }

    /**
     * 设置sfjf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfjf(String value) {
        this.sfjf = value;
    }

    /**
     * 获取yzkzh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzkzh() {
        return yzkzh;
    }

    /**
     * 设置yzkzh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzkzh(String value) {
        this.yzkzh = value;
    }

}
