package ec.edu.uees.tutorias.factory;

public class CreadorEmail extends CreadorNotificacion {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorEmail();
    }
}