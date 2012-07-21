/**
 * 
 */
package controllers;

import models.User;

/**
 * 
 * <p>Title:Security.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-5-11][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Security extends Secure.Security {

    public static boolean authenticate(String username, String password) {
        return User.connect(username, password) != null;
    }
}
