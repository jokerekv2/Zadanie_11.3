public class HardDrive extends Component{
    private int capacity;

    public HardDrive(String name, String producer, String serialNumber, int capacity) {
        super(name, producer, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return "Dysk twardu: " + super.toString() + ", Pojemność: " + capacity + "\n";
    }
}
