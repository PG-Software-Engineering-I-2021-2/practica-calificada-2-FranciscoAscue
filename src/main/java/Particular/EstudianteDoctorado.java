package Particular;

import Sistema.Estudiante;

public class EstudianteDoctorado implements Estudiante {
    private String nombre;

    EstudianteDoctorado(String nombre) {
        this.nombre = nombre;
    }
    int Grado() {
                return notaBase + 2;

    }
}
