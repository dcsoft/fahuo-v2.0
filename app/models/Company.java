/**
 * 
 */
package models;

import java.util.Set;

import play.db.jpa.Model;

/**
 * 公司
 * <p>Title:Company.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-4-28][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Company extends Model {
    
    public String     name;               // 公司名称
    public String     telephone;          // 客服电话
    public String     workingTime;        // 客服工作时间
    public String     fax;                // 传真
    public String     address;            // 公司地址
    public String     website;            // 公司网址
    public String     logoPath;           // 公司logo路径
    public String     briefIntro;         // 公司简介
    public String     detail;             // 公司详细介绍
    
    public Set<User>  users;              // 公司用户
}
