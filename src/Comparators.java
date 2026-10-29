import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Estudiante;

public class Comparators {
    private List<Estudiante> estList;
    private Estudiante[] estArray;

    public Comparators() {
    
        Estudiante e1 = new Estudiante("Juan", 10.0);
        estArray = new Estudiante[] { 
            e1,
            new Estudiante("Juan", 7.0),
            new Estudiante("Maria", 3.5),
            new Estudiante("Diego", 5.0),
            new Estudiante("Pedro", 9.0),
        };

        estList = new ArrayList<>(List.of(estArray));

        //Lammadas a los ejemplos
        ejemplo1();
        ejemplo2();   
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo7();
        ejemplo8();
        ejemplo9();
        ejemplo10();

    }

    private void print(List<Estudiante> List) {
        //for est in list:
        for(Estudiante est : List) {
            System.out.println(est);
        }
    }


/**
 * Comparator -> por valor
* Lambda extractora directa: nota ascendente 
 */

    public void ejemplo1() {
        //Copiar el arreglo global
        List<Estudiante> Lista = new ArrayList<>(estList);
        //Comparator -> Obj != (Envolvete de primitivo n1 String)
        Comparator<Estudiante> comparador = Comparator.comparingDouble(x -> x.getNota());
        Lista.sort(comparador);
        //Imprimir 
        print(Lista);
    }
    
    /**
     * Ordenae  Nota ascendentemente
     * Comparator -> por valor
     * Referencia
     */

    public void ejemplo2() {
        List<Estudiante> Lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = Comparator.comparingDouble(Estudiante::getNota);
        Lista.sort(comparador);
        print(Lista);
    }

    /**
     * Ordenae  Nota descendente
     * Comparator -> por valor
     * Referencia
     */

    private void ejemplo3() {
        System.out.println("Ejemplo 3");
        List<Estudiante> Lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = Comparator.comparingDouble(Estudiante::getNota).reversed();
        Lista.sort(comparador);
        print(Lista);
    }

    /**
     * Ordenae  por Nombre descendente
     * Comparator -> por valor
     * Referencia
     */

    private void ejemplo4() {
        System.out.println("Ejemplo 4");
        List<Estudiante> Lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = Comparator.comparing(Estudiante::getName);
        Lista.sort(comparador);
        print(Lista);
    }

    /**
     * Ordenae  por Nota ascendente 
     * Comparator -> por DOS ITEMSS
     * Lambda
     */

    private void ejemplo5() {
        System.out.println("Ejemplo 5");
        List<Estudiante> Lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = (e1, e2) -> Double.compare(e1.getNota(), e2.getNota());
        Lista.sort(comparador);
        print(Lista);
    }

    /**
     * Ordenae  por Nota descendente 
     * Comparator -> por DOS ITEMSS
     * Lamba
     */

    private void ejemplo6() {
        System.out.println("Ejemplo 6");
        List<Estudiante> Lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Lista.sort(comparador);
        print(Lista);
    }

    /**
     * Ordenae  por Nota decendente 
     * Comparator -> por DOS ITEMSS
     * Lamba
     */

    private void ejemplo7() {
        System.out.println("Ejemplo 7");
        List<Estudiante> Lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = (e1, e2) -> e2.getName().compareTo(e1.getName());
        Lista.sort(comparador);
        print(Lista);
    }

/**
     * Ordena por Nota ASCENDENTE y Nombre DESCENDENTE
     * Comparator -> por DOS ITEMS
     * Lambda
     */

    private void ejemplo8() {
        System.out.println("Ejemplo 8");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = (e1, e2) -> {
            int notaComp = Double.compare(e1.getNota(), e2.getNota());
            if (notaComp != 0) {
                return notaComp;
            } else {
                return e2.getName().compareTo(e1.getName());
            }
        };
        lista.sort(comparador);
        print(lista);
    }

    /**
     * Ordena por Nombre ASCENDENTE y Nota ASCENDENTE
     * Comparator -> valor
     * Referencia
     */

    private void ejemplo9() {
        System.out.println("Ejemplo 9");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = Comparator.comparingDouble(Estudiante::getNota)
                .thenComparing(Estudiante::getName);
        lista.sort(comparador);
        print(lista);
    }

    /**
     * Ordena por Nota DESCENDENTE y Nombre ASCENDENTE
     * Comparator -> valor
     * Comparador por lambda
     * Comparator por referencia
     */

    private void ejemplo10() {
        System.out.println("Ejemplo 10");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparador = Comparator.comparingDouble(Estudiante::getNota).reversed()
                .thenComparing(Estudiante::getName);
        lista.sort(comparador);
        print(lista);
    }

}
