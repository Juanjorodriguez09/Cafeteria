
public class Repartidor extends Participante {
    public Repartidor(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Repartidor recibió: " + mensaje);
    }
}