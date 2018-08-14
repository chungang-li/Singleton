/**
 * 静态内部类【推荐，lazy-loading】
 */
public class Singleton_7 {

    private Singleton_7() {
    }

    private static class SingletonInstance {
        private static Singleton_7 instance = new Singleton_7();
    }

    public static Singleton_7 getInstance() {
        return SingletonInstance.instance;
    }
}
