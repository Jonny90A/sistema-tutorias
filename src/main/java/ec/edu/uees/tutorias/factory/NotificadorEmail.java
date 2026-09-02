package ec.edu.uees.tutorias.factory;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por EMAIL: " + mensaje);
    }
}
