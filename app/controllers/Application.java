package controllers;

import play.*;
import play.cache.Cache;
import play.libs.Images;
import play.mvc.*;

import java.util.*;

import models.*;

/**
 * 应用程序
 * <p>Title:Application.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-5-4][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Application extends Controller {
    
    public static void checkAccess() throws Throwable {
        Secure.checkAccess();
    }
    
    /**
     * 首页
     */
    public static void index() {
        render();
    }

    public static void mobileApp() {
        render();
    }

    public static void mobileWeb() {
        render();
    }

    public static void help() {
        render();
    }

    /**
     * 注册
     */
    public static void signup() {
        render();
    }

    public static void singupCommit() {
        flash("msg", "注册完成！");
        message();
    }

    /**
     * 找回密码
     */
    public static void retrievePass() {

    }

    /**
     * 物流商入驻
     */
    public static void applyJoin() {

    }
    
    public static void captcha(String id) {
        Images.Captcha captcha = Images.captcha();
        String code = captcha.getText();
        Cache.set(id, code, "10mn");
        renderBinary(captcha);
    }

    public static void message() {
        String msg = flash.get("msg");
        render(msg);
    }

    public static void error404() {
        render("errors/404.html");
    }

    public static void error500() {
        render("errors/500.html");
    }

}