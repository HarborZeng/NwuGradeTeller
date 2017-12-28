
package cn.tellyouwhat.gradeteller.murpnewsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfAcademy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAcademy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Academy" type="{http://murpcn.com/murpwebservice/}Academy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAcademy", propOrder = {
    "academy"
})
public class ArrayOfAcademy {

    @XmlElement(name = "Academy", nillable = true)
    protected List<Academy> academy;

    /**
     * Gets the value of the academy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Academy }
     * 
     * 
     */
    public List<Academy> getAcademy() {
        if (academy == null) {
            academy = new ArrayList<Academy>();
        }
        return this.academy;
    }

}
