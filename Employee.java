public class Employee {
    
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public void raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
        System.out.println("Salary raised by " + percent + "%. New salary: $" + salary);
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        
        Employee employee1 = new Employee(101, "JSanjeevRavikumar", 100000);

        
        System.out.println("Employee ID: " + employee1.getId());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee Salary: $" + employee1.getSalary());

        
        employee1.raiseSalary(10);


        Employee employee2 = new Employee(102, "Suganthi", 50000);

        
        System.out.println("Employee ID: " + employee2.getId());
        System.out.println("Employee Name: " + employee2.getName());
        System.out.println("Employee Salary: $" + employee2.getSalary());

        
        employee2.raiseSalary(10);
    }
}
