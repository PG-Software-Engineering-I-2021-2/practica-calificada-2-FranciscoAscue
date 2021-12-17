package Particular;

import Sistema.Personal;

public class TeachearParcial implements Personal {
    private String nombre;
    public TeachearParcial(String nombre) {
        this.nombre = nombre;

    }

    public int Sueldo() {
              return salarioBaseMensual + comision;
     }

    public int getTipo() {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }
}
