/**
 * 懒汉式(线程安全，同步方法)[不推荐用]
 * <p>
 * 效率太低了，只有第一次初始化时才需要同步，而不是每次都进行同步
 */
public class Singleton_4 {
    private static Singleton_4 instance;

    private Singleton_4() {
    }

    public static synchronized Singleton_4 getInstance() {
        if (instance == null) {
            instance = new Singleton_4();
        }
        return instance;
    }
}
