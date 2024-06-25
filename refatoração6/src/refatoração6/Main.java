package refatoração6;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Produto {
    private String codigo;
    private String nome;
    private String tipo;
    private double valor;
    private double desconto;

    public Produto(String codigo, String nome, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.desconto = calcularDesconto(tipo);
    }

    private double calcularDesconto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "roupas":
                return 0.05;
            case "calçados":
                return 0.04;
            case "casa":
                return 0.03;
            default:
                return 0.0;
        }
    }

    public double getValor() {
        return valor;
    }

    public double getValorComDesconto() {
        return valor - (valor * desconto);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", desconto=" + desconto +
                '}';
    }
}

class SistemaVendas {
    private List<Produto> produtos;

    public SistemaVendas() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotalSemDesconto() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getValor();
        }
        return total;
    }

    public double calcularTotalComDesconto() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getValorComDesconto();
        }
        return total;
    }

    public void iniciarCadastro() {
        int opcao;
        do {
            String codigo = JOptionPane.showInputDialog("Informe o código do produto:");
            String nome = JOptionPane.showInputDialog("Informe o nome do produto:");
            String tipo = JOptionPane.showInputDialog("Informe o tipo do produto (Roupas, Calçados, Casa):");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));

            Produto produto = new Produto(codigo, nome, tipo, valor);
            adicionarProduto(produto);

            opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro produto?", "Confirmação", JOptionPane.YES_NO_OPTION);
        } while (opcao == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Total sem desconto: " + calcularTotalSemDesconto());
        JOptionPane.showMessageDialog(null, "Total com desconto: " + calcularTotalComDesconto());
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaVendas sistemaVendas = new SistemaVendas();
        sistemaVendas.iniciarCadastro();
    }
}
