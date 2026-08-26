package ec.edu.uees.tutorias.domain;
import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {

    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String estado;

    public Horario(LocalDate fecha, LocalTime horaInicio,
                   LocalTime horaFin, String estado) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void marcarDisponible() {
        estado = "DISPONIBLE";
    }

    public void reservar() {
        estado = "RESERVADO";
    }

    public void cancelar() {
        estado = "DISPONIBLE";
    }
}