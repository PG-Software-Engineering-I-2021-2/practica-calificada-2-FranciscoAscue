package Particular;

import Sistema.Estudiante;

public class EstudianteMaestria implements Estudiante {
    private String nombre;

    EstudianteMaestria( String nombre) {
        this.nombre = nombre;
    }
    int Grado() {
                return notaBase + 1;

    }
}
