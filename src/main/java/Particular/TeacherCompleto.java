package Particular;

import Sistema.Personal;

public class TeacherCompleto implements Personal {
    private String nombre;

    public TeacherCompleto(String nombre) {
        this.nombre = nombre;

    }

    public int Sueldo() {
                  return salarioBaseMensual + comision;

    }

    public int getTipo() {
        return 1;
    }

    public String getNombre() {
        return nombre;
    }
}
