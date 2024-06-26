package Poo_continente;

import java.util.List;

public class Oceania extends Continente{

    public Oceania(String pais, double tamanhoPopulacao, double tamanhoContinente) {
        super(pais, tamanhoPopulacao, tamanhoContinente);
    }

    @Override
    public double retornardimensaoTotal(List<Continente> list) {
        double soma = 0;
        for(Continente extensao : list){
            soma += extensao.getTamanhoContinente();
        }
        return soma;
    }

    @Override
    public double retornarSomaDoTamanhoTotalDosPaisesAdicionados(double tamanho) {
        return 0;
    }
}
