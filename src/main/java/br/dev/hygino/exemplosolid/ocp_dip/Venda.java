package br.dev.hygino.exemplosolid.ocp_dip;

import java.util.List;

public class Venda {

    private String cliente;
    private TipoCliente tipoCliente;
    private String estadoEntrega;
    private List<Item> itens;
    private double frete;
    private double desconto;

    public Venda(String cliente, TipoCliente tipoCliente, String estadoEntrega, List<Item> itens) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.estadoEntrega = estadoEntrega;
        this.itens = itens;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return this.itens.stream()
                .mapToDouble(Item::valor)
                .sum();
    }
}
