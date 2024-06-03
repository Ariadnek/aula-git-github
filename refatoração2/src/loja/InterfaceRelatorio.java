package loja;

import java.util.List;

public interface InterfaceRelatorio {
    void gerarRelatorio(List<Produto> produtos, boolean clienteVIP);
}

