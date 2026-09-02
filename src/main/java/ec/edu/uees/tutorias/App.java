package ec.edu.uees.tutorias;

import ec.edu.uees.tutorias.factory.CreadorEmail;
import ec.edu.uees.tutorias.factory.CreadorSMS;
import ec.edu.uees.tutorias.factory.CreadorWhatsApp;
import ec.edu.uees.tutorias.factory.CreadorPush;
import ec.edu.uees.tutorias.factory.CreadorNotificacion;

import ec.edu.uees.tutorias.builder.ReservaBuilder;
import ec.edu.uees.tutorias.domain.Reserva;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        CreadorNotificacion email = new CreadorEmail();
        email.enviar("Su tutoría ha sido reservada.");

        CreadorNotificacion sms = new CreadorSMS();
        sms.enviar("Su tutoría ha sido cancelada.");

        CreadorNotificacion whatsapp = new CreadorWhatsApp();
        whatsapp.enviar("Tiene una nueva tutoría programada.");

        CreadorNotificacion push = new CreadorPush();
        push.enviar("Recordatorio: tiene una tutoría próximamente.");
        System.out.println("\n--- PRUEBA BUILDER ---");

Reserva reserva1 = new ReservaBuilder()
        .conId(1)
        .conFechaReserva(LocalDate.now())
        .conEstado("CONFIRMADA")
        .build();

Reserva reserva2 = new ReservaBuilder()
        .conId(2)
        .conFechaReserva(LocalDate.now().plusDays(1))
        .build();

System.out.println("Reserva 1 creada: " + reserva1.getEstado());
System.out.println("Reserva 2 creada: " + reserva2.getEstado());
try {

    Reserva reservaError = new ReservaBuilder()
            .conFechaReserva(LocalDate.now())
            .build();

} catch (IllegalArgumentException e) {

    System.out.println("Validación correcta: " + e.getMessage());
}
    }
}