
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
 *         &lt;element name="GetDeptPhoneByPage_SResult" type="{http://murpcn.com/murpwebservice/}ArrayOfGroupName" minOccurs="0"/>
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
    "getDeptPhoneByPageSResult"
})
@XmlRootElement(name = "GetDeptPhoneByPage_SResponse")
public class GetDeptPhoneByPageSResponse {

    @XmlElement(name = "GetDeptPhoneByPage_SResult")
    protected ArrayOfGroupName getDeptPhoneByPageSResult;

    /**
     * ��ȡgetDeptPhoneByPageSResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroupName }
     *     
     */
    public ArrayOfGroupName getGetDeptPhoneByPageSResult() {
        return getDeptPhoneByPageSResult;
    }

    /**
     * ����getDeptPhoneByPageSResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroupName }
     *     
     */
    public void setGetDeptPhoneByPageSResult(ArrayOfGroupName value) {
        this.getDeptPhoneByPageSResult = value;
    }

}
