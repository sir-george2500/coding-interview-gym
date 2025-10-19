package CreationDesignPattern.Builder;

public class WoodHouseBuilder implements HouseBuilder {
    private House house;

    public WoodHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden Poles Foundation");
        System.out.println("Building wooden poles foundation.");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wooden Frame Structure");
        System.out.println("Building wooden frame structure.");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden Shingle Roof");
        System.out.println("Building wooden shingle roof.");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden Interior");
        System.out.println("Building wooden interior.");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
