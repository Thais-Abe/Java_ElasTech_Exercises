package POO.Classes;

import java.util.Scanner;

public class Jogo {


    public void startGame() {
        Jogador jogador = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo!!");
        System.out.println("Escolha seu personagem, digitando a opção abaixo desejada: ");
        System.out.println("1-Mago \n2-Guerreiro");
        int option = sc.nextInt();
        System.out.println("Vc escolheu: ");

        Inimigo inimigo = new Inimigo(500, 12, 12);
        switch (option) {
            case 1:
                System.out.println("Mago");
                jogador = new Mago(500, 12, 12);
                break;
            case 2:
                System.out.println("Guerreiro");
                jogador = new Warrior(500, 12, 12);
                break;
            default:
                System.out.println("Digite uma opção válida");
        }

        System.out.println("Yey! Vamos começar o jogo então! ");
        if (jogador instanceof Mago) {
            System.out.printf("""
                                      .
                                       .
                             /^\\     .
                        /\\   "V"
                       /__\\   I      O  o             
                      //..\\\\  I     .                 | Vida: %d \s
                      \\].`[/  I                       | Dano: %d      \s
                      /l\\/j\\  (]    .  O              | Armadura: %d \s
                     /. ~~ ,\\/I          .
                     \\\\L__j^\\/I       o
                      \\/--v}  I     o   .
                      |    |  I   _________
                      |    |  I c(`       ')o
                      |    l  I   \\.     ,/
                    _/j  L l\\_!  _//^---^\\\\_
                    """, jogador.getVida(), jogador.getAtaque(), jogador.getArmadura());
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
                    '  \\   `---'   \\   /  /              | Armadura: %d
                        |           |./  /
                        /           //  /
                    \\_/' \\         |/  /
                     |    |   _,^-'/  /
                     |    , ``  (\\/  /_
                      \\,.->._    \\X-=/^
                      (  /   `-._//^`
                       `Y-.____(__}
                    """, jogador.getVida(), jogador.getAtaque(), jogador.getArmadura());
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
                 /          .'     '.  .-    \\             | Armadura: %d
                ( _.\\    \\ (_`-._.-'_)    /._\\)
                 `-' \\   ' .--.          / `-'
                     |  / /|_| `-._.'\\   |
                     |   |       |_| |   /-.._
                 _..-\\   `.--.______.'  |
                     \\`.              .'
                          `-..___..-`
                 """, inimigo.getVida(), inimigo.getAtaque(), inimigo.getArmadura());

        System.out.println("===================================");

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            int dado = jogador.rolarDados();
            System.out.println("Você jogou o dado e saiu o número:" + dado + " no dado");//número do dado
            System.out.println("O poder total de seu ataque foi: " + jogador.atacar(dado));//total ataque
            System.out.println("Seu inimigo também te acertou: " + inimigo.atacar());//total ataque inimigo
            int ataqueInimigo = inimigo.atacar();
            System.out.println("Restam-lhe: " + (jogador.calcularVidaRestante(ataqueInimigo)));
            int meuDano = jogador.atacar(dado);
            System.out.println("HP inimigo: " + inimigo.calcularVidaRestante(meuDano));
            System.out.println("------------------------------------------------------------------------------");
        }
        showResults(jogador);
    }

    private void showResults(Jogador jogador) {
        if (!jogador.estaVivo()) {
            System.out.println("Vc morreu!!");
        } else {
            System.out.println("Vc venceu");
        }
    }



}
