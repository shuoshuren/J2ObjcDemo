package internel;


/**
 * 朝拜时间计算方式
 * @author xuechao
 * @date 2019/3/7 下午1:55
 * @copyright cpx
 */
public enum CalcMethod {

    /**
     * Ithna Ashari
     */
    Jafari(0),
    /**
     * University of Islamic Sciences, Karachi
     */
    Karachi(1),

    /**
     * Islamic Society of North America (ISNA)
     */
    ISNA(2),

    /**
     * Muslim World League (MWL)
     */
    MWL(3),

    /**
     * Umm al-Qura, Makkah
     */
    Makkah(4),

    /**
     * Egyptian General Authority of Survey
     */
    Egypt(5),

    /**
     * Institute of Geophysics, University of Tehran
     */
    Tehran(6),

    /**
     * Custom Setting
     */
    Custom(7);

    private int value;

    private CalcMethod(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

