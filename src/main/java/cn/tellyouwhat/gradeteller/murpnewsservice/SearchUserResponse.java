
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
 *         &lt;element name="SearchUserResult" type="{http://murpcn.com/murpwebservice/}RI" minOccurs="0"/>
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
    "searchUserResult"
})
@XmlRootElement(name = "SearchUserResponse")
public class SearchUserResponse {

    @XmlElement(name = "SearchUserResult")
    protected RI searchUserResult;

    /**
     * ��ȡsearchUserResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RI }
     *     
     */
    public RI getSearchUserResult() {
        return searchUserResult;
    }

    /**
     * ����searchUserResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RI }
     *     
     */
    public void setSearchUserResult(RI value) {
        this.searchUserResult = value;
    }

}
