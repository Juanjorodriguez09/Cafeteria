import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    // Constructor para inicializar el estado
    public Pedido() {
        this.estado = "EnEspera";
    }

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificar();
    }

    public String getEstado() {
        return estado;
    }

    private void notificar() {
        for (Observador o : observadores) {
            o.actualizar(estado);
        }
    }

    // Métodos para el patrón Memento
    public MementoPedido crearMemento() {
        return new MementoPedido(estado);
    }

    public void restaurar(MementoPedido memento) {
        this.estado = memento.getEstado();
        notificar();
    }

    // Método main ajustado para probar Observer y Memento
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Juan Manuel");
        Caretaker caretaker = new Caretaker();

        // Agregar observador
        pedido.agregarObservador(cliente);

        // Guardar estado inicial
        System.out.println("Guardando estado inicial: " + pedido.getEstado());
        caretaker.guardarEstado(pedido.crearMemento());

        // Cambiar estado
        pedido.setEstado("EnPreparacion");
        System.out.println("Estado actual después de cambio: " + pedido.getEstado());

        // Restaurar estado
        pedido.restaurar(caretaker.getUltimoEstado());
        System.out.println("Estado restaurado: " + pedido.getEstado());
    }
}