public class Repartidor extends Participante {
    public Repartidor(Mediator mediator) {
        super(mediator);
    }

    public void enviar(String mensaje) {
        mediator.enviar(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Repartidor recibió: " + mensaje);
    }
}