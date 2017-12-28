
package cn.tellyouwhat.gradeteller.murpnewsservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取newsId属性的值。
     * 
     */
    public int getNewsId() {
        return newsId;
    }

    /**
     * 设置newsId属性的值。
     * 
     */
    public void setNewsId(int value) {
        this.newsId = value;
    }

    /**
     * 获取topNum属性的值。
     * 
     */
    public int getTopNum() {
        return topNum;
    }

    /**
     * 设置topNum属性的值。
     * 
     */
    public void setTopNum(int value) {
        this.topNum = value;
    }

}
