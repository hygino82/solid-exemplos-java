package br.dev.hygino.exemplosolid.isp;


public class Vendedor extends Colaborador{

    public Vendedor(String nome, String documento, double salario) {
        super(nome, documento, salario);
    }

    @Override
    public double getComissao() {
        return 0.1;
    }   
}
