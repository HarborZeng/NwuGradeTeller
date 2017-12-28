
package cn.tellyouwhat.gradeteller.murpnewsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMurpcustomi complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMurpcustomi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Murpcustomi" type="{http://murpcn.com/murpwebservice/}Murpcustomi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMurpcustomi", propOrder = {
    "murpcustomi"
})
public class ArrayOfMurpcustomi {

    @XmlElement(name = "Murpcustomi", nillable = true)
    protected List<Murpcustomi> murpcustomi;

    /**
     * Gets the value of the murpcustomi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the murpcustomi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMurpcustomi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Murpcustomi }
     * 
     * 
     */
    public List<Murpcustomi> getMurpcustomi() {
        if (murpcustomi == null) {
            murpcustomi = new ArrayList<Murpcustomi>();
        }
        return this.murpcustomi;
    }

}
