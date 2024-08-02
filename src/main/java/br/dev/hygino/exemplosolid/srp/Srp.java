package br.dev.hygino.exemplosolid.srp;

import java.util.List;

public class Srp {

    public static void main(String[] args) {
        final Srp srp = new Srp();
        srp.executar();
    }

    private void executar() {
        final List<Colaborador> colaboradores = List.of(
                new Colaborador("Gorete", Cargo.DESENVOLVEDOR, 500),
                new Colaborador("Jupira", Cargo.ANALISTA, 1000),
                new Colaborador("Dilma", Cargo.GERENTE, 2000),
                new Colaborador("Tenório", Cargo.CEO, 2500),
                new Colaborador("Melaria", Cargo.APRENDIZ, 500)
        );

        final CalculadoraBonificacao calculadora = new CalculadoraBonificacao();

        colaboradores.forEach(c -> {
            System.out.printf("O colaborador %s tem salário de %f %n", c.nome(), calculadora.calculaBonificacao(c)).println();
        });
    }

}
