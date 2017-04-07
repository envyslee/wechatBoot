
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestResult_QNAME = new QName("http://tempuri.org/", "RequestResult");
    private final static QName _ArrayOfLoanOrderInfo_QNAME = new QName("http://tempuri.org/", "ArrayOfLoanOrderInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestResult }
     * 
     */
    public RequestResult createRequestResult() {
        return new RequestResult();
    }

    /**
     * Create an instance of {@link IsOpenLoanAgain }
     * 
     */
    public IsOpenLoanAgain createIsOpenLoanAgain() {
        return new IsOpenLoanAgain();
    }

    /**
     * Create an instance of {@link CheckNormalRepaymentSixMonth }
     * 
     */
    public CheckNormalRepaymentSixMonth createCheckNormalRepaymentSixMonth() {
        return new CheckNormalRepaymentSixMonth();
    }

    /**
     * Create an instance of {@link Excute }
     * 
     */
    public Excute createExcute() {
        return new Excute();
    }

    /**
     * Create an instance of {@link ArrayOfLoanOrderInfo }
     * 
     */
    public ArrayOfLoanOrderInfo createArrayOfLoanOrderInfo() {
        return new ArrayOfLoanOrderInfo();
    }

    /**
     * Create an instance of {@link CheckNormalRepaymentSixMonthResponse }
     * 
     */
    public CheckNormalRepaymentSixMonthResponse createCheckNormalRepaymentSixMonthResponse() {
        return new CheckNormalRepaymentSixMonthResponse();
    }

    /**
     * Create an instance of {@link ExcuteResponse }
     * 
     */
    public ExcuteResponse createExcuteResponse() {
        return new ExcuteResponse();
    }

    /**
     * Create an instance of {@link IsOpenLoanAgainResponse }
     * 
     */
    public IsOpenLoanAgainResponse createIsOpenLoanAgainResponse() {
        return new IsOpenLoanAgainResponse();
    }

    /**
     * Create an instance of {@link StatementDetail }
     * 
     */
    public StatementDetail createStatementDetail() {
        return new StatementDetail();
    }

    /**
     * Create an instance of {@link LoanOrderInfo }
     * 
     */
    public LoanOrderInfo createLoanOrderInfo() {
        return new LoanOrderInfo();
    }

    /**
     * Create an instance of {@link ArrayOfStatementDetail }
     * 
     */
    public ArrayOfStatementDetail createArrayOfStatementDetail() {
        return new ArrayOfStatementDetail();
    }

    /**
     * Create an instance of {@link LoanAgainModel }
     * 
     */
    public LoanAgainModel createLoanAgainModel() {
        return new LoanAgainModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestResult")
    public JAXBElement<RequestResult> createRequestResult(RequestResult value) {
        return new JAXBElement<RequestResult>(_RequestResult_QNAME, RequestResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLoanOrderInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfLoanOrderInfo")
    public JAXBElement<ArrayOfLoanOrderInfo> createArrayOfLoanOrderInfo(ArrayOfLoanOrderInfo value) {
        return new JAXBElement<ArrayOfLoanOrderInfo>(_ArrayOfLoanOrderInfo_QNAME, ArrayOfLoanOrderInfo.class, null, value);
    }

}
