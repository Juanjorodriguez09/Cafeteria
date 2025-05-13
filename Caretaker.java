import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<MementoPedido> historial = new ArrayList<>();

    public void guardarEstado(MementoPedido memento) {
        historial.add(memento);
    }

    public MementoPedido getUltimoEstado() {
        if (!historial.isEmpty()) {
            return historial.remove(historial.size() - 1);
        }
        return null;
    }
}