package POO.Classes;

import java.util.Random;

public class Jogador {
    private int vida;
    private int ataque;
    private int armadura;

    public Jogador(int vida, int ataque, int armadura) {
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public Jogador() {
    }

    Random random = new Random();

    //Retona o número do dado
    public int rolarDados(){
        int bonusDado = random.nextInt(20)+1;
        return bonusDado;
    }

    //  Ataque total do mago/guerreiro
    public int atacar(int bonusDado){
        int ataqueTotal = bonusDado + this.ataque;
        if(ataqueTotal > armadura) {
            return ataqueTotal;
        }else{
            System.out.println("Você errou o ataque");
            return 0;
        }

    }

    //Dano total sofrido
    public int calcularVidaRestante(int ataqueInimigo){
        int vida1 =  (this.vida + this.armadura);
        int danoSofrido = vida1 - ataqueInimigo;
        setVida(danoSofrido);
        return danoSofrido;
    }

    public boolean estaVivo(){
        return this.vida > 0;
    }

    public int getVida() {

        return vida;
    }

    public void setVida(int dano) {

        this.vida = dano;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {

        this.ataque = ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
}
