
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanAgainModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAgainModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCanAddLoan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCanLoanAgain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAgainModel", propOrder = {
    "isCanAddLoan",
    "isCanLoanAgain"
})
public class LoanAgainModel {

    @XmlElement(name = "IsCanAddLoan")
    protected boolean isCanAddLoan;
    @XmlElement(name = "IsCanLoanAgain")
    protected boolean isCanLoanAgain;

    /**
     * Gets the value of the isCanAddLoan property.
     * 
     */
    public boolean isIsCanAddLoan() {
        return isCanAddLoan;
    }

    /**
     * Sets the value of the isCanAddLoan property.
     * 
     */
    public void setIsCanAddLoan(boolean value) {
        this.isCanAddLoan = value;
    }

    /**
     * Gets the value of the isCanLoanAgain property.
     * 
     */
    public boolean isIsCanLoanAgain() {
        return isCanLoanAgain;
    }

    /**
     * Sets the value of the isCanLoanAgain property.
     * 
     */
    public void setIsCanLoanAgain(boolean value) {
        this.isCanLoanAgain = value;
    }

}
