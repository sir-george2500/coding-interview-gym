import FactoryMethod.*;
import Singleton.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();

        NotificationCreator creator;
        creator = new SMSNotificationCreator();
        creator.send("Hello World SMS!");

        creator = new EmailNotificationCreator();
        creator.send("Hello World Email!");

        creator = new PushNotificationCreator();
        creator.send("Hello World Push!");
    }
}