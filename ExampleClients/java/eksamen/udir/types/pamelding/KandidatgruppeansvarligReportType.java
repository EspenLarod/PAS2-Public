//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 04:16:59 PM CEST 
//


package udir.types.pamelding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KandidatgruppeansvarligReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KandidatgruppeansvarligReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fodselsnr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KandidatgruppeansvarligReportType", propOrder = {
    "fodselsnr"
})
public class KandidatgruppeansvarligReportType {

    @XmlElement(name = "Fodselsnr", required = true)
    protected String fodselsnr;

    /**
     * Gets the value of the fodselsnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFodselsnr() {
        return fodselsnr;
    }

    /**
     * Sets the value of the fodselsnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFodselsnr(String value) {
        this.fodselsnr = value;
    }

}
