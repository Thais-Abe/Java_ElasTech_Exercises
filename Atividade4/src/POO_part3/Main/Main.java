package POO_part3.Main;

import POO_part3.Entities.ImportedProduct;
import POO_part3.Entities.Product;
import POO_part3.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatODate = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        System.out.println("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        for(int i = 0; i< numberOfProducts; i++){
            System.out.println("Product #" + (i+1) + " data");
            System.out.print("Commom, used or imported (c/u/i)?");
            char letter = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (letter == 'c') {
                Product commom = new Product(name, price);
                list.add(commom);
            }else if(letter == 'u'){
                String manufactureDate = sc.next();
                Date datemanufactureDate = formatODate.parse(manufactureDate);
                Product usedProduct = new UsedProduct(name, price,datemanufactureDate);
                list.add(usedProduct);
            }else{
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();
                Product productImported = new ImportedProduct(name,price,customFee);
                list.add(productImported);
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product product : list){
            System.out.println(product);
        }

        sc.close();


    }
}
