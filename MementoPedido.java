public class MementoPedido {
    private String estado;
    private String detalles;

    public MementoPedido(String estado, String detalles) {
        this.estado = estado;
        this.detalles = detalles;
    }

    public String getEstado() {
        return estado;
    }

    public String getDetalles() {
        return detalles;
    }
}
