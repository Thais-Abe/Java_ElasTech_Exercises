package aula2503;

public class Veiculo {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("Veículo ligado");
    }

}
