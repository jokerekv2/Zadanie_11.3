public class Ram extends Component implements Overclockable {
    private int capacity;
    private double clocking;
    private double baseTemperature;
    private double maxSafeTemperature;

    public Ram(String name, String producer, String serialNumber, int capacity, double clocking, double baseTemperature, double maxSafeTemperature) {
        super(name, producer, serialNumber);
        this.capacity = capacity;
        this.clocking = clocking;
        this.baseTemperature = baseTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }

    @Override
    public void overclock() throws OverclockErrorException {
        double temperature = baseTemperature;
        double clocking = this.clocking;
        if (temperature + 15 < maxSafeTemperature) {
            this.clocking = clocking + RAM_OVERCLOCKING_VALUE;
            baseTemperature = temperature + 15;
        } else {
            throw new OverclockErrorException("Za wysoka temperatura ramu! Dalej nie można już podkręcać.");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getClocking() {
        return clocking;
    }

    public void setClocking(double clocking) {
        this.clocking = clocking;
    }

    public double getBaseTemperature() {
        return baseTemperature;
    }

    public void setBaseTemperature(double baseTemperature) {
        this.baseTemperature = baseTemperature;
    }

    public double getMaxSafeTemperature() {
        return maxSafeTemperature;
    }

    public void setMaxSafeTemperature(double maxSafeTemperature) {
        this.maxSafeTemperature = maxSafeTemperature;
    }

    @Override
    public String toString() {
        return "Ram : " + super.toString() + ", pojemność: " + capacity + ", aktualne taktowanie: " + clocking + " MHz";
    }
}
