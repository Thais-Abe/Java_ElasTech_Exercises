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
                        System.out.println("Maior país do continente: " + africa.verificarPaisComMaiorPopulacao(list));
                        System.out.println("Menor país do continente: " + africa.verificarPaisComMenorPopulacao(list));

                        break;
                    case 2:
                        Continente america = new America(pais, populacaoTotal, extensaoTerritorial);
                        list.add(america);
                        System.out.println("Extensão total dos países add: " + america.retornardimensaoTotal(list));
                        System.out.println("População total do continente: " + america.retornarPopulacaoTotal(list));
                        System.out.println("Densidade populacional do continente: " + america.calculoDensidadePopulacional());
                        System.out.println("Maior país do continente: " + america.verificarPaisComMaiorPopulacao(list));
                        System.out.println("Menor país do continente: " + america.verificarPaisComMenorPopulacao(list));
                        break;
                    case 3:
                        Continente antartica = new Antartica(pais, populacaoTotal, extensaoTerritorial);
                        list.add(antartica);
                        System.out.println("Extensão total dos países add: " + antartica.retornardimensaoTotal(list));
                        System.out.println("População total do continente: " + antartica.retornarPopulacaoTotal(list));
                        System.out.println("Densidade populacional do continente: " + antartica.calculoDensidadePopulacional());
                        System.out.println("Maior país do continente: " + antartica.verificarPaisComMaiorPopulacao(list));
                        System.out.println("Menor país do continente: " + antartica.verificarPaisComMenorPopulacao(list));
                        break;
                    case 4:
                        Continente asia = new Asia(pais, populacaoTotal, extensaoTerritorial);
                        list.add(asia);
                        System.out.println("Extensão total dos países add: " + asia.retornardimensaoTotal(list));
                        System.out.println("População total do continente: " + asia.retornarPopulacaoTotal(list));
                        System.out.println("Densidade populacional do continente: " + asia.calculoDensidadePopulacional());
                        System.out.println("Maior país do continente: " + asia.verificarPaisComMaiorPopulacao(list));
                        System.out.println("Menor país do continente: " + asia.verificarPaisComMenorPopulacao(list));
                        break;
                    case 5:
                        Continente europa = new Europa(pais, populacaoTotal, extensaoTerritorial);
                        list.add(europa);
                        System.out.println("Extensão total dos países add: " + europa.retornardimensaoTotal(list));
                        System.out.println("População total do continente: " + europa.retornarPopulacaoTotal(list));
                        System.out.println("Densidade populacional do continente: " + europa.calculoDensidadePopulacional());
                        System.out.println("Maior país do continente: " + europa.verificarPaisComMaiorPopulacao(list));
                        System.out.println("Menor país do continente: " + europa.verificarPaisComMenorPopulacao(list));
                        break;
                    case 6:
                        Continente oceania = new Oceania(pais, populacaoTotal, extensaoTerritorial);
                        list.add(oceania);
                        System.out.println("Extensão total dos países add: " + oceania.retornardimensaoTotal(list));
                        System.out.println("População total do continente: " + oceania.retornarPopulacaoTotal(list));
                        System.out.println("Densidade populacional do continente: " + oceania.calculoDensidadePopulacional());
                        System.out.println("Maior país do continente: " + oceania.verificarPaisComMaiorPopulacao(list));
                        System.out.println("Menor país do continente: " + oceania.verificarPaisComMenorPopulacao(list));
                        break;
                }
            }else {
                return;
            }
        }


    }
}
