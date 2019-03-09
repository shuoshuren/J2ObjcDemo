
import utils.TimeUtils;
import internel.PrayTimeParam;
import internel.PrayTimeUtil;
import internel.PrayerCalTime;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Muslim朝拜时间算法工具类
 * @author xuechao
 * @date 2019/3/7 上午11:05
 * @copyright cpx
 */
public class PrayTimeBaseTools {


    /**
     * 计算朝拜时间
     * @param param 计算的参数
     * @param day 计算的天数，从今天开始计算
     * @return
     */
    public static List<PrayerCalTime> getPrayTimes(PrayTimeParam param, int day){
        PrayTimeUtil prayers = new PrayTimeUtil();
        prayers.setCalcMethod(param.getMethod());
        prayers.setTimeFormat(param.getTimeFormat());
        prayers.setAsrJuristic(param.getAsrJuristic());
        prayers.setAdjustHighLats(param.getAdjustHighLats());
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        List<PrayerCalTime> list = new ArrayList<>();
        for (int i = 0; i < day; i++) {
            ArrayList<String> times = prayers.getPrayerTimes(cal, param.getLatitude(), param.getLongitude(), param.getZone());
            list.add(new PrayerCalTime(i, TimeUtils.millis2String(cal.getTimeInMillis(), TimeUtils.DATE_FORMAT_YMD), times));
            // 向后1day
            cal.add(Calendar.DATE, 1); 
        }

        return list;
    }

}
