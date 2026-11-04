
package models;

import java.util.Comparator;

// Clase Estudiante con dos atributos
public class Estudiante implements Comparable<Estudiante> {

    private String name;
    private double nota;

    // Constructor con parámetros
    public Estudiante(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }

    // Constructor vacío
    public Estudiante() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [name=" + name + ", nota=" + nota + "]";
    }

    /**    (non-Javadoc)
     * Orden natural
     * 1. Nota ASCENDENTE
     * 2. Nombre ASCENDENTE en el caso que las notas según iguales
     * @param o obejto tipo Estudiante con el cual se va a comparar
     * @return indice de comparación (+, -, 0)
     */

    /*
    @Override
    public int compareTo(Estudiante e2) {
        int compN = Double.compare(this.getNota(), e2.getNota());
        if (compN != 0) {
            return compN;
        }
        return this.getName().compareTo(e2.getName());
    }
    */
    @Override
    public int compareTo(Estudiante e2) {
        return Comparator.<Estudiante>comparingDouble(Estudiante::getNota)
                .thenComparing(Estudiante::getName)
                .compare(this, e2);
    }
}