public class student {
    private String name;
    private int age;
    private String id;

    public student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getInfo() {
        return "Name: " + name + "\nAge: " + age + "\nID: " + id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        student student1 = new student("shubh", 20, "S12345");

        System.out.println("Student Info:");
        System.out.println(student1.getInfo());

        student1.setName("shubham Ranmale");
        student1.setAge(22);

        System.out.println("\nModified Details:");
        System.out.println(student1.getInfo());
    }
}
