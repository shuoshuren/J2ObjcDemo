package internel;


/**
 * Juristic Method
 *
 * @author xuechao
 * @date 2019/3/7 下午2:05
 * @copyright cpx
 */
public enum JuristicMethod {

    /**
     * Shafii (standard)
     */
    Shafii(0),

    /**
     * Hanafi
     */
    Hanafi(1);

    private int value;

    private JuristicMethod(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
