package POO_part4;

import POO_part4.Entities.Person;
import POO_part4.Entities.Individual;
import POO_part4.Entities.Corporation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        for(int i = 1; i<=taxPayers; i++){
            System.out.println("TaxPayer #" + i + "data: ");
            System.out.print("Individual or company? (i/c)? ");
            char letter = sc.next().charAt(0);
            if(letter == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                Person individual = new Individual(name,anualIncome,expenditures);
                list.add(individual);
            }else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int employeesQuantity = sc.nextInt();
                Person company = new Corporation(name,anualIncome,employeesQuantity);
                list.add(company);
            }
        }
        System.out.println("TAXES PAID: ");
        for(Person p : list){
            System.out.println(p);
        }

        double totalExpenses = 0.00;
        for(Person person : list){
            totalExpenses += person.calculateTax();
        }
        System.out.println("TOTAL TAXES:  $" + totalExpenses);
        sc.close();;
    }


}
