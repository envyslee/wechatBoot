
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
 *         &lt;element name="ExcuteResult" type="{http://tempuri.org/}ArrayOfLoanOrderInfo" minOccurs="0"/>
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
    "excuteResult"
})
@XmlRootElement(name = "ExcuteResponse")
public class ExcuteResponse {

    @XmlElement(name = "ExcuteResult")
    protected ArrayOfLoanOrderInfo excuteResult;

    /**
     * Gets the value of the excuteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLoanOrderInfo }
     *     
     */
    public ArrayOfLoanOrderInfo getExcuteResult() {
        return excuteResult;
    }

    /**
     * Sets the value of the excuteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLoanOrderInfo }
     *     
     */
    public void setExcuteResult(ArrayOfLoanOrderInfo value) {
        this.excuteResult = value;
    }

}
