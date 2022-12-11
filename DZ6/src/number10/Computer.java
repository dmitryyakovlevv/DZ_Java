package number10;

public class Computer {
    Monitor monitor;
    Processor processor;
    Memory memory;
    ComputerBrands name;

    Computer(ComputerBrands name, Monitor monitor, Processor processor, Memory memory)
    {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.name = name;
    }

    public Computer(Processor proccesor, Monitor monitor, ComputerBrands aser) {
    }

    Monitor getMonitor () {return this.monitor;}
    void setMonitor (Monitor monitor) {this.monitor = monitor;}

    Processor getProcessor () {return processor;}
    void setProcessor (Processor processor) {this.processor = processor;}

    Memory getMemory () {return memory;}
    void setMemory (Memory memory) {this.memory = memory;}

    ComputerBrands getName () {return name;}
    void setName (ComputerBrands name) {this.name = name;}
}
