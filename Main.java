public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Cafetería Tech ===");

        // Inicializar Observer
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Ana");
        Cocina cocina = new Cocina();
        pedido.agregarObservador(cliente);
        pedido.agregarObservador(cocina);
        pedido.setDetalles("Café latte, 2 azúcares");

        // Inicializar Mediator
        Cajero cajero = new Cajero(null);
        Barista barista = new Barista(null);
        Repartidor repartidor = new Repartidor(null);
        MediatorPedidos mediator = new MediatorPedidos(cajero, barista, repartidor);
        cajero.mediator = mediator;
        barista.mediator = mediator;
        repartidor.mediator = mediator;

        // Inicializar Memento
        Caretaker caretaker = new Caretaker();

        // Flujo del sistema
        System.out.println("\n1. Cajero envía solicitud al Barista...");
        cajero.enviar("Preparar café");

        System.out.println("\n2. Pedido pasa a En preparación...");
        pedido.siguienteEstado(); // Notifica a observadores

        System.out.println("\n3. Guardando estado del pedido...");
        caretaker.guardarEstado(pedido.crearMemento());

        System.out.println("\n4. Barista notifica que el café está listo...");
        barista.enviar("Café listo");

        System.out.println("\n5. Pedido pasa a Listo...");
        pedido.siguienteEstado(); // Notifica a observadores

        System.out.println("\n6. Repartidor confirma entrega...");
        repartidor.enviar("Café entregado");

        System.out.println("\n7. Pedido pasa a Entregado...");
        pedido.siguienteEstado(); // Notifica a observadores

        System.out.println("\n8. Simulando un error: Restaurando estado anterior...");
        pedido.restaurar(caretaker.getUltimoEstado());
    }
}