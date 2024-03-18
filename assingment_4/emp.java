public class emp {
    private int id;
    private double salary;
    private String name;

    public emp(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public void displayInfo(int id) {
        System.out.println("ID: " + id);
    }

    public void displayInfo(double salary) {
        System.out.println("Salary: $" + salary);
    }

    public void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        emp e = new emp(1001, 50000.0, "John Doe");

        e.displayInfo(e.id);
        e.displayInfo(e.salary);
        e.displayInfo(e.name);
    }
}

