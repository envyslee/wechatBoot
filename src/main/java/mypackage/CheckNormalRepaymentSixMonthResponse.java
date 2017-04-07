
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkNormalRepaymentSixMonthResult" type="{http://tempuri.org/}RequestResult" minOccurs="0"/>
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
    "checkNormalRepaymentSixMonthResult"
})
@XmlRootElement(name = "checkNormalRepaymentSixMonthResponse")
public class CheckNormalRepaymentSixMonthResponse {

    protected RequestResult checkNormalRepaymentSixMonthResult;

    /**
     * Gets the value of the checkNormalRepaymentSixMonthResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestResult }
     *     
     */
    public RequestResult getCheckNormalRepaymentSixMonthResult() {
        return checkNormalRepaymentSixMonthResult;
    }

    /**
     * Sets the value of the checkNormalRepaymentSixMonthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResult }
     *     
     */
    public void setCheckNormalRepaymentSixMonthResult(RequestResult value) {
        this.checkNormalRepaymentSixMonthResult = value;
    }

}
