
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PublicStruct complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PublicStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="myPs" type="{http://murpcn.com/murpwebservice/}ArrayOfPublicStruct" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XiaoLi_JieCi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XiaoLi_ShiJian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XiaoLi_XueNian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XiaoLi_Count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XiaoLi_TermStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kcid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupancy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lesson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Teacher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeacherId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classroom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Week" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Begintime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weeknum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qdztid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extend14" type="{http://murpcn.com/murpwebservice/}ArrayOfPublicInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicStruct", propOrder = {
    "myPs",
    "id",
    "xiaoLiJieCi",
    "xiaoLiShiJian",
    "xiaoLiXueNian",
    "xiaoLiCount",
    "xiaoLiTermStart",
    "kcid",
    "occupancy",
    "lesson",
    "teacher",
    "teacherId",
    "classroom",
    "week",
    "begintime",
    "endtime",
    "bid",
    "bname",
    "weeknum",
    "state",
    "qdztid",
    "extend1",
    "extend2",
    "extend3",
    "extend4",
    "extend5",
    "extend6",
    "extend7",
    "extend8",
    "extend9",
    "extend10",
    "extend11",
    "extend12",
    "extend13",
    "extend14"
})
public class PublicStruct {

    protected ArrayOfPublicStruct myPs;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "XiaoLi_JieCi")
    protected String xiaoLiJieCi;
    @XmlElement(name = "XiaoLi_ShiJian")
    protected String xiaoLiShiJian;
    @XmlElement(name = "XiaoLi_XueNian")
    protected String xiaoLiXueNian;
    @XmlElement(name = "XiaoLi_Count")
    protected String xiaoLiCount;
    @XmlElement(name = "XiaoLi_TermStart")
    protected String xiaoLiTermStart;
    @XmlElement(name = "Kcid")
    protected String kcid;
    @XmlElement(name = "Occupancy")
    protected String occupancy;
    @XmlElement(name = "Lesson")
    protected String lesson;
    @XmlElement(name = "Teacher")
    protected String teacher;
    @XmlElement(name = "TeacherId")
    protected String teacherId;
    @XmlElement(name = "Classroom")
    protected String classroom;
    @XmlElement(name = "Week")
    protected String week;
    @XmlElement(name = "Begintime")
    protected String begintime;
    @XmlElement(name = "Endtime")
    protected String endtime;
    @XmlElement(name = "Bid")
    protected String bid;
    @XmlElement(name = "Bname")
    protected String bname;
    @XmlElement(name = "Weeknum")
    protected String weeknum;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Qdztid")
    protected String qdztid;
    @XmlElement(name = "Extend1")
    protected String extend1;
    @XmlElement(name = "Extend2")
    protected String extend2;
    @XmlElement(name = "Extend3")
    protected String extend3;
    @XmlElement(name = "Extend4")
    protected String extend4;
    @XmlElement(name = "Extend5")
    protected String extend5;
    @XmlElement(name = "Extend6")
    protected String extend6;
    @XmlElement(name = "Extend7")
    protected String extend7;
    @XmlElement(name = "Extend8")
    protected String extend8;
    @XmlElement(name = "Extend9")
    protected String extend9;
    @XmlElement(name = "Extend10")
    protected String extend10;
    @XmlElement(name = "Extend11")
    protected String extend11;
    @XmlElement(name = "Extend12")
    protected String extend12;
    @XmlElement(name = "Extend13")
    protected String extend13;
    @XmlElement(name = "Extend14")
    protected ArrayOfPublicInfo extend14;

    /**
     * ��ȡmyPs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public ArrayOfPublicStruct getMyPs() {
        return myPs;
    }

    /**
     * ����myPs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublicStruct }
     *     
     */
    public void setMyPs(ArrayOfPublicStruct value) {
        this.myPs = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * ��ȡxiaoLiJieCi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXiaoLiJieCi() {
        return xiaoLiJieCi;
    }

    /**
     * ����xiaoLiJieCi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXiaoLiJieCi(String value) {
        this.xiaoLiJieCi = value;
    }

    /**
     * ��ȡxiaoLiShiJian���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXiaoLiShiJian() {
        return xiaoLiShiJian;
    }

    /**
     * ����xiaoLiShiJian���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXiaoLiShiJian(String value) {
        this.xiaoLiShiJian = value;
    }

    /**
     * ��ȡxiaoLiXueNian���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXiaoLiXueNian() {
        return xiaoLiXueNian;
    }

    /**
     * ����xiaoLiXueNian���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXiaoLiXueNian(String value) {
        this.xiaoLiXueNian = value;
    }

    /**
     * ��ȡxiaoLiCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXiaoLiCount() {
        return xiaoLiCount;
    }

    /**
     * ����xiaoLiCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXiaoLiCount(String value) {
        this.xiaoLiCount = value;
    }

    /**
     * ��ȡxiaoLiTermStart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXiaoLiTermStart() {
        return xiaoLiTermStart;
    }

    /**
     * ����xiaoLiTermStart���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXiaoLiTermStart(String value) {
        this.xiaoLiTermStart = value;
    }

    /**
     * ��ȡkcid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKcid() {
        return kcid;
    }

    /**
     * ����kcid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKcid(String value) {
        this.kcid = value;
    }

    /**
     * ��ȡoccupancy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupancy() {
        return occupancy;
    }

    /**
     * ����occupancy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupancy(String value) {
        this.occupancy = value;
    }

    /**
     * ��ȡlesson���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLesson() {
        return lesson;
    }

    /**
     * ����lesson���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLesson(String value) {
        this.lesson = value;
    }

    /**
     * ��ȡteacher���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * ����teacher���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeacher(String value) {
        this.teacher = value;
    }

    /**
     * ��ȡteacherId���Ե�ֵ��
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
     * ����teacherId���Ե�ֵ��
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
     * ��ȡclassroom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassroom() {
        return classroom;
    }

    /**
     * ����classroom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassroom(String value) {
        this.classroom = value;
    }

    /**
     * ��ȡweek���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeek() {
        return week;
    }

    /**
     * ����week���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeek(String value) {
        this.week = value;
    }

    /**
     * ��ȡbegintime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegintime() {
        return begintime;
    }

    /**
     * ����begintime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegintime(String value) {
        this.begintime = value;
    }

    /**
     * ��ȡendtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * ����endtime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndtime(String value) {
        this.endtime = value;
    }

    /**
     * ��ȡbid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBid() {
        return bid;
    }

    /**
     * ����bid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBid(String value) {
        this.bid = value;
    }

    /**
     * ��ȡbname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBname() {
        return bname;
    }

    /**
     * ����bname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBname(String value) {
        this.bname = value;
    }

    /**
     * ��ȡweeknum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeknum() {
        return weeknum;
    }

    /**
     * ����weeknum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeknum(String value) {
        this.weeknum = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * ��ȡqdztid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdztid() {
        return qdztid;
    }

    /**
     * ����qdztid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdztid(String value) {
        this.qdztid = value;
    }

    /**
     * ��ȡextend1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * ����extend1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend1(String value) {
        this.extend1 = value;
    }

    /**
     * ��ȡextend2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * ����extend2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend2(String value) {
        this.extend2 = value;
    }

    /**
     * ��ȡextend3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend3() {
        return extend3;
    }

    /**
     * ����extend3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend3(String value) {
        this.extend3 = value;
    }

    /**
     * ��ȡextend4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend4() {
        return extend4;
    }

    /**
     * ����extend4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend4(String value) {
        this.extend4 = value;
    }

    /**
     * ��ȡextend5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend5() {
        return extend5;
    }

    /**
     * ����extend5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend5(String value) {
        this.extend5 = value;
    }

    /**
     * ��ȡextend6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend6() {
        return extend6;
    }

    /**
     * ����extend6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend6(String value) {
        this.extend6 = value;
    }

    /**
     * ��ȡextend7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend7() {
        return extend7;
    }

    /**
     * ����extend7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend7(String value) {
        this.extend7 = value;
    }

    /**
     * ��ȡextend8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend8() {
        return extend8;
    }

    /**
     * ����extend8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend8(String value) {
        this.extend8 = value;
    }

    /**
     * ��ȡextend9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend9() {
        return extend9;
    }

    /**
     * ����extend9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend9(String value) {
        this.extend9 = value;
    }

    /**
     * ��ȡextend10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend10() {
        return extend10;
    }

    /**
     * ����extend10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend10(String value) {
        this.extend10 = value;
    }

    /**
     * ��ȡextend11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend11() {
        return extend11;
    }

    /**
     * ����extend11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend11(String value) {
        this.extend11 = value;
    }

    /**
     * ��ȡextend12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend12() {
        return extend12;
    }

    /**
     * ����extend12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend12(String value) {
        this.extend12 = value;
    }

    /**
     * ��ȡextend13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtend13() {
        return extend13;
    }

    /**
     * ����extend13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtend13(String value) {
        this.extend13 = value;
    }

    /**
     * ��ȡextend14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPublicInfo }
     *     
     */
    public ArrayOfPublicInfo getExtend14() {
        return extend14;
    }

    /**
     * ����extend14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPublicInfo }
     *     
     */
    public void setExtend14(ArrayOfPublicInfo value) {
        this.extend14 = value;
    }

}
