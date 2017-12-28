
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
 *         &lt;element name="umcid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jsmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "jsmc"
})
@XmlRootElement(name = "ClassroomNextday")
public class ClassroomNextday {

    protected int umcid;
    protected String jsmc;

    /**
     * 获取umcid属性的值。
     * 
     */
    public int getUmcid() {
        return umcid;
    }

    /**
     * 设置umcid属性的值。
     * 
     */
    public void setUmcid(int value) {
        this.umcid = value;
    }

    /**
     * 获取jsmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsmc() {
        return jsmc;
    }

    /**
     * 设置jsmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsmc(String value) {
        this.jsmc = value;
    }

}
