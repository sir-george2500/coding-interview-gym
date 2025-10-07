package AbstractFactoryChallengeUI;

public class DesktopFactory implements DevicesFactory {
    @Override
    public Button createButton() {
        return new DesktopButton();
    }

    @Override
    public Menu createMenu() {
        return new DesktopMenu();
    }

    @Override
    public TextField createTextField() {
        return new DesktopTextField();
    }
}
