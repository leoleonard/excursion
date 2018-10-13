package zadanie2_fix;

public class Customer extends Person {
    private int customerExpenses;

    public Customer(String firstName, String lastName, int phoneNumber, int customerExpenses) {
        super(firstName, lastName, phoneNumber);
        this.customerExpenses = customerExpenses;
    }

    public int getCustomerExpenses() {
        return customerExpenses;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(getCustomerExpenses());
    }
}
