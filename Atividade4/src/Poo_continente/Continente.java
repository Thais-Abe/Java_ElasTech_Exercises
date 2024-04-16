package Poo_continente;

import java.util.List;

public abstract class Continente {
    private String pais;
    private double tamanhoContinente;
    private double tamanhoPopulacao;

    public Continente(String pais, double tamanhoPopulacao, double tamanhoContinente) {
        this.pais = pais;
        this.tamanhoPopulacao = tamanhoPopulacao;
        this.tamanhoContinente = tamanhoContinente;
    }

    public double calculoDensidadePopulacional(){
        double result = tamanhoPopulacao/tamanhoContinente;
        return result;
    }

    public double getTamanhoContinente() {
        return tamanhoContinente;
    }
    public abstract double retornardimensaoTotal(List<Continente>list);

    public abstract double retornarPopulacaoTotal(List<Continente> list);

    public abstract String verificarPaisComMaiorPopulacao(List<Continente>list);

    public abstract String verificarPaisComMenorPopulacao(List<Continente>list);

    public void setTamanhoContinente(double tamanhoContinente) {
        this.tamanhoContinente = tamanhoContinente;

    }

    public double getTamanhPopulacao() {
        return tamanhoPopulacao;
    }

    public void setTamanhPopulacao(double tamanhPopulacao) {
        this.tamanhoPopulacao = tamanhPopulacao;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
