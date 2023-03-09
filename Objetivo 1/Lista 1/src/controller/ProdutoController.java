package controller;


import model.Produto;

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


    }

}


