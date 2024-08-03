package br.dev.hygino.exemplosolid.ocp_dip;

public class TransportadoraPlimor implements Transportadora {

    @Override
    public double calcularFrete(Venda venda) {
        //calculo frete
        return (venda.getEstadoEntrega().equalsIgnoreCase("Parana") ? 10 : 20);
    }

}
