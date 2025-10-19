package CreationDesignPattern.AbstractFactoryChallengeUI;

public class MobileButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a mobile style.");
    }
}
