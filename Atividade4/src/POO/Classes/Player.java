package POO.Classes;

import java.util.Random;

public class Player {
    private int life;
    private int attack;
    private int armor;

    public Player(int life, int attack, int armor) {
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public Player() {
    }

    Random random = new Random();

    //Retona o número do dado
    public int rollDice() {
        int bonusDado = random.nextInt(20) + 1;
        return bonusDado;
    }

    //  attack total do mago/guerreiro
    public int strike(int bonusDado) {
        int attackTotal = bonusDado + this.attack;
        if (attackTotal > armor) {
            return attackTotal;
        } else {
            System.out.println("Você errou o attack");
            return 0;
        }

    }

    //Dano total sofrido
    public int calculateRemainingLife(int attackInimigo) {
        int totalLIfe = (this.life + this.armor);
        int remainingLife = totalLIfe - attackInimigo;
        setVida(remainingLife);
        return remainingLife;
    }

    public boolean isAlive() {
        return this.life > 0;
    }

    public int getVida() {

        return life;
    }

    public void setVida(int dano) {

        this.life = dano;
    }

    public int getattack() {
        return attack;
    }

    public void setattack(int attack) {

        this.attack = attack;
    }

    public int getarmor() {
        return armor;
    }

    public void setarmor(int armor) {
        this.armor = armor;
    }
}
