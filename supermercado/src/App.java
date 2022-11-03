import models.Prateleira;
import models.Produto;
import models.Supermercado;

public class App {
    public static void main(String[] args) throws Exception {
        Supermercado supermercado = new Supermercado();

        Prateleira alimentos = new Prateleira("Alimentos");

        supermercado.novaPrateleira(alimentos);

        alimentos.addProduto(new Produto("Arroz", 4.90));
        alimentos.addProduto(new Produto("Feijão", 7.90));
        alimentos.addProduto(new Produto("Macarrão", 4.50));

        alimentos.mostraProdutos();

    }
}
