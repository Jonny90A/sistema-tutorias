package ec.edu.uees.tutorias.factory;

public class CreadorSMS extends CreadorNotificacion {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorSMS();
    }
}
