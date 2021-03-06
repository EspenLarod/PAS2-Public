//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 04:16:55 PM CEST 
//


package udir.types.eksamensplan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EksamensperiodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EksamensperiodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PameldingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PameldingStopp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GjennomforingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GjennomforingStopp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EksamensperiodeType", propOrder = {
    "kode",
    "pameldingStart",
    "pameldingStopp",
    "gjennomforingStart",
    "gjennomforingStopp"
})
public class EksamensperiodeType {

    @XmlElement(name = "Kode", required = true)
    protected String kode;
    @XmlElement(name = "PameldingStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pameldingStart;
    @XmlElement(name = "PameldingStopp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pameldingStopp;
    @XmlElement(name = "GjennomforingStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gjennomforingStart;
    @XmlElement(name = "GjennomforingStopp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gjennomforingStopp;

    /**
     * Gets the value of the kode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKode() {
        return kode;
    }

    /**
     * Sets the value of the kode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKode(String value) {
        this.kode = value;
    }

    /**
     * Gets the value of the pameldingStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPameldingStart() {
        return pameldingStart;
    }

    /**
     * Sets the value of the pameldingStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPameldingStart(XMLGregorianCalendar value) {
        this.pameldingStart = value;
    }

    /**
     * Gets the value of the pameldingStopp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPameldingStopp() {
        return pameldingStopp;
    }

    /**
     * Sets the value of the pameldingStopp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPameldingStopp(XMLGregorianCalendar value) {
        this.pameldingStopp = value;
    }

    /**
     * Gets the value of the gjennomforingStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGjennomforingStart() {
        return gjennomforingStart;
    }

    /**
     * Sets the value of the gjennomforingStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGjennomforingStart(XMLGregorianCalendar value) {
        this.gjennomforingStart = value;
    }

    /**
     * Gets the value of the gjennomforingStopp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGjennomforingStopp() {
        return gjennomforingStopp;
    }

    /**
     * Sets the value of the gjennomforingStopp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGjennomforingStopp(XMLGregorianCalendar value) {
        this.gjennomforingStopp = value;
    }

}
