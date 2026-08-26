package ec.edu.uees.tutorias.domain;

public class Estudiante {

    private int id;
    private String nombre;
    private String correo;
    private String carrera;

    public Estudiante(int id, String nombre, String correo, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
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

    public String getCarrera() {
        return carrera;
    }
}