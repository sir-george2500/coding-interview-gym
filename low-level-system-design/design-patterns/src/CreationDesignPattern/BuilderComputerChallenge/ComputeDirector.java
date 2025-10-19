package CreationDesignPattern.BuilderComputerChallenge;

import CreationDesignPattern.Builder.ComputerBuilder;

public class ComputeDirector {
    private ComputerBuilder builder;

    public ComputeDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer construct() {
        builder.buildCPU();
        builder.buildGPU();
        builder.buildRAM();
        builder.buildStorage();
        return builder.getComputer();
    }
}
