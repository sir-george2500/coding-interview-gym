package CreationDesignPattern.AbstractFactoryChallengeUI;

public class MobileFactory implements DevicesFactory {
    @Override
    public Button createButton() {
        return new MobileButton();
    }

    @Override
    public Menu createMenu() {
        return new MobileMenu();
    }

    @Override
    public TextField createTextField() {
        return new MobileTextField();
    }
}
