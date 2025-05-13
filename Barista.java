
public class Barista extends Participante {
    public Barista(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Barista recibió: " + mensaje);
    }
}