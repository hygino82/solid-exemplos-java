package br.dev.hygino.exemplosolid.ocp_dip;

public class Caixa {

    private final Correio correio;
    private final EmissorNf emissorNf;
    private final IntegraParaEstoque integraParaEstoque;

    public Caixa(Correio correio, EmissorNf emissorNf, IntegraParaEstoque integraParaEstoque) {
        this.correio = correio;
        this.emissorNf = emissorNf;
        this.integraParaEstoque = integraParaEstoque;
    }

    Venda faturar(Venda venda) {
        //calculo frete
        if (venda.getEstadoEntrega().equalsIgnoreCase("Parana")) {
            venda.setFrete(25);
        } else {
            venda.setFrete(25);
        }

        //calculo descontro
        if (venda.getTipoCliente().equalsIgnoreCase("PF")) {
            venda.setDesconto(venda.getValorTotal() * 0.1);
        } else if (venda.getTipoCliente().equalsIgnoreCase("PJ")) {
            venda.setDesconto(venda.getValorTotal() * 0.05);
        } else {
            venda.setDesconto(venda.getValorTotal() * 0.02);
        }

        System.out.println("Fatura faturada!");
        this.emissorNf.emitir();
        //emite a nota fiscal
        this.correio.notificarCliente();
        //dispara um e-mail ao cliente
        this.integraParaEstoque.integrar();
        //da baixa nos itens do estoque 

        return venda;
    }
}
