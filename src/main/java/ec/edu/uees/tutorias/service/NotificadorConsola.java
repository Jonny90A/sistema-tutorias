package ec.edu.uees.tutorias.service;

public class NotificadorConsola implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }
}