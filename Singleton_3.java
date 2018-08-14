/**
 * 懒汉式(线程不安全)[不可用]
 * <p>
 * 这种写法起到了Lazy Loading的效果，但是只能在单线程下使用。如果在多线程下，
 * 一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
 */
public class Singleton_3 {

    private static Singleton_3 instance;

    private Singleton_3() {
    }

    public static Singleton_3 getInstance() {
        if (instance == null) {
            instance = new Singleton_3();
        }
        return instance;
    }

}
