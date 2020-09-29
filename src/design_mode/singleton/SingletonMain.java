package design_mode.singleton;

public class SingletonMain {
    private static volatile SingletonMain instance = null;    //保证 instance 在所有线程中同步

    private SingletonMain() {
    }    //private 避免类在外部被实例化

    public static synchronized SingletonMain getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new SingletonMain();
        }
        return instance;
    }
}