package ec.edu.uees.tutorias.service;

import ec.edu.uees.tutorias.domain.Estudiante;
public class EstudianteService {

    private Notificador notificador;

    public EstudianteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(Estudiante estudiante) {
        System.out.println("Estudiante registrado: " + estudiante.getNombre());

        notificador.enviar(
            "Se registró el estudiante: " + estudiante.getNombre()
        );
    }
}