/**
 * 
 */
package controllers;

import play.mvc.Controller;

/**
 * 专线线路
 * <p>Title:Lines.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-5-4][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Lines extends Controller {

    /**
     * 专线列表
     */
    public static void list() {
        render();
    }

    /**
     * 网点列表
     */
    public static void place() {
        render();
    }

    /**
     * 网点详情
     */
    public static void info() {
        render();
    }
}
