package aula2503;

public class Moto extends Veiculo{
    public int cilindradas;
    public String cor;
    public int ano;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public Moto(String marca, String modelo, String cor, int ano) {
        super(marca, modelo);
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public void ligar() {
        System.out.println("outra coisa");
    }
}
