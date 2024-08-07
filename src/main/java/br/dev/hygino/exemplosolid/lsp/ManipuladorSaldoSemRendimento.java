package br.dev.hygino.exemplosolid.lsp;

public class ManipuladorSaldoSemRendimento implements ManipuladorSaldo {

    private double saldo;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void render() {
        this.saldo += this.saldo * 0;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
