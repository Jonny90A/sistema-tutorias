package ec.edu.uees.tutorias.factory;

public class NotificadorPush implements Notificador {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación PUSH: " + mensaje);
    }
}