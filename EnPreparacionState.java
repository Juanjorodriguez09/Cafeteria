
public class EnPreparacionState implements Estado {
    @Override
    public void siguienteEstado(Pedido pedido) {
        pedido.setEstadoActual(new ListoState());
        System.out.println("Pedido ahora está Listo");
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstadoActual(new EnEsperaState());
        System.out.println("Pedido cancelado, vuelve a En espera");
    }
}