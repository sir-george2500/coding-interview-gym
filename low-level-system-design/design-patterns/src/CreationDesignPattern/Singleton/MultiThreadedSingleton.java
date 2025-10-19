package CreationDesignPattern.Singleton;

public class MultiThreadedSingleton {
    private static MultiThreadedSingleton instance = null;

    private MultiThreadedSingleton() {
        // private constructor to prevent instantiation
    }

    public static MultiThreadedSingleton getInstance() {
        if (instance == null) {
            synchronized (MultiThreadedSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadedSingleton();
                }
            }
            instance = new MultiThreadedSingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello and welcome!");
    }
}
