package ec.edu.uees.tutorias.domain;

import java.time.LocalDate;

public class Reserva {

    private int id;
    private LocalDate fechaReserva;
    private String estado;

    public Reserva(int id, LocalDate fechaReserva, String estado) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void confirmar() {
        estado = "CONFIRMADA";
    }

    public void cancelar() {
        estado = "CANCELADA";
    }
}