package ec.edu.uees.tutorias.factory;

public class CreadorWhatsApp extends CreadorNotificacion {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorWhatsApp();
    }
}
