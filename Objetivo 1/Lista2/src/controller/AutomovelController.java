package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args){
        Automovel auto1 = new Automovel();
        Automovel auto2 = new Automovel("3","AAA","Azul",
                "Gasolina","Chassi A",4,1000,15.5);

        //Imprimindo instancias com tostring
        System.out.println("Automovel 1");
        System.out.println(auto1.toString());
        System.out.println("Automovel 2");
        System.out.println(auto2.toString());

        //Atualizando automovel 1
        auto1.setRenavan("2");
        auto1.setPlaca("AAB");
        auto1.setCor("Branco");
        auto1.setCombustivel("Gasolina");
        auto1.setChassi("Chassi B");
        auto1.setNum_rodas(4);
        auto1.setQuilometragem(2000);
        auto1.setValor_locacao(30);

        System.out.println();
        //Imprimindo automovel 1 atualizado
        System.out.println(auto1.getRenavan());
        System.out.println(auto1.getPlaca());
        System.out.println(auto1.getCor());
        System.out.println(auto1.getCombustivel());
        System.out.println(auto1.getChassi());
        System.out.println(auto1.getNum_rodas());
        System.out.println(auto1.getQuilometragem());
        System.out.println(auto1.getValor_locacao());
        System.out.println();

        //adicionando novas instancias
        Automovel auto3 = new Automovel("10","AAC","Branco",
                "Gasolina","Chassi C",3,2000,15);
        Automovel auto4 = new Automovel("15","AAD","Branco",
                "Gasolina","Chassi D",6,1000,150);
        Automovel auto5 = new Automovel("10","AAE","Branco",
                "Gasolina","Chassi E",2,10,10);

        //criando lista
        List<Automovel> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto5);
        autos.add(auto4);


        //lista na ordem que foi criada
        System.out.println("lista com ordem que foi criada");
        System.out.println(autos);
        System.out.println();

        //lista na ordem do renavan
        autos.sort(Comparator.comparing(Automovel::getRenavan));
        System.out.println("lista com ordem pelo renavan");
        System.out.println(autos);
        System.out.println();

        autos.sort((Comparator.comparing(Automovel::getRenavan).reversed()));
        System.out.println("Lista com ordem pelo renavan em ordem decrescente");
        System.out.println(autos);

        System.out.println("procurando o veiculo com renavan com identificação de valor = a 3");
        Automovel achei = autos.stream().filter(aux -> aux.getRenavan().equals("3")).findAny().orElse(null);
        System.out.println("Veiculo achado:");
        System.out.println(achei);

        Map<String,Automovel> automovelMap = new HashMap<>();
        automovelMap.put(auto1.getRenavan(),auto1);
        automovelMap.put(auto2.getRenavan(),auto2);
        automovelMap.put(auto3.getRenavan(),auto3);
        automovelMap.put(auto4.getRenavan(),auto4);
        automovelMap.put(auto5.getRenavan(),auto5);

        System.out.println("automovelMap");
        System.out.println("\n"+ automovelMap);
        System.out.println();
        System.out.println("pegando o automovel com renavan 3 no map");
        System.out.println(automovelMap.get("3"));
    }
}
