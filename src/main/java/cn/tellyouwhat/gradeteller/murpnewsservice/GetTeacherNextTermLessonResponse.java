
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
 *         &lt;element name="GetTeacherNextTermLessonResult" type="{http://murpcn.com/murpwebservice/}ArrayOfPublicStruct" minOccurs="0"/>
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
    "getTeacherNextTermLessonResult"
})
@XmlRootElement(name = "GetTeacherNextTermLessonResponse")
public class GetTeacherNextTermLessonResponse {

    @XmlElement(name = "GetTeacherNextTermLessonResult")
    protected ArrayOfPublicStruct getTeacherNextTermLessonResult;

    /**
     * 获取getTeacherNextTermLessonResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public ArrayOfPublicStruct getGetTeacherNextTermLessonResult() {
        return getTeacherNextTermLessonResult;
    }

    /**
     * 设置getTeacherNextTermLessonResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public void setGetTeacherNextTermLessonResult(ArrayOfPublicStruct value) {
        this.getTeacherNextTermLessonResult = value;
    }

}
