package ec.edu.uees.tutorias.factory;

public abstract class CreadorNotificacion {

    public abstract Notificador crearNotificador();

    public void enviar(String mensaje) {
        Notificador notificador = crearNotificador();
        notificador.enviarNotificacion(mensaje);
    }
}