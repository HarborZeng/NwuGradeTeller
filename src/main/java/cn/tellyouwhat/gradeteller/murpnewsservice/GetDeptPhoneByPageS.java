
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mcid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "mcid",
    "page"
})
@XmlRootElement(name = "GetDeptPhoneByPage_S")
public class GetDeptPhoneByPageS {

    protected int mcid;
    protected int page;

    /**
     * ��ȡmcid���Ե�ֵ��
     * 
     */
    public int getMcid() {
        return mcid;
    }

    /**
     * ����mcid���Ե�ֵ��
     * 
     */
    public void setMcid(int value) {
        this.mcid = value;
    }

    /**
     * ��ȡpage���Ե�ֵ��
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * ����page���Ե�ֵ��
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
