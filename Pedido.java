import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificar();
    }

    private void notificar() {
        for (Observador o : observadores) {
            o.actualizar(estado);
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Juan Manuel");
        pedido.agregarObservador(cliente);
        pedido.setEstado("Listo"); // Debería imprimir el estado
    }
}