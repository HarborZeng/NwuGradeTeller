
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
 *         &lt;element name="mcid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "mcid",
    "page"
})
@XmlRootElement(name = "GetDeptPhoneByPage_S")
public class GetDeptPhoneByPageS {

    protected int mcid;
    protected int page;

    /**
     * 获取mcid属性的值。
     * 
     */
    public int getMcid() {
        return mcid;
    }

    /**
     * 设置mcid属性的值。
     * 
     */
    public void setMcid(int value) {
        this.mcid = value;
    }

    /**
     * 获取page属性的值。
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * 设置page属性的值。
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
