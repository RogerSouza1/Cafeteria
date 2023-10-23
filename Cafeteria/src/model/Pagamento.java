package model;

import java.math.BigDecimal;

public class Pagamento {
    
    private int id;
    private int comanda;
    private double total;
    private String formaPagamento;
    private String pedidoFechado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getComanda() {
        return comanda;
    }

    public void setComanda(int comanda) {
        this.comanda = comanda;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String isPedidoFechado() {
        return pedidoFechado;
    }

    public void setPedidoFechado(String pedidoFechado) {
        this.pedidoFechado = pedidoFechado;
    }
    
    
}
