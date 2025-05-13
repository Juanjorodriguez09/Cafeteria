public class Cajero extends Participante {
    public Cajero(Mediator mediator) {
        super(mediator);
    }

    public void enviar(String mensaje) {
        mediator.enviar(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Cajero recibió: " + mensaje);
    }
}
