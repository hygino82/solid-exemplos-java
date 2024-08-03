package br.dev.hygino.exemplosolid.ocp_dip;

import java.util.List;

public final class Caixa {
    
    private final List<AcoesAposFaturamento> acoesAposFaturamento;
    
    public Caixa(List<AcoesAposFaturamento> acoesAposFaturamento) {
        this.acoesAposFaturamento = acoesAposFaturamento;
    }
    
    public Venda faturar(Venda venda, Transportadora transportadora, TabelaDescontos tabelaDescontos) {
        //calculo frete
        venda.setFrete(transportadora.calcularFrete(venda));

        //calculo descontro
        venda.setDesconto(tabelaDescontos.calcularDesconto(venda));
        
        System.out.println("Fatura faturada!");
        this.acoesAposFaturamento.forEach(acao -> acao.executar(venda));
        
        return venda;
    }
}
