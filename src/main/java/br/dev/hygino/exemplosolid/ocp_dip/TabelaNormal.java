package br.dev.hygino.exemplosolid.ocp_dip;


public class TabelaNormal implements TabelaDescontos{

    @Override
    public double calcularDesconto(Venda venda) {
        return venda.getTipoCliente().calcularDesconto(venda.getValorTotal());
    }
    
}
