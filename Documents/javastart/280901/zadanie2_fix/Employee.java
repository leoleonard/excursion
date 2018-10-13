package zadanie2_fix;

public class Employee extends Person {
    private int employeeSalary;

    public Employee(String firstName, String lastName, int phoneNumber, int employeeSalary) {
        super(firstName, lastName, phoneNumber);
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(getEmployeeSalary());
    }
}
