
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
 *         &lt;element name="GetASListResult" type="{http://murpcn.com/murpwebservice/}RI" minOccurs="0"/>
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
    "getASListResult"
})
@XmlRootElement(name = "GetASListResponse")
public class GetASListResponse {

    @XmlElement(name = "GetASListResult")
    protected RI getASListResult;

    /**
     * ��ȡgetASListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RI }
     *     
     */
    public RI getGetASListResult() {
        return getASListResult;
    }

    /**
     * ����getASListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RI }
     *     
     */
    public void setGetASListResult(RI value) {
        this.getASListResult = value;
    }

}
