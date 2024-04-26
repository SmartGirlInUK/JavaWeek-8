package Q8;

public class Manager extends Employee {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculateSalary();
    }

    public void calculateSalary() {

        System.out.println("Manager's salary is higher");
    }
}