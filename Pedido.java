import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String estado;
    private String detalles;
    private List<Observador> observadores = new ArrayList<>();
    private Estado estadoActual;

    public Pedido() {
        this.estado = "En espera";
        this.detalles = "";
        this.estadoActual = new EnEsperaState();
    }

    // Observer
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void notificar() {
        for (Observador o : observadores) {
            o.actualizar(estado);
        }
    }

    // Memento
    public MementoPedido crearMemento() {
        return new MementoPedido(estado, detalles);
    }

    public void restaurar(MementoPedido memento) {
        this.estado = memento.getEstado();
        this.detalles = memento.getDetalles();
        notificar();
        System.out.println("Estado restaurado: " + estado + ", Detalles: " + detalles);
    }

    // State
    public void setEstadoActual(Estado estado) {
        this.estadoActual = estado;
        this.estado = estado.getClass().getSimpleName().replace("State", "");
        notificar();
    }

    public void siguienteEstado() {
        estadoActual.siguienteEstado(this);
    }

    public void cancelar() {
        estadoActual.cancelar(this);
    }

    public String getEstado() {
        return estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
