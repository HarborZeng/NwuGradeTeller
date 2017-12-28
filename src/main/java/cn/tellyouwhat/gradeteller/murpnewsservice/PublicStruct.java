
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PublicStruct complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取myPs属性的值。
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
     * 设置myPs属性的值。
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
     * 获取id属性的值。
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
     * 设置id属性的值。
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
     * 获取xiaoLiJieCi属性的值。
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
     * 设置xiaoLiJieCi属性的值。
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
     * 获取xiaoLiShiJian属性的值。
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
     * 设置xiaoLiShiJian属性的值。
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
     * 获取xiaoLiXueNian属性的值。
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
     * 设置xiaoLiXueNian属性的值。
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
     * 获取xiaoLiCount属性的值。
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
     * 设置xiaoLiCount属性的值。
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
     * 获取xiaoLiTermStart属性的值。
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
     * 设置xiaoLiTermStart属性的值。
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
     * 获取kcid属性的值。
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
     * 设置kcid属性的值。
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
     * 获取occupancy属性的值。
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
     * 设置occupancy属性的值。
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
     * 获取lesson属性的值。
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
     * 设置lesson属性的值。
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
     * 获取teacher属性的值。
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
     * 设置teacher属性的值。
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
     * 获取classroom属性的值。
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
     * 设置classroom属性的值。
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
     * 获取week属性的值。
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
     * 设置week属性的值。
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
     * 获取begintime属性的值。
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
     * 设置begintime属性的值。
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
     * 获取endtime属性的值。
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
     * 设置endtime属性的值。
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
     * 获取bid属性的值。
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
     * 设置bid属性的值。
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
     * 获取bname属性的值。
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
     * 设置bname属性的值。
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
     * 获取weeknum属性的值。
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
     * 设置weeknum属性的值。
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
     * 获取state属性的值。
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
     * 设置state属性的值。
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
     * 获取qdztid属性的值。
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
     * 设置qdztid属性的值。
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
     * 获取extend1属性的值。
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
     * 设置extend1属性的值。
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
     * 获取extend2属性的值。
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
     * 设置extend2属性的值。
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
     * 获取extend3属性的值。
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
     * 设置extend3属性的值。
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
     * 获取extend4属性的值。
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
     * 设置extend4属性的值。
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
     * 获取extend5属性的值。
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
     * 设置extend5属性的值。
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
     * 获取extend6属性的值。
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
     * 设置extend6属性的值。
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
     * 获取extend7属性的值。
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
     * 设置extend7属性的值。
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
     * 获取extend8属性的值。
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
     * 设置extend8属性的值。
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
     * 获取extend9属性的值。
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
     * 设置extend9属性的值。
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
     * 获取extend10属性的值。
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
     * 设置extend10属性的值。
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
     * 获取extend11属性的值。
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
     * 设置extend11属性的值。
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
     * 获取extend12属性的值。
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
     * 设置extend12属性的值。
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
     * 获取extend13属性的值。
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
     * 设置extend13属性的值。
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
     * 获取extend14属性的值。
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
     * 设置extend14属性的值。
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
