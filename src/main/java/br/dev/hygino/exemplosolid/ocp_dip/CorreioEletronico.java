package br.dev.hygino.exemplosolid.ocp_dip;

public class CorreioEletronico implements AcoesAposFaturamento {

    @Override
    public void executar(Venda venda) {
        System.out.println("Notificando cliente ...");
    }
}
