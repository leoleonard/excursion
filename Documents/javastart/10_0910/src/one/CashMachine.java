package one;

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(new Person(), 1000, 500);

        Scanner scanner = new Scanner(System.in);


        boolean finish = false;
        do {
            System.out.println("1 - wplata");
            System.out.println("2 - wyplata");
            System.out.println("3 - koniec");


            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    //wplata
                    System.out.println("Ile chcesz wpłacić?");
                    double amount = scanner.nextDouble();
                    bankAccount.deposit(amount);
                    break;
                case 2:
                    //wyplata
                    System.out.println("Ile chcesz wypłacić?");
                    double withdrawAmount = scanner.nextDouble();


                    try {
                        bankAccount.withdraw(withdrawAmount);
                    } catch (NotEnoughBalanceException e) {
                        System.out.println("Brak srodkow na koncie");
                    } catch (LimitExceededException e2) {
                        System.out.println("Limit wyplaty przekroczony");
                    }

                    break;
                case 3:
                    finish = true;
                    //koniec
                default:
                    System.out.println("Wybrano nieprawidlowa opcje");
            }
        } while (!finish);
    }
}
