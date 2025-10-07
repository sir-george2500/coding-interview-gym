package AbstractFactory;

public class MacOSCheckBox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created a MacOS CheckBox.");
    }
}
