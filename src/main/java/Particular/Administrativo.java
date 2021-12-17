package Particular;

import Sistema.Personal;

public class Administrativo implements Personal {
    private String nombre;

    public Administrativo(String nombre) {
        this.nombre = nombre;

    }

    public int Sueldo() {
                return salarioBaseMensual + bonus;
    }


    public int getTipo() {
        return 2;
    }

    public String getNombre() {
        return nombre;
    }
}
