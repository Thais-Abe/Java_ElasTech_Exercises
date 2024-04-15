package Poo_contador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoContador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();
        System.out.println("Bem-vindo ao contador! ");
        List<String> list = new ArrayList<>();


        for (int i = 0; i <= list.size(); i++) {
            System.out.println("Digite o item/evento que deseja adicionar: ");
            String item = scanner.nextLine();
            list.add(item);
            contador.somar();
            System.out.println("Atualização: ");
            System.out.println("Você possui: " + contador.getContar() + " itens/eventos adicionados na lista");
            System.out.println("Deseja adicionar mais algum item na lista? ");
            char letter = scanner.next().charAt(0);
            if (letter != 's') {
                System.out.println("Item adicionado com sucesso!");
                System.out.println("Saindo do sistema");
                contador.zerarContador();
                break;
            } else {
                System.out.println("Item adicionado com sucesso!");
            }
            System.out.println("--------------------------------------------------------------------");
            scanner.nextLine();
        }
        scanner.close();
    }
}

