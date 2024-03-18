public class cars {
    public void displayInfo() {
        System.out.println("This is a cars.");
    }

    public void displayInfo(String type) {
        System.out.println("This is a " + type + ".");
    }

    public void displayInfo(String type, String model) {
        System.out.println("This is a " + type + " " + model + ".");
    }

    public void displayInfo(String type, String make, String model) {
        System.out.println("This is a " + make + " " + model + " " + type + ".");
    }

    public static void main(String[] args) {
        cars car = new cars();

        car.displayInfo();
        car.displayInfo("lemo");
        car.displayInfo("car", "lemo");
        car.displayInfo("car", "Toyota", "Camry");
    }
}

