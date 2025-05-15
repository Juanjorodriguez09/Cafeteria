public class SistemaCafeteriaState {
    public static void main(String[] args) {
        System.out.println("=== Prueba del Patrón State ===");
        Pedido pedido = new Pedido();
        pedido.setDetalles("Café latte, 2 azúcares");

        System.out.println("Estado inicial: " + pedido.getEstado());
        pedido.siguienteEstado();
        System.out.println("Después de siguienteEstado: " + pedido.getEstado());
        pedido.siguienteEstado();
        System.out.println("Después de siguienteEstado: " + pedido.getEstado());
        pedido.cancelar();
        System.out.println("Después de cancelar: " + pedido.getEstado());
        pedido.siguienteEstado();
        System.out.println("Después de siguienteEstado: " + pedido.getEstado());
        pedido.siguienteEstado();
        System.out.println("Después de siguienteEstado: " + pedido.getEstado());
        pedido.siguienteEstado();
        System.out.println("Después de siguienteEstado: " + pedido.getEstado());
        pedido.cancelar();
        System.out.println("Después de cancelar: " + pedido.getEstado());
    }
}
