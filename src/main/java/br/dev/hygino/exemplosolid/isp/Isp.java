package br.dev.hygino.exemplosolid.isp;

import java.util.List;

public class Isp {

    public static void main(String[] args) {
        final Isp isp = new Isp();
        isp.executa();
    }

    private void executa() {
        final var jose = new Analista("Jose", "123", 1000);
        final var manuel = new Vendedor("Manuel", "321", 1500);
        final var juca = new Vendedor("Juca", "999", 1700);
        final var maria = new Cozinheira("Maria", "456", 2500);

        List<Comissionavel> colaboradores = List.of(manuel, juca);

        colaboradores.forEach(colaborador -> {
            System.out.printf("Commisao e de %s", colaborador.getComissao()).println();
        });
    }
}
