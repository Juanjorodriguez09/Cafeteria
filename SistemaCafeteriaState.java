
public class SistemaCafeteriaState {
    public static void main(String[] args) {
        System.out.println("=== Prueba del Patrón State ===");
        Pedido pedido = new Pedido();
        pedido.setDetalles("Café latte, 2 azúcares");

        System.out.println("Estado inicial: " + pedido.getEstado());
        pedido.siguienteEstado(); // A En preparación
        pedido.siguienteEstado(); // A Listo
        pedido.cancelar(); // Vuelve a En preparación
        pedido.siguienteEstado(); // A Listo
        pedido.siguienteEstado(); // A Entregado
        pedido.siguienteEstado(); // No cambia (ya está Entregado)
        pedido.cancelar(); // No cambia (Entregado no permite cancelar)
    }
}