<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="Excute">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="identNo" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="businessID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="contractNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExcuteResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ExcuteResult" type="tns:ArrayOfLoanOrderInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfLoanOrderInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="loanOrderInfo" nillable="true" type="tns:loanOrderInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="loanOrderInfo">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="orderId" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="userName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="contractNo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="contractStatus" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="loamAmt" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="LoanPeriods" type="s:long" />
          <s:element minOccurs="1" maxOccurs="1" name="outBillCnt" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="paidPeriods" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="overduePeriods" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="surplusPeriods" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="inBillCnt" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="curDueAmt" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="lastLimiteTime" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="curAmt" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dailyPunishLong" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="bankCard" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="bankName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lendingTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="clearTime" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="cloanStatus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="operable" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="IsRepayment" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="IsFrozen" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="bills" type="tns:ArrayOfStatementDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfStatementDetail">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="statementDetail" nillable="true" type="tns:statementDetail" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="statementDetail">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="orderID" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="contractNo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="billMonth" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="repayStatus" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="billAmt" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="paidAmt" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dueAmt" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="billType" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="checkNormalRepaymentSixMonth">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="IDCardNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="checkNormalRepaymentSixMonthResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="checkNormalRepaymentSixMonthResult" type="tns:RequestResult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestResult">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="State" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="Context" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Result" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="LoanAgainModel">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="IsCanAddLoan" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="IsCanLoanAgain" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:element name="IsOpenLoanAgain">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="IDNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsOpenLoanAgainResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="IsOpenLoanAgainResult" type="tns:RequestResult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ArrayOfLoanOrderInfo" nillable="true" type="tns:ArrayOfLoanOrderInfo" />
      <s:element name="RequestResult" nillable="true" type="tns:RequestResult" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ExcuteSoapIn">
    <wsdl:part name="parameters" element="tns:Excute" />
  </wsdl:message>
  <wsdl:message name="ExcuteSoapOut">
    <wsdl:part name="parameters" element="tns:ExcuteResponse" />
  </wsdl:message>
  <wsdl:message name="checkNormalRepaymentSixMonthSoapIn">
    <wsdl:part name="parameters" element="tns:checkNormalRepaymentSixMonth" />
  </wsdl:message>
  <wsdl:message name="checkNormalRepaymentSixMonthSoapOut">
    <wsdl:part name="parameters" element="tns:checkNormalRepaymentSixMonthResponse" />
  </wsdl:message>
  <wsdl:message name="IsOpenLoanAgainSoapIn">
    <wsdl:part name="parameters" element="tns:IsOpenLoanAgain" />
  </wsdl:message>
  <wsdl:message name="IsOpenLoanAgainSoapOut">
    <wsdl:part name="parameters" element="tns:IsOpenLoanAgainResponse" />
  </wsdl:message>
  <wsdl:message name="ExcuteHttpGetIn">
    <wsdl:part name="identNo" type="s:string" />
    <wsdl:part name="businessID" type="s:string" />
    <wsdl:part name="contractNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ExcuteHttpGetOut">
    <wsdl:part name="Body" element="tns:ArrayOfLoanOrderInfo" />
  </wsdl:message>
  <wsdl:message name="checkNormalRepaymentSixMonthHttpGetIn">
    <wsdl:part name="IDCardNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="checkNormalRepaymentSixMonthHttpGetOut">
    <wsdl:part name="Body" element="tns:RequestResult" />
  </wsdl:message>
  <wsdl:message name="IsOpenLoanAgainHttpGetIn">
    <wsdl:part name="IDNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IsOpenLoanAgainHttpGetOut">
    <wsdl:part name="Body" element="tns:RequestResult" />
  </wsdl:message>
  <wsdl:message name="ExcuteHttpPostIn">
    <wsdl:part name="identNo" type="s:string" />
    <wsdl:part name="businessID" type="s:string" />
    <wsdl:part name="contractNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ExcuteHttpPostOut">
    <wsdl:part name="Body" element="tns:ArrayOfLoanOrderInfo" />
  </wsdl:message>
  <wsdl:message name="checkNormalRepaymentSixMonthHttpPostIn">
    <wsdl:part name="IDCardNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="checkNormalRepaymentSixMonthHttpPostOut">
    <wsdl:part name="Body" element="tns:RequestResult" />
  </wsdl:message>
  <wsdl:message name="IsOpenLoanAgainHttpPostIn">
    <wsdl:part name="IDNo" type="s:string" />
  </wsdl:message>
  <wsdl:message name="IsOpenLoanAgainHttpPostOut">
    <wsdl:part name="Body" element="tns:RequestResult" />
  </wsdl:message>
  <wsdl:portType name="PostLoanMobileWebServiceSoap">
    <wsdl:operation name="Excute">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">在线业务平台贷后数据提供</wsdl:documentation>
      <wsdl:input message="tns:ExcuteSoapIn" />
      <wsdl:output message="tns:ExcuteSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="checkNormalRepaymentSixMonth">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">判断客户是否首次还款后连续6期正常还款</wsdl:documentation>
      <wsdl:input message="tns:checkNormalRepaymentSixMonthSoapIn" />
      <wsdl:output message="tns:checkNormalRepaymentSixMonthSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IsOpenLoanAgain">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">加贷再贷条件判断</wsdl:documentation>
      <wsdl:input message="tns:IsOpenLoanAgainSoapIn" />
      <wsdl:output message="tns:IsOpenLoanAgainSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="PostLoanMobileWebServiceHttpGet">
    <wsdl:operation name="Excute">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">在线业务平台贷后数据提供</wsdl:documentation>
      <wsdl:input message="tns:ExcuteHttpGetIn" />
      <wsdl:output message="tns:ExcuteHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="checkNormalRepaymentSixMonth">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">判断客户是否首次还款后连续6期正常还款</wsdl:documentation>
      <wsdl:input message="tns:checkNormalRepaymentSixMonthHttpGetIn" />
      <wsdl:output message="tns:checkNormalRepaymentSixMonthHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="IsOpenLoanAgain">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">加贷再贷条件判断</wsdl:documentation>
      <wsdl:input message="tns:IsOpenLoanAgainHttpGetIn" />
      <wsdl:output message="tns:IsOpenLoanAgainHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="PostLoanMobileWebServiceHttpPost">
    <wsdl:operation name="Excute">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">在线业务平台贷后数据提供</wsdl:documentation>
      <wsdl:input message="tns:ExcuteHttpPostIn" />
      <wsdl:output message="tns:ExcuteHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="checkNormalRepaymentSixMonth">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">判断客户是否首次还款后连续6期正常还款</wsdl:documentation>
      <wsdl:input message="tns:checkNormalRepaymentSixMonthHttpPostIn" />
      <wsdl:output message="tns:checkNormalRepaymentSixMonthHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="IsOpenLoanAgain">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">加贷再贷条件判断</wsdl:documentation>
      <wsdl:input message="tns:IsOpenLoanAgainHttpPostIn" />
      <wsdl:output message="tns:IsOpenLoanAgainHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="PostLoanMobileWebServiceSoap" type="tns:PostLoanMobileWebServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Excute">
      <soap:operation soapAction="http://tempuri.org/Excute" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="checkNormalRepaymentSixMonth">
      <soap:operation soapAction="http://tempuri.org/checkNormalRepaymentSixMonth" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsOpenLoanAgain">
      <soap:operation soapAction="http://tempuri.org/IsOpenLoanAgain" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="PostLoanMobileWebServiceSoap12" type="tns:PostLoanMobileWebServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Excute">
      <soap12:operation soapAction="http://tempuri.org/Excute" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="checkNormalRepaymentSixMonth">
      <soap12:operation soapAction="http://tempuri.org/checkNormalRepaymentSixMonth" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsOpenLoanAgain">
      <soap12:operation soapAction="http://tempuri.org/IsOpenLoanAgain" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="PostLoanMobileWebServiceHttpGet" type="tns:PostLoanMobileWebServiceHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="Excute">
      <http:operation location="/Excute" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="checkNormalRepaymentSixMonth">
      <http:operation location="/checkNormalRepaymentSixMonth" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsOpenLoanAgain">
      <http:operation location="/IsOpenLoanAgain" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="PostLoanMobileWebServiceHttpPost" type="tns:PostLoanMobileWebServiceHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="Excute">
      <http:operation location="/Excute" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="checkNormalRepaymentSixMonth">
      <http:operation location="/checkNormalRepaymentSixMonth" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsOpenLoanAgain">
      <http:operation location="/IsOpenLoanAgain" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="PostLoanMobileWebService">
    <wsdl:port name="PostLoanMobileWebServiceSoap" binding="tns:PostLoanMobileWebServiceSoap">
      <soap:address location="http://10.1.12.52:8090/OBizWebService/GateWay/PostLoanMobileWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="PostLoanMobileWebServiceSoap12" binding="tns:PostLoanMobileWebServiceSoap12">
      <soap12:address location="http://10.1.12.52:8090/OBizWebService/GateWay/PostLoanMobileWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="PostLoanMobileWebServiceHttpGet" binding="tns:PostLoanMobileWebServiceHttpGet">
      <http:address location="http://10.1.12.52:8090/OBizWebService/GateWay/PostLoanMobileWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="PostLoanMobileWebServiceHttpPost" binding="tns:PostLoanMobileWebServiceHttpPost">
      <http:address location="http://10.1.12.52:8090/OBizWebService/GateWay/PostLoanMobileWebService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>