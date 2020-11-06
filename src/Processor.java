public class Processor extends Component implements Overclockable {
    private double baseFrequency;
    private double baseFrequencyTemperature;
    private double maxSafeTemperature;

    public Processor(String name, String producer, String serialNumber, double baseFrequency, double baseFrequencyTemperature, double maxSafeTemperature) {
        super(name, producer, serialNumber);
        this.baseFrequency = baseFrequency;
        this.baseFrequencyTemperature = baseFrequencyTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }

    @Override
    public void overclock() throws OverclockErrorException {
        double temperature = baseFrequencyTemperature;
        double frequency = baseFrequency;
        if (temperature < maxSafeTemperature) {
            baseFrequency = frequency + 0.1;
            baseFrequencyTemperature = temperature + 10;
        } else {
            throw new OverclockErrorException("Za wysoka temperatura! Dalej nie można już podkręcać.");
        }
    }

    public double getBaseFrequency() {
        return baseFrequency;
    }

    public void setBaseFrequency(double baseFrequency) {
        this.baseFrequency = baseFrequency;
    }

    public double getBaseFrequencyTemperature() {
        return baseFrequencyTemperature;
    }

    public void setBaseFrequencyTemperature(double baseFrequencyTemperature) {
        this.baseFrequencyTemperature = baseFrequencyTemperature;
    }

    public double getMaxSafeTemperature() {
        return maxSafeTemperature;
    }

    public void setMaxSafeTemperature(double maxSafeTemperature) {
        this.maxSafeTemperature = maxSafeTemperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", aktualna częstotliwość: " + baseFrequency + " GHz";
    }
}
