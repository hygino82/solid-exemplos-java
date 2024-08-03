package br.dev.hygino.exemplosolid.lsp;

import java.util.List;

public class Lsp {

    public static void main(String[] args) {
        final Lsp lsp = new Lsp();
        lsp.executa();
    }

    private void executa() {
        final ManipuladorSaldo comum = new ManipuladorSaldoComum();
        final ManipuladorSaldo premium = new ManipuladorSaldoPremium();
        final ManipuladorSaldo semRendimento = new ManipuladorSaldoSemRendimento();

        final var conta1 = new Conta(comum);
        final var conta2 = new Conta(premium);
        final var conta3 = new Conta(semRendimento);

        conta1.depositar(100);
        conta2.depositar(100);
        conta3.depositar(100);

        final List<Conta> contas = List.of(conta3, conta1, conta2);

        contas.stream().peek(Conta::render)
                .forEach(conta -> {
                    System.out.println("Saldo da conta " + conta.getSaldo());
                });
    }
}
