public class Cliente implements Observador {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String estado) {
        System.out.println("Cliente " + nombre + ": Pedido está " + estado);
    }
}