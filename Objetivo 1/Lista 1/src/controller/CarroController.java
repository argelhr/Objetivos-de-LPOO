package controller;

import model.Carro;
import model.Produto;

import java.util.*;

public class CarroController {
    public static void main(String[] args){
        Carro car1 = new Carro();
        Carro car2 = new Carro("Fiat","Uno",1984);

        System.out.println("carro 1 usando tostring");
        System.out.println(car1.toString());
        System.out.println("carro 2 usando tostring");
        System.out.println(car2.toString());

        System.out.println();
        car1.setMarca("Volkswagen");
        car1.setModelo("Lamborguini");
        car1.setAnoFabricacao(1998);

        System.out.println();
        System.out.println("Carro 1 com get");
        System.out.println(car1.getMarca());
        System.out.println(car1.getModelo());
        System.out.println(car1.getAnoFabricacao());
        System.out.println();

        System.out.println("Carro 2 com get");
        System.out.println(car2.getModelo());
        System.out.println(car2.getMarca());
        System.out.println(car2.getAnoFabricacao());



        Carro car3 = new Carro("Fiat","A",1234);
        Carro car4 = new Carro("BBBBBB","B",123123);
        Carro car5 = new Carro("123123","C",123123);


        List<Carro> carros = new ArrayList<>();
        carros.add(car1);
        carros.add(car2);
        carros.add(car3);
        carros.add(car4);
        carros.add(car5);

        System.out.println("lista normal");
        System.out.println(carros);
        System.out.println();

        System.out.println("lista ordenada por ordem alfabetica");
        carros.sort(Comparator.comparing(Carro::getModelo));
        System.out.println(carros);
        System.out.println();

        System.out.println("lista ordenada por ordem alfabetica ao contrario");
        carros.sort(Comparator.comparing(Carro::getModelo).reversed());
        System.out.println(carros);
        System.out.println();

        System.out.println("manipulando com map");
        Map<String, Carro> carroMap = new HashMap<>();
        carroMap.put(car1.getMarca(), car1);
        carroMap.put(car2.getMarca(), car2);
        carroMap.put(car3.getMarca(), car3);
        carroMap.put(car4.getMarca(), car4);
        carroMap.put(car5.getMarca(), car5);
        System.out.println(carroMap);

    }
}
