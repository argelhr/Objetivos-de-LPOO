package controller;

import model.Locacao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LocacaoController {
    public static void main(String[] args){
        Locacao aux1 = new Locacao();
        Locacao aux2 = new Locacao(
                2,
                LocalDate.of(2023,3,9),
                LocalDate.of(2023,3,10),
                LocalTime.of(10,10),
                LocalTime.of(10,10),
                2000,
                20,
                10,
                false);

        System.out.println("Locacao numero 1 com to string");
        System.out.println(aux1);
        System.out.println();

        System.out.println("Locacao numero 2 com to string");
        System.out.println(aux2);
        System.out.println();

        //atualizando valores da locação 1
        aux1.setDataLocacao(LocalDate.of(2023,1,1));
        aux1.setDataDevolucao(LocalDate.of(2023,2,1));
        aux1.setHoraLocacao(LocalTime.of(10,10));
        aux1.setDataDevolucao(LocalTime.of(10,10));
        aux1.setValor_locacao(20);
        aux1.setQuilometragem(2000);
        aux1.setValorCalcao(123);
        aux1.setDevolvido(true);

        //imprimindo dados da instancia locação numero 1
        System.out.println("Locaoção 1 atualizada");
        System.out.println(aux1.getDataLocacao());
        System.out.println(aux1.getDataDevolucao());
        System.out.println(aux1.getHoraLocacao());
        System.out.println(aux1.getHoraDevolucao());
        System.out.println(aux1.getQuilometragem());
        System.out.println(aux1.getValor_locacao());
        System.out.println(aux1.getValorCalcao());
        System.out.println(aux1.isDevolvido());
        System.out.println();


    }


}
