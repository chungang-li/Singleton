/**
 *Double-check [推荐，线程安全] Lazy-loading
 */
public class Singleton_6 {

    private static Singleton_6 instance;


    private Singleton_6() {
    }


    public static Singleton_6 getInstance() {
        if (instance == null) {
            synchronized (Singleton_6.class) {
                if (instance == null) {
                    instance = new Singleton_6();
                }
            }
        }
        return instance;
    }

}
