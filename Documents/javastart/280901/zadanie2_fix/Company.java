package zadanie2_fix;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Damian", "Surname", 123, 3000);

        Customer customer1 = new Customer("Ola", "Surnamka", 1234, 3500);
        customer1.setFirstName("Ola");

//        Director director1 = new Director("");
//        director1.setFirstName("Olaf");

        System.out.println(employee1.firstName + " " + employee1.getEmployeeSalary());
        System.out.println(customer1.firstName + " " + customer1.getCustomerExpenses());
//        System.out.println(director1.getFirstName() + " " + director1.getBonus());

    }
}
