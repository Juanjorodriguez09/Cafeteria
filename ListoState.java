public class ListoState implements Estado {
    @Override
    public void siguienteEstado(Pedido pedido) {
        pedido.setEstadoActual(new EntregadoState());
        System.out.println("Pedido ahora está Entregado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstadoActual(new EnPreparacionState());
        System.out.println("Pedido cancelado, vuelve a En preparación");
    }
}
