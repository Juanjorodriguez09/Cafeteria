import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<MementoPedido> historial = new ArrayList<>();

    public void guardarEstado(MementoPedido state) {
        historial.add(state);
    }

    public MementoPedido getUltimoEstado() {
        if (historial.isEmpty()) {
            throw new IllegalStateException("No hay estados guardados");
        }
        return historial.get(historial.size() - 1);
    }

    public MementoPedido get(int index) {
        return historial.get(index);
    }
}
