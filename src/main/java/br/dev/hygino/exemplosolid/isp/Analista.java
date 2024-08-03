package br.dev.hygino.exemplosolid.isp;

public class Analista extends Colaborador {

    public Analista(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    public double getComissao() {
        return 0;
    }
}
