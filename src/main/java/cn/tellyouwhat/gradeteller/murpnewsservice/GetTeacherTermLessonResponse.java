
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
 *         &lt;element name="GetTeacherTermLessonResult" type="{http://murpcn.com/murpwebservice/}ArrayOfPublicStruct" minOccurs="0"/>
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
    "getTeacherTermLessonResult"
})
@XmlRootElement(name = "GetTeacherTermLessonResponse")
public class GetTeacherTermLessonResponse {

    @XmlElement(name = "GetTeacherTermLessonResult")
    protected ArrayOfPublicStruct getTeacherTermLessonResult;

    /**
     * ��ȡgetTeacherTermLessonResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public ArrayOfPublicStruct getGetTeacherTermLessonResult() {
        return getTeacherTermLessonResult;
    }

    /**
     * ����getTeacherTermLessonResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public void setGetTeacherTermLessonResult(ArrayOfPublicStruct value) {
        this.getTeacherTermLessonResult = value;
    }

}
