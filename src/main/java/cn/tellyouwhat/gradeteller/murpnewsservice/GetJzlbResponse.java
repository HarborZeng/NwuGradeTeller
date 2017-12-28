
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
 *         &lt;element name="GetJzlbResult" type="{http://murpcn.com/murpwebservice/}ArrayOfPublicStruct" minOccurs="0"/>
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
    "getJzlbResult"
})
@XmlRootElement(name = "GetJzlbResponse")
public class GetJzlbResponse {

    @XmlElement(name = "GetJzlbResult")
    protected ArrayOfPublicStruct getJzlbResult;

    /**
     * 获取getJzlbResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public ArrayOfPublicStruct getGetJzlbResult() {
        return getJzlbResult;
    }

    /**
     * 设置getJzlbResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public void setGetJzlbResult(ArrayOfPublicStruct value) {
        this.getJzlbResult = value;
    }

}
