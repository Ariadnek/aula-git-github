package principal;

import java.util.ArrayList;
import java.util.List;
import loja.Produto;
import loja.Relatorio;

public class Principal {
    public static void main(String[] args) {
        boolean clienteVIP = false;

        Produto p1 = new Produto("Arroz", 5, 18.75);
        Produto p2 = new Produto("Feijão", 1, 4.95);
        Produto p3 = new Produto("Leite", 1, 3.49);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio(produtos, clienteVIP);
    }
}
