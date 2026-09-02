package ec.edu.uees.tutorias.factory;

public class CreadorPush extends CreadorNotificacion {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorPush();
    }
}
