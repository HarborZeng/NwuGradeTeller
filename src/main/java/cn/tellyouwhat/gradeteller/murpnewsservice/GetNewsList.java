
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
 *         &lt;element name="newsId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="topNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "newsId",
    "topNum"
})
@XmlRootElement(name = "GetNewsList")
public class GetNewsList {

    protected int newsId;
    protected int topNum;

    /**
     * ��ȡnewsId���Ե�ֵ��
     * 
     */
    public int getNewsId() {
        return newsId;
    }

    /**
     * ����newsId���Ե�ֵ��
     * 
     */
    public void setNewsId(int value) {
        this.newsId = value;
    }

    /**
     * ��ȡtopNum���Ե�ֵ��
     * 
     */
    public int getTopNum() {
        return topNum;
    }

    /**
     * ����topNum���Ե�ֵ��
     * 
     */
    public void setTopNum(int value) {
        this.topNum = value;
    }

}
