public abstract class Participante {
    protected Mediator mediator;

    public Participante(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void recibir(String mensaje);
}
