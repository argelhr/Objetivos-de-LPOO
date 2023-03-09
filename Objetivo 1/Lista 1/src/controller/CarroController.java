package controller;

import model.Carro;

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
    }
}
