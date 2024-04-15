package POO_exception.Application;

import POO_exception.Model.Entities.Account;
import POO_exception.Model.Exception.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        double limit = sc.nextDouble();
        account = new Account(number, name, initialBalance, limit);

        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();


        try {
            account.withdraw(amount);
            System.out.println("New balance " + String.format("%.2f", account.getBalance()));
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
