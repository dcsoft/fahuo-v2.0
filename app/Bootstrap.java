import models.User;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 * 
 */

/**
 * 
 * <p>Title:Bootstrap.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-5-11][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {
        if (User.count() == 0) {
            Fixtures.loadModels("data.yml");
        }
    }
}
