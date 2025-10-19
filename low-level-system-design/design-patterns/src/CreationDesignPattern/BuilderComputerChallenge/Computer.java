package CreationDesignPattern.BuilderComputerChallenge;

public class Computer {
    private String CPU;
    private String GPU;
    private String RAM;
    private String storage;


    public String SetCPU(String CPU){
        this.CPU = CPU;
        return CPU;
    }

   public String SetGPU(String GPU){
        this.GPU = GPU;
        return GPU;
    }

    public String SetRAM(String RAM){
        this.RAM = RAM;
        return RAM;
    }

    public String SetStorage(String storage){
        this.storage = storage;
        return storage;
    }

    @Override
    public String toString() {
        return "CreationDesignPattern.BuilderComputerChallenge.Computer with " + CPU + " CPU, " + GPU + " GPU, " + RAM + " RAM, and " + storage + " storage.";
    }
}
