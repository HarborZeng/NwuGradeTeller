
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GroupName complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GroupName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="intr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupName", propOrder = {
    "bname",
    "bid",
    "intr"
})
public class GroupName {

    protected String bname;
    protected int bid;
    protected String intr;

    /**
     * 获取bname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBname() {
        return bname;
    }

    /**
     * 设置bname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBname(String value) {
        this.bname = value;
    }

    /**
     * 获取bid属性的值。
     * 
     */
    public int getBid() {
        return bid;
    }

    /**
     * 设置bid属性的值。
     * 
     */
    public void setBid(int value) {
        this.bid = value;
    }

    /**
     * 获取intr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntr() {
        return intr;
    }

    /**
     * 设置intr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntr(String value) {
        this.intr = value;
    }

}
