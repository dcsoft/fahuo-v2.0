package controllers;

import play.*;
import play.cache.Cache;
import play.libs.Images;
import play.mvc.*;

import java.util.*;

import models.*;

/**
 * 帮助中心
 * <p>Title:Help.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-7-20][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Help extends Controller {
    
    /**
     * 关于
     */
    public static void about() {
        render();
    }

    /**
     * 常见问题
     */
    public static void faq() {
        render();
    }

    /**
     * 联系我们
     */
    public static void contactus() {
        render();
    }

    /**
     * 欢迎合作
     */
    public static void cooperation() {
        render();
    }

}