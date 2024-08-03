package br.dev.hygino.exemplosolid.lsp;

public interface ManipuladorSaldo {

    void depositar(double valor);

    void sacar(double valor);

    void render();

    double getSaldo();
}
