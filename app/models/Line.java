package models;

/**
 * 线路、专线
 * <p>Title:Line.java</p>
 * <p>Description:</p>
 * <p><b>更新记录：</b>
 * [2012-4-28][v1.0][牛博]新建。<br>
 * </p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Company: 山东大成软件有限公司</p>
 */
public class Line {
    
    // 运输时效类型
    public static final int TRANSPORT_TIME_HOUR = 0;
    public static final int TRANSPORT_TIME_DAY = 1;
    public static final int TRANSPORT_TIME_MULTYDAY = 2;
    
    public String   name;                      // 名称
    public String   transportMode;             // 运价模式
    public boolean  recommend;                 // 特殊标识 - 推荐
    public int      transportTimeType;         // 运输时效类型
    public int      transportTimeHours;        // 运输时效小时数
    public int      transportTimeDays;         // 运输时效天数
    public int      transportTimeDaysFrom;     // 运输时效天数 - 从
    public int      transportTimeDaysTo;       // 运输时效天数 - 到
    public District origin;                    // 始发地
    public District destination;               // 目的地
    public double   minimumCharge;             // 最低一票价格
    public String   comment;                   // 备注、说明
}
