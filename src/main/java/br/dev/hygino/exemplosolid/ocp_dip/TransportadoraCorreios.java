package br.dev.hygino.exemplosolid.ocp_dip;

public class TransportadoraCorreios implements Transportadora {

    @Override
    public double calcularFrete(Venda venda) {
        //calculo frete
        return (venda.getEstadoEntrega().equalsIgnoreCase("Parana") ? 25 : 50);
    }

}
