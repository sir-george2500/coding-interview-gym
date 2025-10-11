package Builder;

import BuilderComputerChallenge.Computer;

public interface ComputerBuilder {
    void buildCPU();
    void buildGPU();
    void buildRAM();
    void buildStorage();
    Computer getComputer();
}
