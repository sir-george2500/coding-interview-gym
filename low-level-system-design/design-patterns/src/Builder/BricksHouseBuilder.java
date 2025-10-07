package Builder;

public class BricksHouseBuilder implements HouseBuilder {
    private House house;

    public BricksHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete, reinforced with steel");
        System.out.println("Builder.BricksHouseBuilder: Foundation with concrete, reinforced with steel.");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Bricks");
        System.out.println("Builder.BricksHouseBuilder: Structure with bricks.");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete tiles");
        System.out.println("Builder.BricksHouseBuilder: Roof with concrete tiles.");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Drywall and paint");
        System.out.println("Builder.BricksHouseBuilder: Interior with drywall and paint.");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
