package model;

public class Pedido {
    
    private int id_pedido;
    private int id_usuario;
    private int id_item;
    private boolean pedido_fechado;

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public boolean isPedido_fechado() {
        return pedido_fechado;
    }

    public void setPedido_fechado(boolean pedido_fechado) {
        this.pedido_fechado = pedido_fechado;
    }
    
    
    
}
