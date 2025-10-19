package CreationDesignPattern.Singleton;

public class Singleton {

    private Singleton(){}

    // private static nested class for holding the CreationDesignPattern.Singleton.CreationDesignPattern.Singleton instance
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello and welcome!");
    }

}
