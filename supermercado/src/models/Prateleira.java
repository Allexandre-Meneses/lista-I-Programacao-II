package models;

import java.util.ArrayList;

public class Prateleira {
    ArrayList<Produto> produtos = new ArrayList<>();
    String setor;


    public Prateleira(String setor) {
        this.setor = setor;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void mostraProdutos () {
        for(Produto tmp : this.produtos) {
            System.out.println("------------------------");
            System.out.println(tmp.nome);
            System.out.println("Preço: " + tmp.preco);
        }
    }
}   
