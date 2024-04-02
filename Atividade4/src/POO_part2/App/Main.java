package POO_part2.App;

import POO_part2.Class.Employee;
import POO_part2.Class.OutShourcedEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();
        List<Employee> list = new ArrayList<>();
        for(int i = 1; i<= numberEmployees; i++){
            System.out.println("Employee #" + (i+1) + "data: ");
            System.out.print("Outsorced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutShourcedEmployee(name,hours, valuePerHour, additionalCharge);
                list.add(emp);
            }else{
                Employee emp = new Employee(name, hours,valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
