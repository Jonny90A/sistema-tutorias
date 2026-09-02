package ec.edu.uees.tutorias.builder;

import ec.edu.uees.tutorias.domain.Reserva;
import java.time.LocalDate;

public class ReservaBuilder {

    private int id;
    private LocalDate fechaReserva;
    private String estado;

    public ReservaBuilder conId(int id) {
        this.id = id;
        return this;
    }

    public ReservaBuilder conFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
        return this;
    }

    public ReservaBuilder conEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public Reserva build() {

        if (id <= 0) {
            throw new IllegalArgumentException("El id es obligatorio.");
        }

        if (fechaReserva == null) {
            throw new IllegalArgumentException(
                "La fecha de reserva es obligatoria."
            );
        }

        if (estado == null || estado.isBlank()) {
            estado = "CONFIRMADA";
        }

        return new Reserva(id, fechaReserva, estado);
    }
}