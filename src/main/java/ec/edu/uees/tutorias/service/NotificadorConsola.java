package ec.edu.uees.tutorias.service;
// Implementación concreta de Notificador para enviar mensajes por consola.
public class NotificadorConsola implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }
}