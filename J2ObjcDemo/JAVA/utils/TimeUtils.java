package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 时间工具类
 * @author xuechao
 * @date 2019/3/7 上午11:41
 * @copyright cpx
 */
public class TimeUtils {

    private static final ThreadLocal<SimpleDateFormat> SDF_THREAD_LOCAL = new ThreadLocal<>();


    /**
     * 时间日期格式化到年月日.
     */
    public static final String DATE_FORMAT_YMD = "yyyy-MM-dd";


    private static SimpleDateFormat getDefaultFormat(String format) {
        SimpleDateFormat simpleDateFormat = SDF_THREAD_LOCAL.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat(format, Locale.getDefault());
            SDF_THREAD_LOCAL.set(simpleDateFormat);
        }
        simpleDateFormat.applyPattern(format);
        return simpleDateFormat;
    }

    /**
     * 获取时区
     * @return
     */
    public static int getTimeZone(){
        Calendar calendar = Calendar.getInstance();
        int offsetTime = calendar.getTimeZone().getOffset(calendar.getTimeInMillis());
        return offsetTime / (1000 * 60 * 60);
    }


    public static String millis2String(final long millis,String format) {
        return millis2String(millis, getDefaultFormat(format));
    }

    /**
     * Milliseconds to the formatted time string.
     *
     * @param millis The milliseconds.
     * @param format The format.
     * @return the formatted time string
     */
    public static String millis2String(final long millis,final DateFormat format) {
        return format.format(new Date(millis));
    }
}
