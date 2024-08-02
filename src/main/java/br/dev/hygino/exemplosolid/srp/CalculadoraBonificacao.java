package br.dev.hygino.exemplosolid.srp;

public class CalculadoraBonificacao {

    public double calculaBonificacao(Colaborador colaborador) {

        double salarioBase = colaborador.salario();

        return switch (colaborador.cargo()) {
            case Cargo.GERENTE ->
                salarioBase * 0.08;
            case Cargo.ANALISTA ->
                salarioBase * 0.05;
            case Cargo.DESENVOLVEDOR ->
                salarioBase * 0.01;
            case Cargo.CEO ->
                salarioBase * 0.1;
            default ->
                throw new IllegalStateException("Cargo não reconhecido");
        };
    }
}
