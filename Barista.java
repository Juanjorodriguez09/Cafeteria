public class Barista extends Participante {
    public Barista(Mediator mediator) {
        super(mediator);
    }

    public void enviar(String mensaje) {
        mediator.enviar(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Barista recibió: " + mensaje);
    }
}