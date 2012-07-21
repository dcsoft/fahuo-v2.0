/**
 * 
 */
package controllers;

import play.mvc.Controller;

/**
 * 账户设置
 * <p>Title:Accounts.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-5-4][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Accounts extends Controller {

    /**
     * 个人资料
     */
    public static void profileForm() {
        render();
    }

    /**
     * 保存个人资料
     */
    public static void profileSave() {
        profileForm();
    }

    /**
     * 手机验证
     */
    public static void mobileForm() {
        render();
    }

    /**
     * 保存手机号码
     */
    public static void mobileSave() {
        mobileSave();
    }

    /**
     * 邮箱验证
     */
    public static void emailForm() {
        render();
    }

    /**
     * 保存邮箱
     */
    public static void emailSave() {
        emailForm();
    }

    /**
     * 修改密码
     */
    public static void passwordForm() {
        render();
    }

    /**
     * 保存新密码
     */
    public static void passwordSave() {
        passwordForm();
    }

}
