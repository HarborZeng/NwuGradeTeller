
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
 *         &lt;element name="lesson_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lesson_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jxb_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jxb_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="teacher_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="teacher_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lessonId",
    "lessonName",
    "jxbId",
    "jxbName",
    "teacherId",
    "teacherName",
    "jc",
    "dd"
})
@XmlRootElement(name = "GetqdAuthCode")
public class GetqdAuthCode {

    @XmlElement(name = "lesson_id")
    protected String lessonId;
    @XmlElement(name = "lesson_name")
    protected String lessonName;
    @XmlElement(name = "jxb_id")
    protected String jxbId;
    @XmlElement(name = "jxb_name")
    protected String jxbName;
    @XmlElement(name = "teacher_id")
    protected String teacherId;
    @XmlElement(name = "teacher_name")
    protected String teacherName;
    protected String jc;
    protected String dd;

    /**
     * 获取lessonId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLessonId() {
        return lessonId;
    }

    /**
     * 设置lessonId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLessonId(String value) {
        this.lessonId = value;
    }

    /**
     * 获取lessonName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLessonName() {
        return lessonName;
    }

    /**
     * 设置lessonName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLessonName(String value) {
        this.lessonName = value;
    }

    /**
     * 获取jxbId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJxbId() {
        return jxbId;
    }

    /**
     * 设置jxbId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJxbId(String value) {
        this.jxbId = value;
    }

    /**
     * 获取jxbName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJxbName() {
        return jxbName;
    }

    /**
     * 设置jxbName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJxbName(String value) {
        this.jxbName = value;
    }

    /**
     * 获取teacherId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * 设置teacherId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeacherId(String value) {
        this.teacherId = value;
    }

    /**
     * 获取teacherName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置teacherName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeacherName(String value) {
        this.teacherName = value;
    }

    /**
     * 获取jc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJc() {
        return jc;
    }

    /**
     * 设置jc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJc(String value) {
        this.jc = value;
    }

    /**
     * 获取dd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDd() {
        return dd;
    }

    /**
     * 设置dd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDd(String value) {
        this.dd = value;
    }

}
