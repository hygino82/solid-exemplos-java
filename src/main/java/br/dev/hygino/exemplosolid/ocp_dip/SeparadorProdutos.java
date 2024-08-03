package br.dev.hygino.exemplosolid.ocp_dip;

public class SeparadorProdutos implements AcoesAposFaturamento {

    @Override
    public void executar(Venda venda) {

        System.out.println("Produtos separados!");
    }
}
