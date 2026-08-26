package ec.edu.uees.tutorias.service;
// Interfaz utilizada para desacoplar el servicio de la implementación de notificaciones.
public interface Notificador {

    void enviar(String mensaje);
}