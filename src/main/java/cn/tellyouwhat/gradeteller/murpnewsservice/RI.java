
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RI complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rh" type="{http://murpcn.com/murpwebservice/}ResponseHeader" minOccurs="0"/>
 *         &lt;element name="userinfo" type="{http://murpcn.com/murpwebservice/}ArrayOfMurpcustomi" minOccurs="0"/>
 *         &lt;element name="academy" type="{http://murpcn.com/murpwebservice/}ArrayOfAcademy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RI", propOrder = {
    "rh",
    "userinfo",
    "academy"
})
public class RI {

    protected ResponseHeader rh;
    protected ArrayOfMurpcustomi userinfo;
    protected ArrayOfAcademy academy;

    /**
     * ��ȡrh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getRh() {
        return rh;
    }

    /**
     * ����rh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setRh(ResponseHeader value) {
        this.rh = value;
    }

    /**
     * ��ȡuserinfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMurpcustomi }
     *     
     */
    public ArrayOfMurpcustomi getUserinfo() {
        return userinfo;
    }

    /**
     * ����userinfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMurpcustomi }
     *     
     */
    public void setUserinfo(ArrayOfMurpcustomi value) {
        this.userinfo = value;
    }

    /**
     * ��ȡacademy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAcademy }
     *     
     */
    public ArrayOfAcademy getAcademy() {
        return academy;
    }

    /**
     * ����academy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAcademy }
     *     
     */
    public void setAcademy(ArrayOfAcademy value) {
        this.academy = value;
    }

}
