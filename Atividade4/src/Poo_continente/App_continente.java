package Poo_continente;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App_continente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Continente> list = new ArrayList<>();
        System.out.println("Deseja adicionar um país a algum continente?Digite s para sim ou n para não");
        char letter = sc.next().charAt(0);
        boolean notExit = true;
        while(notExit) {
            if (letter == 's') {
                System.out.println("Digite o nome do país:");
                String pais = sc.nextLine();
                sc.next();
                System.out.println("Digite o tamanho deste país: ");
                double extensaoTerritorial = sc.nextDouble();
                System.out.println("Digite a população total deste país:");
                double populacaoTotal = sc.nextDouble();
                System.out.println("para qual continente deseja adicionar este país?");
                System.out.println("Digite o número correspondente ao continente desejado: ");
                System.out.println("1-África / 2-America / 3-Antartica / 4-Asia / 5- Europa / 6-Oceania");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        Continente africa = new Africa(pais, populacaoTotal, extensaoTerritorial);
                        list.add(africa);
                        System.out.println("Extensão total dos países add: " + africa.retornardimensaoTotal(list));
                        System.out.println("População total do continente: " + africa.retornarPopulacaoTotal(list));
                        System.out.println("Densidade populacional do continente: " + africa.calculoDensidadePopulacional());

                        break;
                    case 2:
                        list.add(new America(pais, populacaoTotal, extensaoTerritorial));
                        break;
                    case 3:
                        list.add(new Antartica(pais, populacaoTotal, extensaoTerritorial));
                        break;
                    case 4:
                        list.add(new Asia(pais, populacaoTotal, extensaoTerritorial));
                        break;
                    case 5:
                        list.add(new Europa(pais, populacaoTotal, extensaoTerritorial));
                        break;
                    case 6:
                        list.add(new Oceania(pais, populacaoTotal, extensaoTerritorial));
                        break;
                }
            }else{
                System.out.println("Dimensão total do continente africano com base nos dados inseridos: ");
                System.out.println();
            }
        }


    }
}
