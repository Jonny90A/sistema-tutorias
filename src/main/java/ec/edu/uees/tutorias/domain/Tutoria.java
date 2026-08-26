package ec.edu.uees.tutorias.domain;

public class Tutoria {

    private int id;
    private String estado;
    private String observaciones;

    public Tutoria(int id, String estado, String observaciones) {
        this.id = id;
        this.estado = estado;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void marcarRealizada() {
        estado = "REALIZADA";
    }

    public void cancelar() {
        estado = "CANCELADA";
    }

    public void actualizarObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}