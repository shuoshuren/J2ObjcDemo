package internel;


import java.util.Calendar;
import utils.TimeUtils;

/**
 * 朝拜时间参数
 * @author xuechao
 * @date 2019/3/7 上午11:11
 * @copyright cpx
 */
public class PrayTimeParam {

    /**
     * 经度
     */
    private double longitude;

    /**
     * 纬度
     */
    private double latitude;

    /**
     * 时区
     */
    private double zone;

    /**
     * 时间格式
     * @see PrayTimeFormat#TIME_24
     * @see PrayTimeFormat#TIME_12
     * @see PrayTimeFormat#TIME_12_NO_SUFFIX
     * @see PrayTimeFormat#FLOATING
     */
    private int timeFormat;

    /**
     * 计算方法
     */
    private int method;


    /**
     * 派系
     */
    private int asrJuristic;

    /**
     * 高纬度
     */
    private int adjustHighLats;

    private PrayTimeParam(){

        this.zone = TimeUtils.getTimeZone();
        this.timeFormat = PrayTimeFormat.TIME_24.getValue();
        this.method = CalcMethod.Makkah.getValue();
        this.asrJuristic = JuristicMethod.Shafii.getValue();
        this.adjustHighLats = HighLatAdjustMethod.AngleBased.getValue();

    }

    public PrayTimeParam(double longitude, double latitude, double zone, int timeFormat, int method, int asrJuristic, int adjustHighLats) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.zone = zone;
        this.timeFormat = timeFormat;
        this.method = method;
        this.asrJuristic = asrJuristic;
        this.adjustHighLats = adjustHighLats;
    }

    /**
     * 获取默认的参数
     * @param longitude 经度
     * @param latitude 纬度
     * @return
     */
    public static PrayTimeParam getDefaultParam(double longitude,double latitude){
        PrayTimeParam param = new PrayTimeParam();
        param.setLongitude(longitude);
        param.setLatitude(latitude);
        return param;
    }


    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getZone() {
        return zone;
    }

    public void setZone(double zone) {
        this.zone = zone;
    }

    public int getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(int timeFormat) {
        this.timeFormat = timeFormat;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public int getAsrJuristic() {
        return asrJuristic;
    }

    public void setAsrJuristic(int asrJuristic) {
        this.asrJuristic = asrJuristic;
    }

    public int getAdjustHighLats() {
        return adjustHighLats;
    }

    public void setAdjustHighLats(int adjustHighLats) {
        this.adjustHighLats = adjustHighLats;
    }

    @Override
    public String toString() {
        return "PrayTimeParam{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", zone=" + zone +
                ", timeFormat=" + timeFormat +
                ", method=" + method +
                ", asrJuristic=" + asrJuristic +
                ", adjustHighLats=" + adjustHighLats +
                '}';
    }
}
