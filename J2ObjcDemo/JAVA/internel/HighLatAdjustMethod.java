package internel;

/**
 * 高纬度调整方法
 *
 * @author xuechao
 * @date 2019/3/7 下午2:11
 * @copyright cpx
 */
public enum HighLatAdjustMethod {

    /**
     * No adjustment
     */
    None(0),

    /**
     * middle of night
     */
    MidNight(1),

    /**
     * 1/7th of night
     */
    OneSeventh(2),

    /**
     * angle/60th of night
     */
    AngleBased(3);


    private int value;

    private HighLatAdjustMethod(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
