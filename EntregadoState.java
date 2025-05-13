
public class EntregadoState implements Estado {
    @Override
    public void siguienteEstado(Pedido pedido) {
        System.out.println("El pedido ya está Entregado, no hay más estados.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("El pedido ya está Entregado, no se puede cancelar.");
    }
}