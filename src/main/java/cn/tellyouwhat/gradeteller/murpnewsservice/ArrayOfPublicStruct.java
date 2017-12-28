
package cn.tellyouwhat.gradeteller.murpnewsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPublicStruct complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPublicStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicStruct" type="{http://murpcn.com/murpwebservice/}PublicStruct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPublicStruct", propOrder = {
    "publicStruct"
})
public class ArrayOfPublicStruct {

    @XmlElement(name = "PublicStruct", nillable = true)
    protected List<PublicStruct> publicStruct;

    /**
     * Gets the value of the publicStruct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicStruct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicStruct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicStruct }
     * 
     * 
     */
    public List<PublicStruct> getPublicStruct() {
        if (publicStruct == null) {
            publicStruct = new ArrayList<PublicStruct>();
        }
        return this.publicStruct;
    }

}
