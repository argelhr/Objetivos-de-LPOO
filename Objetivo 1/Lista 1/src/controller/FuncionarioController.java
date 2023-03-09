package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Puxa saco",5600.99);

        System.out.println("Funcionario 1 com tostring");
        System.out.println(f1.toString());
        System.out.println();

        System.out.println("Funcionario 2 com tostring");
        System.out.println(f2.toString());

        f1.setNome("Jorge");
        f1.setSalario(2000);

        System.out.println();

        System.out.println("Funcionario 1 com get depois de atualizado");
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println();

        System.out.println("Funcionario 2 com get");
        System.out.println(f2.getNome());
        System.out.println(f2.getSalario());


    }
}
