/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;


/**
 * 用户
 * <p>Title:User.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-4-28][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
@Entity
public class User extends Model {
    public static final int SEX_FEMALE  = 0;
    public static final int SEX_MALE    = 1;
    public static final int SEX_OTHER   = 2;
    
    public static final int STATUS_LOCKED = 0;
    public static final int STATUS_ACTIVE = 1;
    
    public String   username;      // 用户名
    public String   password;      // 密码
    public String   name;          // 姓名
    public int      sex;           // 性别
    public String   email;         // 电子邮箱
    public String   telephone;     // 固定电话
    public String   mobilephone;   // 手机
    public String   fax;           // 传真
    public District district;      // 行政区划 
    public String   streetAddress; // 街道地址
    public String   zipcode;       // 邮政编码
    
    public Date     signupDate;    // 注册日期
    public int      status;        // 状态
    public Company  company;       // 公司
    
    
    
    public static User connect(String username, String password) {
        return User.find("byUsernameAndPassword", username, password).first();
    }
}
