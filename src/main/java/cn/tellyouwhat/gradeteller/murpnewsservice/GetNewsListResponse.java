
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetNewsListResult" type="{http://murpcn.com/murpwebservice/}ArrayOfPublicStruct" minOccurs="0"/>
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
    "getNewsListResult"
})
@XmlRootElement(name = "GetNewsListResponse")
public class GetNewsListResponse {

    @XmlElement(name = "GetNewsListResult")
    protected ArrayOfPublicStruct getNewsListResult;

    /**
     * ��ȡgetNewsListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public ArrayOfPublicStruct getGetNewsListResult() {
        return getNewsListResult;
    }

    /**
     * ����getNewsListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public void setGetNewsListResult(ArrayOfPublicStruct value) {
        this.getNewsListResult = value;
    }

}
