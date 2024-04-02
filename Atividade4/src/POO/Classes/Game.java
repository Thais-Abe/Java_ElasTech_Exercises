package POO.Classes;

import java.util.Scanner;

public class Game {


    public void startGame() {
        Player jogador = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo!!");
        System.out.println("Escolha seu personagem, digitando a opção abaixo desejada: ");
        System.out.println("1-Mago \n2-Guerreiro");
        int option = sc.nextInt();
        System.out.println("Vc escolheu: ");

        Enemy inimigo = new Enemy(500, 12, 12);
        chooseClass(option);
        switch (option) {
            case 1:
                System.out.println("Mago");
                jogador = new Wizard(500, 12, 12);
                break;
            case 2:
                System.out.println("Guerreiro");
                jogador = new Warrior(500, 12, 12);
                break;
            default:
                System.out.println("Digite uma opção válida");
        }

        System.out.println("Yey! Vamos começar o jogo então! ");
        if (jogador instanceof Wizard) {
            System.out.printf("""
                                      .
                                       .
                             /^\\     .
                        /\\   "V"
                       /__\\   I      O  o             
                      //..\\\\  I     .                 | Vida: %d \s
                      \\].`[/  I                       | Dano: %d      \s
                      /l\\/j\\  (]    .  O              | armor: %d \s
                     /. ~~ ,\\/I          .
                     \\\\L__j^\\/I       o
                      \\/--v}  I     o   .
                      |    |  I   _________
                      |    |  I c(`       ')o
                      |    l  I   \\.     ,/
                    _/j  L l\\_!  _//^---^\\\\_
                    """, jogador.getVida(), jogador.getattack(), jogador.getarmor());
        }

        if (jogador instanceof Warrior) {
            System.out.printf("""
                          _,.
                        ,` -.)
                       ( _/-\\\\-._
                      /,|`--._,-^|            ,
                      \\_| |`-._/||          ,'|
                        |  `-, / |         /  /
                        |     || |        /  /           
                         `r-._||/   __   /  /            | Vida: %d
                     __,-<_     )`-/  `./  /             | Dano: %d  \s
                    '  \\   `---'   \\   /  /              | armor: %d
                        |           |./  /
                        /           //  /
                    \\_/' \\         |/  /
                     |    |   _,^-'/  /
                     |    , ``  (\\/  /_
                      \\,.->._    \\X-=/^
                      (  /   `-._//^`
                       `Y-.____(__}
                    """, jogador.getVida(), jogador.getattack(), jogador.getarmor());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.printf("""
                           _......._
                       .-'.'.'.'.'.'.`-.
                    /.'.'               '.\\
                    |.'    _.--...--._     |
                    \\    `._.-.....-._.'   /
                    |     _..- .-. -.._   |                
                 .-.'    `.   ((@))  .'   '.-.             | Vida: %d
                ( ^ \\      `--.   .-'     / ^ )            | Dano: %d
                 /          .'     '.  .-    \\             | armor: %d
                ( _.\\    \\ (_`-._.-'_)    /._\\)
                 `-' \\   ' .--.          / `-'
                     |  / /|_| `-._.'\\   |
                     |   |       |_| |   /-.._
                 _..-\\   `.--.______.'  |
                     \\`.              .'
                          `-..___..-`
                 """, inimigo.getVida(), inimigo.getattack(), inimigo.getarmor());

        System.out.println("===================================");

        while (jogador.isAlive() && inimigo.isAlive()) {
            int dice = jogador.rollDice();
            System.out.println("Você jogou o dado e saiu o número:" + dice + " no dado");
            System.out.println("O poder total de seu attack foi: " + jogador.strike(dice));
            System.out.println("Seu inimigo também te acertou: " + inimigo.strike());
            int attackInimigo = inimigo.strike();
            System.out.println("Restam-lhe: " + (jogador.calculateRemainingLife(attackInimigo)));
            int meuDano = jogador.strike(dice);
            System.out.println("HP inimigo: " + inimigo.calculateRemainingLife(meuDano));
            System.out.println("------------------------------------------------------------------------------");
        }
        showResults(jogador);
    }

    private void chooseClass(int option) {
        Player jogador = null;
        switch (option) {
            case 1:
                System.out.println("Mago");
                jogador = new Wizard(500, 12, 12);
                break;
            case 2:
                System.out.println("Guerreiro");
                jogador = new Warrior(500, 12, 12);
                break;
            default:
                System.out.println("Digite uma opção válida");
        }
    }

    private void showResults(Player jogador) {
        if (!jogador.isAlive()) {
            System.out.println("Oh! Não! Você morreu!!");
        } else {
            System.out.println("Parabéns!! Você venceu");
        }
    }


}
