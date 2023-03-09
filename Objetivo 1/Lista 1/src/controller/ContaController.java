package controller;

import model.Conta;
import model.Funcionario;

import java.util.*;

public class ContaController {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(2L,5000);

        System.out.println("Conta 1 com tostring");
        System.out.println(conta1.toString());
        System.out.println("Conta 2 com tostring");
        System.out.println(conta2.toString());
        System.out.println();

        conta1.setNumero(1L);
        conta1.atualiza(10);
        System.out.println(conta1.getSaldo());

        conta2.sacar(1000);
        conta1.deposita(1000);
        System.out.println(conta1.getSaldo()); //saldo atualizado na conta 1
        System.out.println(conta2.getSaldo()); //saldo atualizado na conta 2

        conta1.sacar(10000);//caso o saldo seja maior, diz que é saldo insuficiente




        Conta conta3 = new Conta(3L,8000);
        Conta conta4 = new Conta(4L,6000);
        Conta conta5 = new Conta(4L,7000);

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta2);
        contas.add(conta5);

        System.out.println("lista normal");
        System.out.println(contas);
        System.out.println();

        System.out.println("lista ordenada por ID");
        contas.sort(Comparator.comparing(Conta::getNumero));
        System.out.println(contas);
        System.out.println();

        System.out.println("lista ordenada por ID ao contrario");
        contas.sort(Comparator.comparing(Conta::getNumero).reversed());
        System.out.println(contas);
        System.out.println();

        System.out.println("pesquisando o codigo 3");
        contas.forEach(conta -> {
            if(conta.getNumero() == 4L) {
                System.out.println("ACHEI");
                System.out.println(conta);
            }
        });

        System.out.println();
        System.out.println("Com MAP");
        Map<Long, Conta> contaMap = new HashMap<>();
        contaMap.put(conta1.getNumero(),conta1);
        contaMap.put(conta2.getNumero(),conta2);
        contaMap.put(conta3.getNumero(),conta3);
        contaMap.put(conta4.getNumero(),conta4);
        contaMap.put(conta5.getNumero(),conta5);

        System.out.println(contaMap);
        System.out.println(contaMap.get(3L));
    }
}
