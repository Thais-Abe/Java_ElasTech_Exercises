package Poo_continente;

import java.util.List;

public class Europa extends Continente {

    public Europa(String pais, double tamanhoPopulacao, double tamanhoContinente) {
        super(pais, tamanhoPopulacao, tamanhoContinente);
    }

    @Override
    public double retornardimensaoTotal(List<Continente> list) {
        double soma = 0;
        for (Continente extensao : list) {
            soma += extensao.getTamanhoContinente();
        }
        return soma;
    }

    @Override
    public double retornarPopulacaoTotal(List<Continente> list) {
        double soma = 0;
        for (Continente extensao : list) {
            soma += extensao.getTamanhPopulacao();
        }
        return soma;
    }

    @Override
//    retornmr pais de maior extensão
    public String verificarPaisComMaiorPopulacao(List<Continente> list) {
        double index = list.get(0).getTamanhPopulacao();
        String pais = "";
        for (int i = 0; i <= list.size(); i++) {
            if (index > list.get(i).getTamanhPopulacao()) {
                index = list.get(i).getTamanhPopulacao();
                pais = list.get(i).getPais();
            }

        }
        return pais;
    }

    @Override
    public String verificarPaisComMenorPopulacao(List<Continente> list) {
        double index = list.get(0).getTamanhPopulacao();
        String pais = "";
        for (int i = 0; i <= list.size(); i++) {
            if (index < list.get(i).getTamanhPopulacao()) {
                index = list.get(i).getTamanhPopulacao();
                pais = list.get(i).getPais();
            }
        }
        return pais;
    }
}
