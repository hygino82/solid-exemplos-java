package br.dev.hygino.exemplosolid.ocp_dip;

import java.util.List;

public class OcpDip {

    public static void main(String[] args) {
        final var ocpDip = new OcpDip();
        OcpDip.executa();
    }

    private static void executa() {
        final List<Item> itens = List.of(
                new Item("Cpu Ryzen 5 3600", 1, 325),
                new Item("MB Gigabyte A520MH", 1, 289),
                new Item("JUHOR Memoria Ram DDR4 8GB", 2, 202),
                new Item("Ge Force GTX 750TI 2GB", 1, 540),
                new Item("SSD Kingston 512GB", 1, 360)
        );

        final Venda venda = new Venda("Nerd", "PF", "Parana", itens);
        final Caixa caixa = new Caixa();
        final Venda vendaFaturada = caixa.faturar(venda);
        System.out.println("O desconto da venda é " + vendaFaturada.getDesconto());
        System.out.println("O frete da venda é " + vendaFaturada.getFrete());
    }
}
