package internel;


/**
 * 朝拜时间格式的枚举类
 *
 * @author xuechao
 * @date 2019/3/7 上午11:11
 * @copyright cpx
 */
public enum PrayTimeFormat {

    /**
     * 24-hour format
     */
    TIME_24(0),

    /**
     * 12-hour format
     */
    TIME_12(1),

    /**
     * 12-hour format with no suffix
     */
    TIME_12_NO_SUFFIX(2),

    /**
     * 浮点数
     */
    FLOATING(3);


    private int value;

    private PrayTimeFormat(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
