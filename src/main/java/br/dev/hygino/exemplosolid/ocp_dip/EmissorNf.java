package br.dev.hygino.exemplosolid.ocp_dip;

public class EmissorNf implements AcoesAposFaturamento {

    @Override
    public void executar(Venda venda) {
        System.out.println("Emitindo nota fiscal ...");
    }
}
