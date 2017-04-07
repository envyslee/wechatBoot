
package mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statementDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dueAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statementDetail", propOrder = {
    "orderID",
    "contractNo",
    "billMonth",
    "repayStatus",
    "billAmt",
    "paidAmt",
    "dueAmt",
    "billType"
})
public class StatementDetail {

    protected long orderID;
    protected String contractNo;
    protected String billMonth;
    protected String repayStatus;
    @XmlElement(required = true)
    protected BigDecimal billAmt;
    @XmlElement(required = true)
    protected BigDecimal paidAmt;
    @XmlElement(required = true)
    protected BigDecimal dueAmt;
    protected String billType;

    /**
     * Gets the value of the orderID property.
     * 
     */
    public long getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     */
    public void setOrderID(long value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the billMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillMonth() {
        return billMonth;
    }

    /**
     * Sets the value of the billMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillMonth(String value) {
        this.billMonth = value;
    }

    /**
     * Gets the value of the repayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayStatus() {
        return repayStatus;
    }

    /**
     * Sets the value of the repayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayStatus(String value) {
        this.repayStatus = value;
    }

    /**
     * Gets the value of the billAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillAmt() {
        return billAmt;
    }

    /**
     * Sets the value of the billAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillAmt(BigDecimal value) {
        this.billAmt = value;
    }

    /**
     * Gets the value of the paidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidAmt() {
        return paidAmt;
    }

    /**
     * Sets the value of the paidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidAmt(BigDecimal value) {
        this.paidAmt = value;
    }

    /**
     * Gets the value of the dueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDueAmt() {
        return dueAmt;
    }

    /**
     * Sets the value of the dueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDueAmt(BigDecimal value) {
        this.dueAmt = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

}
