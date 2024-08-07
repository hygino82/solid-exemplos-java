package br.dev.hygino.exemplosolid.srp;

public class CalculadoraBonificacao {

    public double calculaBonificacao(Colaborador colaborador) {
        final var cargo = colaborador.cargo();
        final var salarioBase = colaborador.salario();
        return salarioBase + cargo.calculaBonificacao(salarioBase);
    }
}
