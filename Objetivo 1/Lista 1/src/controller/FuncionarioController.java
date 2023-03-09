package controller;

import model.Carro;
import model.Funcionario;

import java.util.*;

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



        Funcionario f3 = new Funcionario("Manu",12513132);
        Funcionario f4 = new Funcionario("B",1000);
        Funcionario f5 = new Funcionario("B",23);


        List<Funcionario> funcs = new ArrayList<>();
        funcs.add(f1);
        funcs.add(f2);
        funcs.add(f3);
        funcs.add(f4);
        funcs.add(f5);

        System.out.println("lista normal");
        System.out.println(funcs);
        System.out.println();

        System.out.println("lista ordenada por ordem alfabetica");
        funcs.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(funcs);
        System.out.println();

        System.out.println("lista ordenada por ordem alfabetica ao contrario");
        funcs.sort(Comparator.comparing(Funcionario::getNome).reversed());
        System.out.println(funcs);
        System.out.println();

        System.out.println("manipulando com map");
        Map<String, Funcionario> funcionarioMap = new HashMap<>();
        funcionarioMap.put(f1.getNome(), f1);
        funcionarioMap.put(f2.getNome(), f2);
        funcionarioMap.put(f3.getNome(), f3);
        funcionarioMap.put(f4.getNome(), f4);
        funcionarioMap.put(f5.getNome(), f5);
        System.out.println(funcionarioMap);
    }
}
