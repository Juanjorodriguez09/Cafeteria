
public class EnEsperaState implements Estado {
    @Override
    public void siguienteEstado(Pedido pedido) {
        pedido.setEstadoActual(new EnPreparacionState());
        System.out.println("Pedido ahora está En preparación");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("El pedido ya está en En espera, no se puede cancelar más.");
    }
}
