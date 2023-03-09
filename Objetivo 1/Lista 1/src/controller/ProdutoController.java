package controller;


import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args){
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Abacate","Fruta",100, 1000);

        System.out.println("produto1 usando tostring()");
        System.out.println(produto1.toString());
        System.out.println();

        System.out.println("produto2 usando tostring()");
        System.out.println(produto2.toString());

        produto1.setNome("Tomate");
        produto1.setDescricao("Fruto");
        produto1.setValor(20);
        produto1.setEstoque(15);

        System.out.println();

        System.out.println("produto 1 atualizado");
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        System.out.println();

        System.out.println("produto 2 sem alterações");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        //com listas
        System.out.println("Agora com lista");

        Produto prod3 = new Produto("Café","Bebida dos deuses",100,999999999);
        Produto prod4 = new Produto("Cafézao","Bebida dos deuses",200,999999);
        Produto prod5 = new Produto("Café","Bebida dos deuses",100,999999999);


        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(prod3);
        produtos.add(prod4);
        produtos.add(prod5);

        System.out.println("lista normal");
        System.out.println(produtos);
        System.out.println();

        System.out.println("lista ordenada por ordem alfabetica");
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println(produtos);
        System.out.println();

        System.out.println("lista ordenada por ordem alfabetica ao contrario");
        produtos.sort(Comparator.comparing(Produto::getNome).reversed());
        System.out.println(produtos);
        System.out.println();

        System.out.println("manipulando com map");
        Map<String, Produto> produtoMap = new HashMap<>();
        produtoMap.put(produto1.getNome(), produto1);
        produtoMap.put(produto2.getNome(),produto2);
        produtoMap.put(prod3.getNome(),prod3);//3 e 5 são "Café"
        produtoMap.put(prod4.getNome(),prod4);
        produtoMap.put(prod5.getNome(),prod5);
        System.out.println(produtoMap);


    }

}


