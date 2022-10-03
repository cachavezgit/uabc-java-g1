package mx.uabc.cursojava.nestedclasses;

public class CPU {
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public class Processor {
        double cores;
        String manufacturer;

        public double getCores() {
            return cores;
        }

        public void setCores(double cores) {
            this.cores = cores;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }

    public class RAM {
        double memory;

        public double getMemory() {
            return memory;
        }

        public void setMemory(double memory) {
            this.memory = memory;
        }
    }

    @Override
    public String toString() {
        return "CPU{" +
                "price=" + price +
                '}';
    }
}
