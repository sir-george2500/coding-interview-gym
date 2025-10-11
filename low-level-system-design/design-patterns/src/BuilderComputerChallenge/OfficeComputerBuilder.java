package BuilderComputerChallenge;

import Builder.ComputerBuilder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.SetCPU("Intel Core i5-13400");
    }

    @Override
    public void buildGPU() {
        computer.SetGPU("Integrated Graphics");
    }

    @Override
    public void buildRAM() {
        computer.SetRAM("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.SetStorage("512GB SSD");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}
