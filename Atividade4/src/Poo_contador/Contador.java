package Poo_contador;

public class Contador {

    private int contagem;

    public Contador() {
    }

    public Contador(int contar) {
        this.contagem = contar;
    }

    public int somar(){
       return this.contagem++;
    }

    public void zerarContador(){
         this.contagem =0;
    }
    public int getContar() {
        return contagem;
    }

    public void setContar(int contar) {
        this.contagem = contar;
    }
}
