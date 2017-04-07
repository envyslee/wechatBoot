
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
 *         &lt;element name="identNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "identNo",
    "businessID",
    "contractNo"
})
@XmlRootElement(name = "Excute")
public class Excute {

    protected String identNo;
    protected String businessID;
    protected String contractNo;

    /**
     * Gets the value of the identNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentNo() {
        return identNo;
    }

    /**
     * Sets the value of the identNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentNo(String value) {
        this.identNo = value;
    }

    /**
     * Gets the value of the businessID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessID() {
        return businessID;
    }

    /**
     * Sets the value of the businessID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessID(String value) {
        this.businessID = value;
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

}
