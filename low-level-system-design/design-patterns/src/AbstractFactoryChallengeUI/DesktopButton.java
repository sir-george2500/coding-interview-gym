package AbstractFactoryChallengeUI;

public class DesktopButton implements Button {
   @Override
    public void paint() {
         System.out.println("Rendering a button in a desktop style.");
    }
}
