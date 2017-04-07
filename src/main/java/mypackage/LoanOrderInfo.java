
package mypackage;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loanOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loamAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LoanPeriods" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="outBillCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paidPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overduePeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="surplusPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inBillCnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="curDueAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lastLimiteTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dailyPunishLong" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="bankCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lendingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cloanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRepayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsFrozen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bills" type="{http://tempuri.org/}ArrayOfStatementDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanOrderInfo", propOrder = {
    "orderId",
    "userName",
    "contractNo",
    "contractStatus",
    "loamAmt",
    "loanPeriods",
    "outBillCnt",
    "paidPeriods",
    "overduePeriods",
    "surplusPeriods",
    "inBillCnt",
    "curDueAmt",
    "lastLimiteTime",
    "curAmt",
    "dailyPunishLong",
    "bankCard",
    "bankName",
    "lendingTime",
    "clearTime",
    "cloanStatus",
    "operable",
    "isRepayment",
    "isFrozen",
    "bills"
})
public class LoanOrderInfo {

    protected long orderId;
    protected String userName;
    protected String contractNo;
    protected String contractStatus;
    @XmlElement(required = true)
    protected BigDecimal loamAmt;
    @XmlElement(name = "LoanPeriods")
    protected long loanPeriods;
    protected int outBillCnt;
    protected int paidPeriods;
    protected int overduePeriods;
    protected int surplusPeriods;
    protected int inBillCnt;
    @XmlElement(required = true)
    protected BigDecimal curDueAmt;
    protected String lastLimiteTime;
    @XmlElement(required = true)
    protected BigDecimal curAmt;
    @XmlElement(required = true)
    protected BigDecimal dailyPunishLong;
    protected String bankCard;
    protected String bankName;
    protected String lendingTime;
    protected String clearTime;
    protected String cloanStatus;
    protected String operable;
    @XmlElement(name = "IsRepayment")
    protected String isRepayment;
    @XmlElement(name = "IsFrozen")
    protected boolean isFrozen;
    protected ArrayOfStatementDetail bills;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the loamAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoamAmt() {
        return loamAmt;
    }

    /**
     * Sets the value of the loamAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoamAmt(BigDecimal value) {
        this.loamAmt = value;
    }

    /**
     * Gets the value of the loanPeriods property.
     * 
     */
    public long getLoanPeriods() {
        return loanPeriods;
    }

    /**
     * Sets the value of the loanPeriods property.
     * 
     */
    public void setLoanPeriods(long value) {
        this.loanPeriods = value;
    }

    /**
     * Gets the value of the outBillCnt property.
     * 
     */
    public int getOutBillCnt() {
        return outBillCnt;
    }

    /**
     * Sets the value of the outBillCnt property.
     * 
     */
    public void setOutBillCnt(int value) {
        this.outBillCnt = value;
    }

    /**
     * Gets the value of the paidPeriods property.
     * 
     */
    public int getPaidPeriods() {
        return paidPeriods;
    }

    /**
     * Sets the value of the paidPeriods property.
     * 
     */
    public void setPaidPeriods(int value) {
        this.paidPeriods = value;
    }

    /**
     * Gets the value of the overduePeriods property.
     * 
     */
    public int getOverduePeriods() {
        return overduePeriods;
    }

    /**
     * Sets the value of the overduePeriods property.
     * 
     */
    public void setOverduePeriods(int value) {
        this.overduePeriods = value;
    }

    /**
     * Gets the value of the surplusPeriods property.
     * 
     */
    public int getSurplusPeriods() {
        return surplusPeriods;
    }

    /**
     * Sets the value of the surplusPeriods property.
     * 
     */
    public void setSurplusPeriods(int value) {
        this.surplusPeriods = value;
    }

    /**
     * Gets the value of the inBillCnt property.
     * 
     */
    public int getInBillCnt() {
        return inBillCnt;
    }

    /**
     * Sets the value of the inBillCnt property.
     * 
     */
    public void setInBillCnt(int value) {
        this.inBillCnt = value;
    }

    /**
     * Gets the value of the curDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurDueAmt() {
        return curDueAmt;
    }

    /**
     * Sets the value of the curDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurDueAmt(BigDecimal value) {
        this.curDueAmt = value;
    }

    /**
     * Gets the value of the lastLimiteTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLimiteTime() {
        return lastLimiteTime;
    }

    /**
     * Sets the value of the lastLimiteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLimiteTime(String value) {
        this.lastLimiteTime = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurAmt(BigDecimal value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the dailyPunishLong property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyPunishLong() {
        return dailyPunishLong;
    }

    /**
     * Sets the value of the dailyPunishLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyPunishLong(BigDecimal value) {
        this.dailyPunishLong = value;
    }

    /**
     * Gets the value of the bankCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * Sets the value of the bankCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCard(String value) {
        this.bankCard = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the lendingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLendingTime() {
        return lendingTime;
    }

    /**
     * Sets the value of the lendingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLendingTime(String value) {
        this.lendingTime = value;
    }

    /**
     * Gets the value of the clearTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearTime() {
        return clearTime;
    }

    /**
     * Sets the value of the clearTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearTime(String value) {
        this.clearTime = value;
    }

    /**
     * Gets the value of the cloanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloanStatus() {
        return cloanStatus;
    }

    /**
     * Sets the value of the cloanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloanStatus(String value) {
        this.cloanStatus = value;
    }

    /**
     * Gets the value of the operable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperable() {
        return operable;
    }

    /**
     * Sets the value of the operable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperable(String value) {
        this.operable = value;
    }

    /**
     * Gets the value of the isRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRepayment() {
        return isRepayment;
    }

    /**
     * Sets the value of the isRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRepayment(String value) {
        this.isRepayment = value;
    }

    /**
     * Gets the value of the isFrozen property.
     * 
     */
    public boolean isIsFrozen() {
        return isFrozen;
    }

    /**
     * Sets the value of the isFrozen property.
     * 
     */
    public void setIsFrozen(boolean value) {
        this.isFrozen = value;
    }

    /**
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatementDetail }
     *     
     */
    public ArrayOfStatementDetail getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatementDetail }
     *     
     */
    public void setBills(ArrayOfStatementDetail value) {
        this.bills = value;
    }

}
