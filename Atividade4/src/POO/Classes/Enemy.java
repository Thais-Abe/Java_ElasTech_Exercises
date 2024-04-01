package POO.Classes;

import java.util.Random;

public class Enemy {
    private int vida;
    private int armor;
    private int attack;

    private Player jogador;

    public Enemy(int vida, int armor, int attack) {
        this.vida = vida;
        this.armor = armor;
        this.attack = attack;
    }

    public Enemy() {
    }

    Random random = new Random();

    public int strike() {
        int attackEspecial = random.nextInt(20) + 1;
        int attackTotal = this.attack + attackEspecial;
        return attackTotal;

    }

    public int getVida() {
        return vida;
    }

    public int calculateRemainingLife(int attackInimigo) {
        int totalLife = (this.vida + this.armor);
        int remainingLife = totalLife - attackInimigo;
        setVida(remainingLife);
        return remainingLife;
    }

    public void setVida(int dano) {
        this.vida = dano;
    }

    public boolean isAlive() {
        return this.vida > 0;
    }

    public int getarmor() {
        return armor;
    }

    public void setarmor(int armor) {
        this.armor = armor;
    }

    public int getattack() {
        return attack;
    }

    public void setattack(int attack) {
        this.attack = attack;
    }
}
