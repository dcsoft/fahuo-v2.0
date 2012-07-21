/**
 * 
 */
package models;

import java.util.Set;

import play.db.jpa.Model;

/**
 * 网点
 * <p>Title:Branch.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-4-28][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Branch extends Model {
    
    public String        code;               // 网点编码
    public String        name;               // 网点名称
    public String        contact;            // 联系人
    public String        telephone;          // 电话
    public String        mobilePhone;        // 手机
    public String        fax;                // 传真             
    public Set<Integer>  businessContent;    // 业务内容
    public String        deliveryArea;       // 派送区域
    public String        notDeliveryArea;    // 不派送区域
    public String        pickArea;           // 接货区域
    public String        notPickArea;        // 不接货区域
    public String        comment;            // 备注、说明
    public District      district;           // 行政区划
    public String        streetAddress;      // 街道地址
    public String        location;           // 地图标注位置
    // 经纬度：longitude and latitude
}
