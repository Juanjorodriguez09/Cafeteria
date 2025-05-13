import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<MementoPedido> mementoList = new ArrayList<>();

    public void add(MementoPedido state) {
        mementoList.add(state);
    }

    public MementoPedido get(int index) {
        return mementoList.get(index);
    }
}
