package br.dev.hygino.exemplosolid.lsp;

public class Conta {

    protected final ManipuladorSaldo manipuladorSaldo;

    public Conta(ManipuladorSaldo manipuladorSaldo) {
        this.manipuladorSaldo = manipuladorSaldo;
    }

    public double getSaldo() {
        return this.manipuladorSaldo.getSaldo();
    }

    public void depositar(double valor) {
        this.manipuladorSaldo.depositar(valor);
    }

    public void sacar(double valor) {
        this.manipuladorSaldo.sacar(valor);
    }

    void render() {
        this.manipuladorSaldo.render();
    }
}
