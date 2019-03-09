package internel;

import java.util.ArrayList;

/**
 *
 * 朝拜计算的时间
 * @author xuechao
 * @date 2019/3/7 下午1:10
 * @copyright cpx
 */
public class PrayerCalTime {

    private int index;

    private String day;

    private ArrayList<String> time;


    public PrayerCalTime(int index, String day, ArrayList<String> time) {
        this.index = index;
        this.day = day;
        this.time = time;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public ArrayList<String> getTime() {
        return time;
    }

    public void setTime(ArrayList<String> time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PrayerCalTime{" +
                "index=" + index +
                ", day='" + day + '\'' +
                ", time=" + time +
                '}';
    }
}
