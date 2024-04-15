package Poo_continente;

import java.util.List;

public class Africa extends Continente{


    public Africa(String pais, double tamanhoPopulacao, double tamanhoContinente) {
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
    public double retornarPopulacaoTotal(List<Continente> list) {
        double soma = 0;
        for(Continente extensao : list){
            soma += extensao.getTamanhPopulacao();
        }
        return soma;
    }

    @Override
//    retornmr pais de maior extensão
    public String verificarMaiorPopulacao(List<Continente> list) {
//        int index = list.get(0);
//        for(Continente extensao : list){
//           if(index > extensao){
//
//           }
//        }
        return "";
    }

}
