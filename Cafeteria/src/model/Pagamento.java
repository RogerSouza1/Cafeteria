package model;

public class Pagamento {
    
    private int id;
    private int mesa;
    private double total;
    private String formaPagamento;
    boolean pedidoFechado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
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

    public boolean isPedidoFechado() {
        return pedidoFechado;
    }

    public void setPedidoFechado(boolean pedidoFechado) {
        this.pedidoFechado = pedidoFechado;
    }
    
    
}
