
package mypackage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLoanOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLoanOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanOrderInfo" type="{http://tempuri.org/}loanOrderInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLoanOrderInfo", propOrder = {
    "loanOrderInfo"
})
public class ArrayOfLoanOrderInfo {

    @XmlElement(nillable = true)
    protected List<LoanOrderInfo> loanOrderInfo;

    /**
     * Gets the value of the loanOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanOrderInfo property.
     * 
     * <p>
     * For vcredit, to add a new item, do as follows:
     * <pre>
     *    getLoanOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanOrderInfo }
     * 
     * 
     */
    public List<LoanOrderInfo> getLoanOrderInfo() {
        if (loanOrderInfo == null) {
            loanOrderInfo = new ArrayList<LoanOrderInfo>();
        }
        return this.loanOrderInfo;
    }

}
