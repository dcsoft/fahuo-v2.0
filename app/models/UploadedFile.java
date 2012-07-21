/**
 * 
 */
package models;

import play.db.jpa.Model;

/**
 * 上传文件
 * <p>Title:UploadedFile.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-5-4][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class UploadedFile extends Model {
    
    /*
     * 上传的文件根据不同的类型和用途分别放在不同的目录（catalog）中
     * 目录规则如下：[类型]/[年份]/[月份]/，文件的SHA1值作为文件名
     * 上传：上传时根据上述规则将文件存入指定目录，同时生成一个12位随机字符串用于文件链接
     * 
     * 删除：
     * 
     * 引用：
     */
    
    public String  filename;  // 上传时的文件名，供文件下载用
    public String  catalog;   // 目录。文件存放在磁盘上的相对目录
    public String  type;      // 文件类型。可以分为图片、文档和文件
    public int     size;      // 文件大小
    public String  path;      // 路径，用于请求该文件
    public String  sha1;      // 文件的SHA1值

}
