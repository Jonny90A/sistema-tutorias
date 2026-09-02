package ec.edu.uees.tutorias.factory;

public class NotificadorSMS implements Notificador {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}