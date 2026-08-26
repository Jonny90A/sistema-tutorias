package ec.edu.uees.tutorias.domain;

public class Docente {

    private int id;
    private String nombre;
    private String correo;
    private String asignatura;

    public Docente(int id, String nombre, String correo, String asignatura) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.asignatura = asignatura;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getAsignatura() {
        return asignatura;
    }
}