import PrototypeEnemyChallenge.Enemy;
import PrototypeEnemyChallenge.EnemyRegistry;


public class Main {
  public static void main(String[] args){
//      DesktopFactory desktopFactory = new DesktopFactory();
//      desktopFactory.createMenu().display();
//
//      MobileFactory mobileFactory = new MobileFactory();
//      mobileFactory.createMenu().display();
//
//      // implement the builder pattern for house here
//      WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();
//      HouseDirector houseDirector = new HouseDirector(woodHouseBuilder);
//      houseDirector.constructHouse();
//
//      BricksHouseBuilder bricksHouseBuilder = new BricksHouseBuilder();
//      HouseDirector houseDirector1 = new HouseDirector(bricksHouseBuilder);
//      houseDirector1.constructHouse();

//     Rectangle rectangle = new Rectangle();
//     rectangle.setHeight(10);
//     rectangle.setWidth(20);
//     rectangle.setColor("Red");
//     System.out.println(rectangle);
//
//     Rectangle anotherRectangle = (Rectangle) rectangle.clone();
//     System.out.print("Cloned ");
//     System.out.println(anotherRectangle);


      // Register prototype enemies

      EnemyRegistry registry = new EnemyRegistry();
      registry.register("flying", new Enemy("FlyingEnemy", 100, 12.0, false, "Laser"));

      registry.register("armored", new Enemy("ArmoredEnemy", 300, 6.0, true, "Cannon"));


      // Clone from registry

      Enemy e1 = registry.get("flying");
      Enemy e2 = registry.get("armored");
      Enemy e3 = registry.get("flying");

      e1.printStats();
      e2.printStats();
      e3.printStats();




  }

}