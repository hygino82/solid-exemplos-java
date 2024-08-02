package br.dev.hygino.exemplosolid.srp;

public enum Cargo {
    GERENTE {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.08;
        }
    }, ANALISTA {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.05;
        }
    }, DESENVOLVEDOR {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.01;
        }
    }, CEO {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.1;
        }
    },
    ESTAGIARIO,
    APRENDIZ;

    public double calculaBonificacao(double salarioBase) {
        return 0;
    }
}
