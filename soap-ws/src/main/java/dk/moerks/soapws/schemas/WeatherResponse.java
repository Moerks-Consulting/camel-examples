//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.19 at 09:54:38 AM CET 
//


package dk.moerks.soapws.schemas;

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
 *         &lt;element name="temp_celsius" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="forecast" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "tempCelsius",
    "forecast"
})
@XmlRootElement(name = "WeatherResponse")
public class WeatherResponse {

    @XmlElement(name = "temp_celsius")
    protected int tempCelsius;
    @XmlElement(required = true)
    protected String forecast;

    /**
     * Gets the value of the tempCelsius property.
     * 
     */
    public int getTempCelsius() {
        return tempCelsius;
    }

    /**
     * Sets the value of the tempCelsius property.
     * 
     */
    public void setTempCelsius(int value) {
        this.tempCelsius = value;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecast(String value) {
        this.forecast = value;
    }

}
