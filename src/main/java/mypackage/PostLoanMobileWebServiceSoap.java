
package mypackage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PostLoanMobileWebServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PostLoanMobileWebServiceSoap {


    /**
     * 在线业务平台贷后数据提供
     * 
     * @param identNo
     * @param contractNo
     * @param businessID
     * @return
     *     returns mypackage.ArrayOfLoanOrderInfo
     */
    @WebMethod(operationName = "Excute", action = "http://tempuri.org/Excute")
    @WebResult(name = "ExcuteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Excute", targetNamespace = "http://tempuri.org/", className = "mypackage.Excute")
    @ResponseWrapper(localName = "ExcuteResponse", targetNamespace = "http://tempuri.org/", className = "mypackage.ExcuteResponse")
    public ArrayOfLoanOrderInfo excute(
        @WebParam(name = "identNo", targetNamespace = "http://tempuri.org/")
        String identNo,
        @WebParam(name = "businessID", targetNamespace = "http://tempuri.org/")
        String businessID,
        @WebParam(name = "contractNo", targetNamespace = "http://tempuri.org/")
        String contractNo);

    /**
     * 判断客户是否首次还款后连续6期正常还款
     * 
     * @param idCardNo
     * @return
     *     returns mypackage.RequestResult
     */
    @WebMethod(action = "http://tempuri.org/checkNormalRepaymentSixMonth")
    @WebResult(name = "checkNormalRepaymentSixMonthResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "checkNormalRepaymentSixMonth", targetNamespace = "http://tempuri.org/", className = "mypackage.CheckNormalRepaymentSixMonth")
    @ResponseWrapper(localName = "checkNormalRepaymentSixMonthResponse", targetNamespace = "http://tempuri.org/", className = "mypackage.CheckNormalRepaymentSixMonthResponse")
    public RequestResult checkNormalRepaymentSixMonth(
        @WebParam(name = "IDCardNo", targetNamespace = "http://tempuri.org/")
        String idCardNo);

    /**
     * 加贷再贷条件判断
     * 
     * @param idNo
     * @return
     *     returns mypackage.RequestResult
     */
    @WebMethod(operationName = "IsOpenLoanAgain", action = "http://tempuri.org/IsOpenLoanAgain")
    @WebResult(name = "IsOpenLoanAgainResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsOpenLoanAgain", targetNamespace = "http://tempuri.org/", className = "mypackage.IsOpenLoanAgain")
    @ResponseWrapper(localName = "IsOpenLoanAgainResponse", targetNamespace = "http://tempuri.org/", className = "mypackage.IsOpenLoanAgainResponse")
    public RequestResult isOpenLoanAgain(
        @WebParam(name = "IDNo", targetNamespace = "http://tempuri.org/")
        String idNo);

}
