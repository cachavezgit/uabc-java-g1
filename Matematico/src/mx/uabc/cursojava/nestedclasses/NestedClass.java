package mx.uabc.cursojava.nestedclasses;

import mx.uabc.cursojava.nestedclasses.secondlevel.CPU2000;

public class NestedClass  {
    public static void main (String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor= cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();

        CPU2000 cpu2000 = new CPU2000();
        CPU2000.Processor  processor2= cpu2000.new Processor();

    }
}


