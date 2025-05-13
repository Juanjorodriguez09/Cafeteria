public class MediatorPedidos implements Mediator {
    private Cajero cajero;
    private Barista barista;
    private Repartidor repartidor;

    public MediatorPedidos(Cajero cajero, Barista barista, Repartidor repartidor) {
        this.cajero = cajero;
        this.barista = barista;
        this.repartidor = repartidor;
    }

    @Override
    public void enviar(String mensaje, Participante participante) {
        if (participante instanceof Cajero) {
            barista.recibir(mensaje);
        } else if (participante instanceof Barista) {
            repartidor.recibir(mensaje);
        }
    }
}
