
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="IsOpenLoanAgainResult" type="{http://tempuri.org/}RequestResult" minOccurs="0"/>
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
    "isOpenLoanAgainResult"
})
@XmlRootElement(name = "IsOpenLoanAgainResponse")
public class IsOpenLoanAgainResponse {

    @XmlElement(name = "IsOpenLoanAgainResult")
    protected RequestResult isOpenLoanAgainResult;

    /**
     * Gets the value of the isOpenLoanAgainResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestResult }
     *     
     */
    public RequestResult getIsOpenLoanAgainResult() {
        return isOpenLoanAgainResult;
    }

    /**
     * Sets the value of the isOpenLoanAgainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResult }
     *     
     */
    public void setIsOpenLoanAgainResult(RequestResult value) {
        this.isOpenLoanAgainResult = value;
    }

}
