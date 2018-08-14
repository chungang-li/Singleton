/**
 * 懒汉式(线程不安全，同步代码块)[不可用]
 *
 * 还是会实例化多次的情况
 */
public class Singleton_5 {

    private static Singleton_5 instance;

    private Singleton_5() {
    }

    public static Singleton_5 getInstance() {
        if (instance == null) {
            synchronized (Singleton_5.class) {
                instance = new Singleton_5();
            }
        }
        return instance;
    }
}
