package controller;

import model.Conta;

public class ContaController {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(5000);

        System.out.println("Conta 1 com tostring");
        System.out.println(conta1.toString());
        System.out.println("Conta 2 com tostring");
        System.out.println(conta2.toString());
        System.out.println();

        conta1.atualiza(10);
        System.out.println(conta1.getSaldo());

        conta2.sacar(1000);
        conta1.deposita(1000);
        System.out.println(conta1.getSaldo()); //saldo atualizado na conta 1
        System.out.println(conta2.getSaldo()); //saldo atualizado na conta 2

        conta1.sacar(10000);//caso o saldo seja maior, diz que é saldo insuficiente
    }
}
