public class Computer {
        Component[] components = new Component[3];

        public Computer(Processor processor, Ram ram, HardDrive hardDrive) {
                components[0] = processor;
                components[1] = ram;
                components[2] = hardDrive;
        }

        public Component[] getComponents() {
                return components;
        }

        public void setComponents(Component[] components) {
                this.components = components;
        }


}
