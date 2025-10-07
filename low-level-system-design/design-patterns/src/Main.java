import AbstractFactoryChallengeUI.DesktopFactory;
import AbstractFactoryChallengeUI.MobileFactory;
import Builder.BricksHouseBuilder;
import Builder.HouseDirector;
import Builder.WoodHouseBuilder;

public class Main {
  public static void main(String[] args){
      DesktopFactory desktopFactory = new DesktopFactory();
      desktopFactory.createMenu().display();

      MobileFactory mobileFactory = new MobileFactory();
      mobileFactory.createMenu().display();

      // implement the builder pattern for house here
      WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();
      HouseDirector houseDirector = new HouseDirector(woodHouseBuilder);
      houseDirector.constructHouse();

      BricksHouseBuilder bricksHouseBuilder = new BricksHouseBuilder();
      HouseDirector houseDirector1 = new HouseDirector(bricksHouseBuilder);
      houseDirector1.constructHouse();

  }

}