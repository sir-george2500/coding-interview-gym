package CreationDesignPattern.BuilderComputerChallenge;

import CreationDesignPattern.Builder.ComputerBuilder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.SetCPU("Intel Core i9-13900K");
    }

    @Override
    public void buildGPU() {
        computer.SetGPU("NVIDIA GeForce RTX 4090");
    }

    @Override
    public void buildRAM() {
        computer.SetRAM("64GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.SetStorage("4TB NVMe SSD");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
