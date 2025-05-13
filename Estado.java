public interface Estado {
    void siguienteEstado(Pedido pedido);
    void cancelar(Pedido pedido);
}