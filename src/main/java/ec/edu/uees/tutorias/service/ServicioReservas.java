package ec.edu.uees.tutorias.service;

import ec.edu.uees.tutorias.domain.Horario;
import ec.edu.uees.tutorias.domain.Reserva;

public class ServicioReservas {

    public boolean validarDisponibilidad(Horario horario) {
        return horario.getEstado().equals("DISPONIBLE");
    }

    public Reserva crearReserva(int id, Horario horario) {

        if (!validarDisponibilidad(horario)) {
            throw new IllegalStateException(
                "El horario no está disponible."
            );
        }

        horario.reservar();

        Reserva reserva = new Reserva(
            id,
            java.time.LocalDate.now(),
            "CONFIRMADA"
        );

        return reserva;
    }

    public void cancelarReserva(Reserva reserva, Horario horario) {
        reserva.cancelar();
        horario.cancelar();
    }
}