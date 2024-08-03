package br.dev.hygino.exemplosolid.ocp_dip;

public enum TipoCliente {
    PF {
        @Override
        public double calcularDesconto(double valorVenda) {
            return valorVenda * 0.1;
        }
    },
    PJ {
        @Override
        public double calcularDesconto(double valorVenda) {
            return valorVenda * 0.05;
        }
    };

    public double calcularDesconto(double valorVenda) {
        return valorVenda * 0.02;
    }
}
