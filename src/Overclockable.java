public interface Overclockable {
    double RAM_OVERCLOCKING_VALUE = 100;
    double PROCESSOR_OVERCLOCKING_VALUE = 0.1;
    void overclock() throws OverclockErrorException;
}
