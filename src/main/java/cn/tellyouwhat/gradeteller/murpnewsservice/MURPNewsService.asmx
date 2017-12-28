<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://murpcn.com/murpwebservice/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://murpcn.com/murpwebservice/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://murpcn.com/murpwebservice/">
      <s:element name="GetDmScheduList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDmScheduListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDmScheduListResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPublicStruct">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PublicStruct" nillable="true" type="tns:PublicStruct" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PublicStruct">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="myPs" type="tns:ArrayOfPublicStruct" />
          <s:element minOccurs="0" maxOccurs="1" name="Id" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XiaoLi_JieCi" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XiaoLi_ShiJian" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XiaoLi_XueNian" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XiaoLi_Count" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XiaoLi_TermStart" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Kcid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Occupancy" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Lesson" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Teacher" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TeacherId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Classroom" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Week" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Begintime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Endtime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Bid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Bname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Weeknum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="State" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Qdztid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend6" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend7" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend8" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend9" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend10" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend11" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend12" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend13" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend14" type="tns:ArrayOfPublicInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfPublicInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PublicInfo" nillable="true" type="tns:PublicInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PublicInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Extend1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Extend2" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetqdAuthCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="lesson_id" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="lesson_name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jxb_id" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jxb_name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="teacher_id" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="teacher_name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jc" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="dd" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetqdAuthCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetqdAuthCodeResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmStuGetState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="kcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="weeknum" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="week" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jieci" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xnxq" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmStuGetStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DmStuGetStateResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmTeaGetState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="kcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="weeknum" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="week" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jieci" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xnxq" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmTeaGetStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DmTeaGetStateResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Checkin_stu">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authcode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qdztid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="longitude" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="latitude" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Checkin_stuResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Checkin_stuResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseDmqd">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qdid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseDmqdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CloseDmqdResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmStatistics">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qdid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmStatisticsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DmStatisticsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Checkin_dm_plqd">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="studentlist" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qd_tid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Checkin_dm_plqdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Checkin_dm_plqdResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmResign">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="qdztid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DmResignResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DmResignResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUnsignedStu">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qdztid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bjbh" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUnsignedStuResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUnsignedStuResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetJzlb">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetJzlbResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetJzlbResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetjzAuthCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jzbh" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetjzAuthCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetjzAuthCodeResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzStuGetState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jzbh" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzStuGetStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="JzStuGetStateResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzTeaGetState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="jzbh" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzTeaGetStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="JzTeaGetStateResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="jz_checkin">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authcode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qdztid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="jz_checkinResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="jz_checkinResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseJzqd">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qdztid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseJzqdResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CloseJzqdResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzStatistics">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="qdztid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzStatisticsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="JzStatisticsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzResign">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="qdztid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="JzResignResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="JzResignResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNewsDetail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="newsId" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNewsDetailResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNewsDetailResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNewsList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="newsId" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="topNum" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNewsListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNewsListResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetScheduleList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetScheduleListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetScheduleListResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Exam">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExamResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ExamResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Mark">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MarkResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="MarkResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyGrades">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyGradesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMyGradesResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomMorning">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="jsmc" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomMorningResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClassroomMorningResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomAfternoon">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="jsmc" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomAfternoonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClassroomAfternoonResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomNight">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="jsmc" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomNightResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClassroomNightResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomDay">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="jsmc" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomDayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClassroomDayResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomNextday">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="jsmc" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomNextdayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClassroomNextdayResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomNextlesoon">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="jsmc" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClassroomNextlesoonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClassroomNextlesoonResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="StudyState">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="StudyStateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="StudyStateResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NexttermyLesson">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NexttermyLessonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="NexttermyLessonResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDeptPhoneByPage_S">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="mcid" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="page" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDeptPhoneByPage_SResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDeptPhoneByPage_SResult" type="tns:ArrayOfGroupName" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfGroupName">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="GroupName" nillable="true" type="tns:GroupName" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GroupName">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="bname" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="bid" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="intr" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="Sec">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SecResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SecResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTodayList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTodayListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTodayListResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TeacherSec">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TeacherSecResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TeacherSecResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherNextLesson">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherNextLessonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTeacherNextLessonResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherinvigilate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherinvigilateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTeacherinvigilateResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherNextTermLesson">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherNextTermLessonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTeacherNextTermLessonResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherWorkHour">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherWorkHourResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTeacherWorkHourResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Getjiaopingxinxi">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetjiaopingxinxiResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetjiaopingxinxiResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherTermLesson">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeacherTermLessonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTeacherTermLessonResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeachExamPlan">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="umcid" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTeachExamPlanResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTeachExamPlanResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchStudent">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="mcid" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="xh_or_xm" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchStudentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SearchStudentResult" type="tns:ArrayOfProg" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfProg">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Prog" nillable="true" type="tns:Prog" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Prog">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="mc" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lb" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="zh" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="sfyx" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="djksyq" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mxdx" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xzdx" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="bz" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="sfbk" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="describe" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="ch" type="s:double" />
          <s:element minOccurs="0" maxOccurs="1" name="sfzh" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="sfjf" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="yzkzh" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetLessonProgressList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="kcid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLessonProgressListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLessonProgressListResult" type="tns:ArrayOfPublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchUser">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="useraccount" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="speciality" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchUserResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SearchUserResult" type="tns:RI" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RI">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="rh" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="userinfo" type="tns:ArrayOfMurpcustomi" />
          <s:element minOccurs="0" maxOccurs="1" name="academy" type="tns:ArrayOfAcademy" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ResponseHeader">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="RCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="RMSG" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfMurpcustomi">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Murpcustomi" nillable="true" type="tns:Murpcustomi" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Murpcustomi">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="type" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dept" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="deptId" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="teacher_gh" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="studentcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tyid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="customname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="hcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="sid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="academycode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="academyname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="specialitycode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="specialityname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="begingrade" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="gender" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mcid" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfAcademy">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Academy" nillable="true" type="tns:Academy" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Academy">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="AcademyCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="AcademyName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="spe" type="tns:ArrayOfSpecility" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfSpecility">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Specility" nillable="true" type="tns:Specility" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Specility">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SpecilityCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SpecilityName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Cla" type="tns:ArrayOfClasses" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfClasses">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Classes" nillable="true" type="tns:Classes" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Classes">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ClassesCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ClassesName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetStudentListByASG">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="academycode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="specilitycode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="grade" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="classcode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetStudentListByASGResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetStudentListByASGResult" type="tns:RI" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetASList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="umcid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetASListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetASListResult" type="tns:RI" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetStudentInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="xh" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetStudentInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetStudentInfoResult" type="tns:PublicStruct" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetDmScheduListSoapIn">
    <wsdl:part name="parameters" element="tns:GetDmScheduList" />
  </wsdl:message>
  <wsdl:message name="GetDmScheduListSoapOut">
    <wsdl:part name="parameters" element="tns:GetDmScheduListResponse" />
  </wsdl:message>
  <wsdl:message name="GetqdAuthCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetqdAuthCode" />
  </wsdl:message>
  <wsdl:message name="GetqdAuthCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetqdAuthCodeResponse" />
  </wsdl:message>
  <wsdl:message name="DmStuGetStateSoapIn">
    <wsdl:part name="parameters" element="tns:DmStuGetState" />
  </wsdl:message>
  <wsdl:message name="DmStuGetStateSoapOut">
    <wsdl:part name="parameters" element="tns:DmStuGetStateResponse" />
  </wsdl:message>
  <wsdl:message name="DmTeaGetStateSoapIn">
    <wsdl:part name="parameters" element="tns:DmTeaGetState" />
  </wsdl:message>
  <wsdl:message name="DmTeaGetStateSoapOut">
    <wsdl:part name="parameters" element="tns:DmTeaGetStateResponse" />
  </wsdl:message>
  <wsdl:message name="Checkin_stuSoapIn">
    <wsdl:part name="parameters" element="tns:Checkin_stu" />
  </wsdl:message>
  <wsdl:message name="Checkin_stuSoapOut">
    <wsdl:part name="parameters" element="tns:Checkin_stuResponse" />
  </wsdl:message>
  <wsdl:message name="CloseDmqdSoapIn">
    <wsdl:part name="parameters" element="tns:CloseDmqd" />
  </wsdl:message>
  <wsdl:message name="CloseDmqdSoapOut">
    <wsdl:part name="parameters" element="tns:CloseDmqdResponse" />
  </wsdl:message>
  <wsdl:message name="DmStatisticsSoapIn">
    <wsdl:part name="parameters" element="tns:DmStatistics" />
  </wsdl:message>
  <wsdl:message name="DmStatisticsSoapOut">
    <wsdl:part name="parameters" element="tns:DmStatisticsResponse" />
  </wsdl:message>
  <wsdl:message name="Checkin_dm_plqdSoapIn">
    <wsdl:part name="parameters" element="tns:Checkin_dm_plqd" />
  </wsdl:message>
  <wsdl:message name="Checkin_dm_plqdSoapOut">
    <wsdl:part name="parameters" element="tns:Checkin_dm_plqdResponse" />
  </wsdl:message>
  <wsdl:message name="DmResignSoapIn">
    <wsdl:part name="parameters" element="tns:DmResign" />
  </wsdl:message>
  <wsdl:message name="DmResignSoapOut">
    <wsdl:part name="parameters" element="tns:DmResignResponse" />
  </wsdl:message>
  <wsdl:message name="GetUnsignedStuSoapIn">
    <wsdl:part name="parameters" element="tns:GetUnsignedStu" />
  </wsdl:message>
  <wsdl:message name="GetUnsignedStuSoapOut">
    <wsdl:part name="parameters" element="tns:GetUnsignedStuResponse" />
  </wsdl:message>
  <wsdl:message name="GetJzlbSoapIn">
    <wsdl:part name="parameters" element="tns:GetJzlb" />
  </wsdl:message>
  <wsdl:message name="GetJzlbSoapOut">
    <wsdl:part name="parameters" element="tns:GetJzlbResponse" />
  </wsdl:message>
  <wsdl:message name="GetjzAuthCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetjzAuthCode" />
  </wsdl:message>
  <wsdl:message name="GetjzAuthCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetjzAuthCodeResponse" />
  </wsdl:message>
  <wsdl:message name="JzStuGetStateSoapIn">
    <wsdl:part name="parameters" element="tns:JzStuGetState" />
  </wsdl:message>
  <wsdl:message name="JzStuGetStateSoapOut">
    <wsdl:part name="parameters" element="tns:JzStuGetStateResponse" />
  </wsdl:message>
  <wsdl:message name="JzTeaGetStateSoapIn">
    <wsdl:part name="parameters" element="tns:JzTeaGetState" />
  </wsdl:message>
  <wsdl:message name="JzTeaGetStateSoapOut">
    <wsdl:part name="parameters" element="tns:JzTeaGetStateResponse" />
  </wsdl:message>
  <wsdl:message name="jz_checkinSoapIn">
    <wsdl:part name="parameters" element="tns:jz_checkin" />
  </wsdl:message>
  <wsdl:message name="jz_checkinSoapOut">
    <wsdl:part name="parameters" element="tns:jz_checkinResponse" />
  </wsdl:message>
  <wsdl:message name="CloseJzqdSoapIn">
    <wsdl:part name="parameters" element="tns:CloseJzqd" />
  </wsdl:message>
  <wsdl:message name="CloseJzqdSoapOut">
    <wsdl:part name="parameters" element="tns:CloseJzqdResponse" />
  </wsdl:message>
  <wsdl:message name="JzStatisticsSoapIn">
    <wsdl:part name="parameters" element="tns:JzStatistics" />
  </wsdl:message>
  <wsdl:message name="JzStatisticsSoapOut">
    <wsdl:part name="parameters" element="tns:JzStatisticsResponse" />
  </wsdl:message>
  <wsdl:message name="JzResignSoapIn">
    <wsdl:part name="parameters" element="tns:JzResign" />
  </wsdl:message>
  <wsdl:message name="JzResignSoapOut">
    <wsdl:part name="parameters" element="tns:JzResignResponse" />
  </wsdl:message>
  <wsdl:message name="GetNewsDetailSoapIn">
    <wsdl:part name="parameters" element="tns:GetNewsDetail" />
  </wsdl:message>
  <wsdl:message name="GetNewsDetailSoapOut">
    <wsdl:part name="parameters" element="tns:GetNewsDetailResponse" />
  </wsdl:message>
  <wsdl:message name="GetNewsListSoapIn">
    <wsdl:part name="parameters" element="tns:GetNewsList" />
  </wsdl:message>
  <wsdl:message name="GetNewsListSoapOut">
    <wsdl:part name="parameters" element="tns:GetNewsListResponse" />
  </wsdl:message>
  <wsdl:message name="GetScheduleListSoapIn">
    <wsdl:part name="parameters" element="tns:GetScheduleList" />
  </wsdl:message>
  <wsdl:message name="GetScheduleListSoapOut">
    <wsdl:part name="parameters" element="tns:GetScheduleListResponse" />
  </wsdl:message>
  <wsdl:message name="ExamSoapIn">
    <wsdl:part name="parameters" element="tns:Exam" />
  </wsdl:message>
  <wsdl:message name="ExamSoapOut">
    <wsdl:part name="parameters" element="tns:ExamResponse" />
  </wsdl:message>
  <wsdl:message name="MarkSoapIn">
    <wsdl:part name="parameters" element="tns:Mark" />
  </wsdl:message>
  <wsdl:message name="MarkSoapOut">
    <wsdl:part name="parameters" element="tns:MarkResponse" />
  </wsdl:message>
  <wsdl:message name="GetMyGradesSoapIn">
    <wsdl:part name="parameters" element="tns:GetMyGrades" />
  </wsdl:message>
  <wsdl:message name="GetMyGradesSoapOut">
    <wsdl:part name="parameters" element="tns:GetMyGradesResponse" />
  </wsdl:message>
  <wsdl:message name="ClassroomMorningSoapIn">
    <wsdl:part name="parameters" element="tns:ClassroomMorning" />
  </wsdl:message>
  <wsdl:message name="ClassroomMorningSoapOut">
    <wsdl:part name="parameters" element="tns:ClassroomMorningResponse" />
  </wsdl:message>
  <wsdl:message name="ClassroomAfternoonSoapIn">
    <wsdl:part name="parameters" element="tns:ClassroomAfternoon" />
  </wsdl:message>
  <wsdl:message name="ClassroomAfternoonSoapOut">
    <wsdl:part name="parameters" element="tns:ClassroomAfternoonResponse" />
  </wsdl:message>
  <wsdl:message name="ClassroomNightSoapIn">
    <wsdl:part name="parameters" element="tns:ClassroomNight" />
  </wsdl:message>
  <wsdl:message name="ClassroomNightSoapOut">
    <wsdl:part name="parameters" element="tns:ClassroomNightResponse" />
  </wsdl:message>
  <wsdl:message name="ClassroomDaySoapIn">
    <wsdl:part name="parameters" element="tns:ClassroomDay" />
  </wsdl:message>
  <wsdl:message name="ClassroomDaySoapOut">
    <wsdl:part name="parameters" element="tns:ClassroomDayResponse" />
  </wsdl:message>
  <wsdl:message name="ClassroomNextdaySoapIn">
    <wsdl:part name="parameters" element="tns:ClassroomNextday" />
  </wsdl:message>
  <wsdl:message name="ClassroomNextdaySoapOut">
    <wsdl:part name="parameters" element="tns:ClassroomNextdayResponse" />
  </wsdl:message>
  <wsdl:message name="ClassroomNextlesoonSoapIn">
    <wsdl:part name="parameters" element="tns:ClassroomNextlesoon" />
  </wsdl:message>
  <wsdl:message name="ClassroomNextlesoonSoapOut">
    <wsdl:part name="parameters" element="tns:ClassroomNextlesoonResponse" />
  </wsdl:message>
  <wsdl:message name="StudyStateSoapIn">
    <wsdl:part name="parameters" element="tns:StudyState" />
  </wsdl:message>
  <wsdl:message name="StudyStateSoapOut">
    <wsdl:part name="parameters" element="tns:StudyStateResponse" />
  </wsdl:message>
  <wsdl:message name="NexttermyLessonSoapIn">
    <wsdl:part name="parameters" element="tns:NexttermyLesson" />
  </wsdl:message>
  <wsdl:message name="NexttermyLessonSoapOut">
    <wsdl:part name="parameters" element="tns:NexttermyLessonResponse" />
  </wsdl:message>
  <wsdl:message name="GetDeptPhoneByPage_SSoapIn">
    <wsdl:part name="parameters" element="tns:GetDeptPhoneByPage_S" />
  </wsdl:message>
  <wsdl:message name="GetDeptPhoneByPage_SSoapOut">
    <wsdl:part name="parameters" element="tns:GetDeptPhoneByPage_SResponse" />
  </wsdl:message>
  <wsdl:message name="SecSoapIn">
    <wsdl:part name="parameters" element="tns:Sec" />
  </wsdl:message>
  <wsdl:message name="SecSoapOut">
    <wsdl:part name="parameters" element="tns:SecResponse" />
  </wsdl:message>
  <wsdl:message name="GetTodayListSoapIn">
    <wsdl:part name="parameters" element="tns:GetTodayList" />
  </wsdl:message>
  <wsdl:message name="GetTodayListSoapOut">
    <wsdl:part name="parameters" element="tns:GetTodayListResponse" />
  </wsdl:message>
  <wsdl:message name="TeacherSecSoapIn">
    <wsdl:part name="parameters" element="tns:TeacherSec" />
  </wsdl:message>
  <wsdl:message name="TeacherSecSoapOut">
    <wsdl:part name="parameters" element="tns:TeacherSecResponse" />
  </wsdl:message>
  <wsdl:message name="GetTeacherNextLessonSoapIn">
    <wsdl:part name="parameters" element="tns:GetTeacherNextLesson" />
  </wsdl:message>
  <wsdl:message name="GetTeacherNextLessonSoapOut">
    <wsdl:part name="parameters" element="tns:GetTeacherNextLessonResponse" />
  </wsdl:message>
  <wsdl:message name="GetTeacherinvigilateSoapIn">
    <wsdl:part name="parameters" element="tns:GetTeacherinvigilate" />
  </wsdl:message>
  <wsdl:message name="GetTeacherinvigilateSoapOut">
    <wsdl:part name="parameters" element="tns:GetTeacherinvigilateResponse" />
  </wsdl:message>
  <wsdl:message name="GetTeacherNextTermLessonSoapIn">
    <wsdl:part name="parameters" element="tns:GetTeacherNextTermLesson" />
  </wsdl:message>
  <wsdl:message name="GetTeacherNextTermLessonSoapOut">
    <wsdl:part name="parameters" element="tns:GetTeacherNextTermLessonResponse" />
  </wsdl:message>
  <wsdl:message name="GetTeacherWorkHourSoapIn">
    <wsdl:part name="parameters" element="tns:GetTeacherWorkHour" />
  </wsdl:message>
  <wsdl:message name="GetTeacherWorkHourSoapOut">
    <wsdl:part name="parameters" element="tns:GetTeacherWorkHourResponse" />
  </wsdl:message>
  <wsdl:message name="GetjiaopingxinxiSoapIn">
    <wsdl:part name="parameters" element="tns:Getjiaopingxinxi" />
  </wsdl:message>
  <wsdl:message name="GetjiaopingxinxiSoapOut">
    <wsdl:part name="parameters" element="tns:GetjiaopingxinxiResponse" />
  </wsdl:message>
  <wsdl:message name="GetTeacherTermLessonSoapIn">
    <wsdl:part name="parameters" element="tns:GetTeacherTermLesson" />
  </wsdl:message>
  <wsdl:message name="GetTeacherTermLessonSoapOut">
    <wsdl:part name="parameters" element="tns:GetTeacherTermLessonResponse" />
  </wsdl:message>
  <wsdl:message name="GetTeachExamPlanSoapIn">
    <wsdl:part name="parameters" element="tns:GetTeachExamPlan" />
  </wsdl:message>
  <wsdl:message name="GetTeachExamPlanSoapOut">
    <wsdl:part name="parameters" element="tns:GetTeachExamPlanResponse" />
  </wsdl:message>
  <wsdl:message name="SearchStudentSoapIn">
    <wsdl:part name="parameters" element="tns:SearchStudent" />
  </wsdl:message>
  <wsdl:message name="SearchStudentSoapOut">
    <wsdl:part name="parameters" element="tns:SearchStudentResponse" />
  </wsdl:message>
  <wsdl:message name="GetLessonProgressListSoapIn">
    <wsdl:part name="parameters" element="tns:GetLessonProgressList" />
  </wsdl:message>
  <wsdl:message name="GetLessonProgressListSoapOut">
    <wsdl:part name="parameters" element="tns:GetLessonProgressListResponse" />
  </wsdl:message>
  <wsdl:message name="SearchUserSoapIn">
    <wsdl:part name="parameters" element="tns:SearchUser" />
  </wsdl:message>
  <wsdl:message name="SearchUserSoapOut">
    <wsdl:part name="parameters" element="tns:SearchUserResponse" />
  </wsdl:message>
  <wsdl:message name="GetStudentListByASGSoapIn">
    <wsdl:part name="parameters" element="tns:GetStudentListByASG" />
  </wsdl:message>
  <wsdl:message name="GetStudentListByASGSoapOut">
    <wsdl:part name="parameters" element="tns:GetStudentListByASGResponse" />
  </wsdl:message>
  <wsdl:message name="GetASListSoapIn">
    <wsdl:part name="parameters" element="tns:GetASList" />
  </wsdl:message>
  <wsdl:message name="GetASListSoapOut">
    <wsdl:part name="parameters" element="tns:GetASListResponse" />
  </wsdl:message>
  <wsdl:message name="GetStudentInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetStudentInfo" />
  </wsdl:message>
  <wsdl:message name="GetStudentInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetStudentInfoResponse" />
  </wsdl:message>
  <wsdl:portType name="MURPNewsServiceSoap">
    <wsdl:operation name="GetDmScheduList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-当天课表</wsdl:documentation>
      <wsdl:input message="tns:GetDmScheduListSoapIn" />
      <wsdl:output message="tns:GetDmScheduListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetqdAuthCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-发起课堂点名(获取验证码)</wsdl:documentation>
      <wsdl:input message="tns:GetqdAuthCodeSoapIn" />
      <wsdl:output message="tns:GetqdAuthCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DmStuGetState">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-[学生获取点名签到状态]</wsdl:documentation>
      <wsdl:input message="tns:DmStuGetStateSoapIn" />
      <wsdl:output message="tns:DmStuGetStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DmTeaGetState">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-[教师获取点名签到状态]</wsdl:documentation>
      <wsdl:input message="tns:DmTeaGetStateSoapIn" />
      <wsdl:output message="tns:DmTeaGetStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Checkin_stu">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-[学生签到]</wsdl:documentation>
      <wsdl:input message="tns:Checkin_stuSoapIn" />
      <wsdl:output message="tns:Checkin_stuSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CloseDmqd">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-关闭点名签到</wsdl:documentation>
      <wsdl:input message="tns:CloseDmqdSoapIn" />
      <wsdl:output message="tns:CloseDmqdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DmStatistics">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-点名统计</wsdl:documentation>
      <wsdl:input message="tns:DmStatisticsSoapIn" />
      <wsdl:output message="tns:DmStatisticsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Checkin_dm_plqd">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-[老师批量补签]</wsdl:documentation>
      <wsdl:input message="tns:Checkin_dm_plqdSoapIn" />
      <wsdl:output message="tns:Checkin_dm_plqdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DmResign">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-重新发起签到</wsdl:documentation>
      <wsdl:input message="tns:DmResignSoapIn" />
      <wsdl:output message="tns:DmResignSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUnsignedStu">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">课堂点名-获取未签到学生</wsdl:documentation>
      <wsdl:input message="tns:GetUnsignedStuSoapIn" />
      <wsdl:output message="tns:GetUnsignedStuSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetJzlb">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-查看讲座列表</wsdl:documentation>
      <wsdl:input message="tns:GetJzlbSoapIn" />
      <wsdl:output message="tns:GetJzlbSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetjzAuthCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-发起讲座签到(获取验证码)</wsdl:documentation>
      <wsdl:input message="tns:GetjzAuthCodeSoapIn" />
      <wsdl:output message="tns:GetjzAuthCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="JzStuGetState">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-学生获取讲座签到状态</wsdl:documentation>
      <wsdl:input message="tns:JzStuGetStateSoapIn" />
      <wsdl:output message="tns:JzStuGetStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="JzTeaGetState">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-教师获取讲座签到状态</wsdl:documentation>
      <wsdl:input message="tns:JzTeaGetStateSoapIn" />
      <wsdl:output message="tns:JzTeaGetStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="jz_checkin">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-学生签到</wsdl:documentation>
      <wsdl:input message="tns:jz_checkinSoapIn" />
      <wsdl:output message="tns:jz_checkinSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CloseJzqd">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-关闭讲座签到--合并统计</wsdl:documentation>
      <wsdl:input message="tns:CloseJzqdSoapIn" />
      <wsdl:output message="tns:CloseJzqdSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="JzStatistics">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-签到统计</wsdl:documentation>
      <wsdl:input message="tns:JzStatisticsSoapIn" />
      <wsdl:output message="tns:JzStatisticsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="JzResign">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">讲座签到-重新发起签到</wsdl:documentation>
      <wsdl:input message="tns:JzResignSoapIn" />
      <wsdl:output message="tns:JzResignSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNewsDetail">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得新闻详细内容（链接地址）</wsdl:documentation>
      <wsdl:input message="tns:GetNewsDetailSoapIn" />
      <wsdl:output message="tns:GetNewsDetailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNewsList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获得新闻列表；newsId=起始新闻id号；topNum=翻页数，正数上翻页，负数下翻页</wsdl:documentation>
      <wsdl:input message="tns:GetNewsListSoapIn" />
      <wsdl:output message="tns:GetNewsListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetScheduleList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">表格课表数据（按校历）</wsdl:documentation>
      <wsdl:input message="tns:GetScheduleListSoapIn" />
      <wsdl:output message="tns:GetScheduleListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Exam">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">考试安排（最近考试安排）</wsdl:documentation>
      <wsdl:input message="tns:ExamSoapIn" />
      <wsdl:output message="tns:ExamSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Mark">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">我的成绩（本学期考试成绩）</wsdl:documentation>
      <wsdl:input message="tns:MarkSoapIn" />
      <wsdl:output message="tns:MarkSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMyGrades">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">历史成绩</wsdl:documentation>
      <wsdl:input message="tns:GetMyGradesSoapIn" />
      <wsdl:output message="tns:GetMyGradesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClassroomMorning">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">自习教室（上午空余自习教室）</wsdl:documentation>
      <wsdl:input message="tns:ClassroomMorningSoapIn" />
      <wsdl:output message="tns:ClassroomMorningSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClassroomAfternoon">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">自习教室（下午空余自习教室）</wsdl:documentation>
      <wsdl:input message="tns:ClassroomAfternoonSoapIn" />
      <wsdl:output message="tns:ClassroomAfternoonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClassroomNight">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">自习教室（晚上空余自习教室）</wsdl:documentation>
      <wsdl:input message="tns:ClassroomNightSoapIn" />
      <wsdl:output message="tns:ClassroomNightSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClassroomDay">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">自习教室（全天空余自习教室）</wsdl:documentation>
      <wsdl:input message="tns:ClassroomDaySoapIn" />
      <wsdl:output message="tns:ClassroomDaySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClassroomNextday">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">自习教室（明天空余自习教室）</wsdl:documentation>
      <wsdl:input message="tns:ClassroomNextdaySoapIn" />
      <wsdl:output message="tns:ClassroomNextdaySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClassroomNextlesoon">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">自习教室（下节课空余自习教室）</wsdl:documentation>
      <wsdl:input message="tns:ClassroomNextlesoonSoapIn" />
      <wsdl:output message="tns:ClassroomNextlesoonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="StudyState">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">学习状态（和我的学籍合并一起）</wsdl:documentation>
      <wsdl:input message="tns:StudyStateSoapIn" />
      <wsdl:output message="tns:StudyStateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NexttermyLesson">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">下学期课（下学期预开课信息）</wsdl:documentation>
      <wsdl:input message="tns:NexttermyLessonSoapIn" />
      <wsdl:output message="tns:NexttermyLessonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDeptPhoneByPage_S">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MURP获得部门联系方式----有分页，每页20条</wsdl:documentation>
      <wsdl:input message="tns:GetDeptPhoneByPage_SSoapIn" />
      <wsdl:output message="tns:GetDeptPhoneByPage_SSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Sec">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">我的秘书</wsdl:documentation>
      <wsdl:input message="tns:SecSoapIn" />
      <wsdl:output message="tns:SecSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTodayList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">日程安排----模块id为1：今明活动（讲座，社团等）；模块id为2：今日课程；模块id为3：明日课程；模块id为4：最新考试安排；</wsdl:documentation>
      <wsdl:input message="tns:GetTodayListSoapIn" />
      <wsdl:output message="tns:GetTodayListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TeacherSec">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-我的秘书</wsdl:documentation>
      <wsdl:input message="tns:TeacherSecSoapIn" />
      <wsdl:output message="tns:TeacherSecSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeacherNextLesson">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-下节课程</wsdl:documentation>
      <wsdl:input message="tns:GetTeacherNextLessonSoapIn" />
      <wsdl:output message="tns:GetTeacherNextLessonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeacherinvigilate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-监考安排(所有)</wsdl:documentation>
      <wsdl:input message="tns:GetTeacherinvigilateSoapIn" />
      <wsdl:output message="tns:GetTeacherinvigilateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeacherNextTermLesson">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-可接任务-下学期任务</wsdl:documentation>
      <wsdl:input message="tns:GetTeacherNextTermLessonSoapIn" />
      <wsdl:output message="tns:GetTeacherNextTermLessonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeacherWorkHour">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-工作总量</wsdl:documentation>
      <wsdl:input message="tns:GetTeacherWorkHourSoapIn" />
      <wsdl:output message="tns:GetTeacherWorkHourSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Getjiaopingxinxi">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-教评信息</wsdl:documentation>
      <wsdl:input message="tns:GetjiaopingxinxiSoapIn" />
      <wsdl:output message="tns:GetjiaopingxinxiSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeacherTermLesson">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-开课信息</wsdl:documentation>
      <wsdl:input message="tns:GetTeacherTermLessonSoapIn" />
      <wsdl:output message="tns:GetTeacherTermLessonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTeachExamPlan">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">教师-所教课程考试安排</wsdl:documentation>
      <wsdl:input message="tns:GetTeachExamPlanSoapIn" />
      <wsdl:output message="tns:GetTeachExamPlanSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SearchStudent">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">搜索学生信息(无分页，返回30条数据)</wsdl:documentation>
      <wsdl:input message="tns:SearchStudentSoapIn" />
      <wsdl:output message="tns:SearchStudentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLessonProgressList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据课程id获取课程进度_20141011(查无数据)</wsdl:documentation>
      <wsdl:input message="tns:GetLessonProgressListSoapIn" />
      <wsdl:output message="tns:GetLessonProgressListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SearchUser">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">PC端:用户搜索</wsdl:documentation>
      <wsdl:input message="tns:SearchUserSoapIn" />
      <wsdl:output message="tns:SearchUserSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetStudentListByASG">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">PC端:根据院系A-专业S-年级G筛选学生</wsdl:documentation>
      <wsdl:input message="tns:GetStudentListByASGSoapIn" />
      <wsdl:output message="tns:GetStudentListByASGSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetASList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">PC端:获取院系-专业</wsdl:documentation>
      <wsdl:input message="tns:GetASListSoapIn" />
      <wsdl:output message="tns:GetASListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetStudentInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">学生信息核对</wsdl:documentation>
      <wsdl:input message="tns:GetStudentInfoSoapIn" />
      <wsdl:output message="tns:GetStudentInfoSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="MURPNewsServiceSoap" type="tns:MURPNewsServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetDmScheduList">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetDmScheduList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetqdAuthCode">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetqdAuthCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmStuGetState">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/DmStuGetState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmTeaGetState">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/DmTeaGetState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Checkin_stu">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/Checkin_stu" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseDmqd">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/CloseDmqd" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmStatistics">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/DmStatistics" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Checkin_dm_plqd">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/Checkin_dm_plqd" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmResign">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/DmResign" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUnsignedStu">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetUnsignedStu" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetJzlb">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetJzlb" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetjzAuthCode">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetjzAuthCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzStuGetState">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/JzStuGetState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzTeaGetState">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/JzTeaGetState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="jz_checkin">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/jz_checkin" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseJzqd">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/CloseJzqd" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzStatistics">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/JzStatistics" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzResign">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/JzResign" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNewsDetail">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetNewsDetail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNewsList">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetNewsList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetScheduleList">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetScheduleList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Exam">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/Exam" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Mark">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/Mark" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyGrades">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetMyGrades" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomMorning">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/ClassroomMorning" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomAfternoon">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/ClassroomAfternoon" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomNight">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/ClassroomNight" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomDay">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/ClassroomDay" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomNextday">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/ClassroomNextday" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomNextlesoon">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/ClassroomNextlesoon" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="StudyState">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/StudyState" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NexttermyLesson">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/NexttermyLesson" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDeptPhoneByPage_S">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetDeptPhoneByPage_S" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Sec">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/Sec" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTodayList">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetTodayList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TeacherSec">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/TeacherSec" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherNextLesson">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherNextLesson" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherinvigilate">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherinvigilate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherNextTermLesson">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherNextTermLesson" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherWorkHour">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherWorkHour" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Getjiaopingxinxi">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/Getjiaopingxinxi" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherTermLesson">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherTermLesson" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeachExamPlan">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetTeachExamPlan" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchStudent">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/SearchStudent" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLessonProgressList">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetLessonProgressList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchUser">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/SearchUser" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStudentListByASG">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetStudentListByASG" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetASList">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetASList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStudentInfo">
      <soap:operation soapAction="http://murpcn.com/murpwebservice/GetStudentInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="MURPNewsServiceSoap12" type="tns:MURPNewsServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetDmScheduList">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetDmScheduList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetqdAuthCode">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetqdAuthCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmStuGetState">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/DmStuGetState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmTeaGetState">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/DmTeaGetState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Checkin_stu">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/Checkin_stu" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseDmqd">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/CloseDmqd" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmStatistics">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/DmStatistics" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Checkin_dm_plqd">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/Checkin_dm_plqd" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DmResign">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/DmResign" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUnsignedStu">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetUnsignedStu" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetJzlb">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetJzlb" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetjzAuthCode">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetjzAuthCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzStuGetState">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/JzStuGetState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzTeaGetState">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/JzTeaGetState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="jz_checkin">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/jz_checkin" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseJzqd">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/CloseJzqd" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzStatistics">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/JzStatistics" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="JzResign">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/JzResign" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNewsDetail">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetNewsDetail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNewsList">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetNewsList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetScheduleList">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetScheduleList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Exam">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/Exam" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Mark">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/Mark" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyGrades">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetMyGrades" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomMorning">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/ClassroomMorning" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomAfternoon">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/ClassroomAfternoon" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomNight">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/ClassroomNight" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomDay">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/ClassroomDay" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomNextday">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/ClassroomNextday" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClassroomNextlesoon">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/ClassroomNextlesoon" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="StudyState">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/StudyState" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NexttermyLesson">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/NexttermyLesson" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDeptPhoneByPage_S">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetDeptPhoneByPage_S" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Sec">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/Sec" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTodayList">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetTodayList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TeacherSec">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/TeacherSec" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherNextLesson">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherNextLesson" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherinvigilate">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherinvigilate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherNextTermLesson">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherNextTermLesson" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherWorkHour">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherWorkHour" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Getjiaopingxinxi">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/Getjiaopingxinxi" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeacherTermLesson">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetTeacherTermLesson" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTeachExamPlan">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetTeachExamPlan" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchStudent">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/SearchStudent" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLessonProgressList">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetLessonProgressList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchUser">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/SearchUser" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStudentListByASG">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetStudentListByASG" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetASList">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetASList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStudentInfo">
      <soap12:operation soapAction="http://murpcn.com/murpwebservice/GetStudentInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="MURPNewsService">
    <wsdl:port name="MURPNewsServiceSoap" binding="tns:MURPNewsServiceSoap">
      <soap:address location="http://219.245.18.61:81/KEY/MURPNewsService.asmx" />
    </wsdl:port>
    <wsdl:port name="MURPNewsServiceSoap12" binding="tns:MURPNewsServiceSoap12">
      <soap12:address location="http://219.245.18.61:81/KEY/MURPNewsService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>