import ec.edu.uees.tutorias.domain.Estudiante;
import ec.edu.uees.tutorias.service.EstudianteService;
import ec.edu.uees.tutorias.service.Notificador;
import ec.edu.uees.tutorias.service.NotificadorConsola;

public class Main {

    public static void main(String[] args) {

        Notificador notificador = new NotificadorConsola();

        EstudianteService servicio = new EstudianteService(notificador);

        Estudiante estudiante = new Estudiante(
                1,
                "Jonny Rojas",
                "jrojas@uees.edu.ec",
                "Cienias de la computacion"
        );

        servicio.registrar(estudiante);
    }
}