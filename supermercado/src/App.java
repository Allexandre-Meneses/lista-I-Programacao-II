import models.Prateleira;
import models.Produto;
import models.Supermercado;

public class App {
    public static void main(String[] args) throws Exception {
        //Instancia o supermercado
        Supermercado supermercado = new Supermercado();

        //Add nova prateleira ao supermercado
        Prateleira alimentos = new Prateleira("Alimentos");
        supermercado.novaPrateleira(alimentos);

        //Add novos produtos a prateleira 
        alimentos.addProduto(new Produto("Arroz", 4.90));
        alimentos.addProduto(new Produto("Feijão", 7.90));
        alimentos.addProduto(new Produto("Macarrão", 4.50));

        //Mostra todos os Produtos da Prateleira
        alimentos.mostraProdutos();

    }
}
