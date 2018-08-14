/**
 * 饿汉式（静态代码块）[可用]
 * 同第一种
 */
public class Singleton_2 {

    private static Singleton_2 instance;

    static {
        instance = new Singleton_2();
    }

    private Singleton_2(){}

    public static Singleton_2 getInstance() {
        return instance;
    }
}
