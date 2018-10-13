package zadanie2_fix;

public class Director extends Employee {
    private int bonus = 5000;

    public Director(String firstName, String lastName, int phoneNumber, int employeeSalary, int bonus) {
        super(firstName, lastName, phoneNumber, employeeSalary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}
