package ec.edu.uees.tutorias.factory;

public class NotificadorWhatsApp implements Notificador {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por WHATSAPP: " + mensaje);
    }
}