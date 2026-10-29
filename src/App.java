import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import models.Estudiante;

public class App {

    public static void main(String[] args) throws Exception {
        // runEjemplosPimitivos();
        // runEjemplosObjetos();
        runComparators();
        runComparatorsObj();
        runComparatorsObj2();
    }

    private static void runComparatorsObj2() {
        Estudiante e1 = new Estudiante("Juan", 10.0);
        Estudiante[] estudiantes = { 
            e1,
            new Estudiante("Juan", 10.0),
            new Estudiante("Maria", 7.0),
            new Estudiante("Diego", 3.5)
        };

        Comparator<Estudiante> compNots = Comparator.comparingDouble(Estudiante::getNota);        
        Arrays.sort(estudiantes, compNots);

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        List<Estudiante> estudianteLista = new ArrayList<>(List.of(
            e1,
            new Estudiante("Juan", 10.0),
            new Estudiante("Maria", 7.0),
            new Estudiante("Diego", 3.5)
        ));

        estudianteLista.sort(compNots);
        for (Estudiante estudiante : estudianteLista) {
            System.out.println(estudiante);
        }
    }

    private static void runComparatorsObj() {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 6, 4, 1, 2, 3));
        
        numeros.sort(Comparator.naturalOrder());
        System.out.println(numeros);

        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);

        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    private static void runComparators() {

        Integer[] original = {5, 6, 4, 1, 2, 3};

        // Orden ascendente
        Arrays.sort(original);

        System.out.println("Orden ascendente:");
        for (Integer original1 : original) {
            System.out.print(original1 + " ");
        }
        System.out.println();

        // Orden descendente
        Arrays.sort(original, Comparator.reverseOrder());

        System.out.println("Orden descendente:");
        for (Integer original1 : original) {
            System.out.print(original1 + " ");
        }
        System.out.println();
    }

    /*private static void runEjemplosObjetos() {

        Estudiante e1 = new Estudiante("Juan", 10.0);

        Estudiante[] estudiantes = {
            e1,
            new Estudiante("Maria", 7.0),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 6.8)
        };

        Bubble bubble = new Bubble();
        bubble.sortEstudiantes(estudiantes);

        System.out.println(
            "Primer estudiante ordenado: " + e1.getName()
        );
    }

    public static void runEjemplosPimitivos() {

        int[] original = {5, 6, 4, 1, 2, 3};

        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        System.out.println("-----------------------------------");
        System.out.println("Ordenamiento Bubble:");
        Bubble bubble = new Bubble();
        printArray(b);
        bubble.sort(b);
        printArray(b);

        System.out.println("-----------------------------------");
        System.out.println("Ordenamiento Selection:");
        Selection selection = new Selection();
        printArray(c);
        selection.sort(c);
        printArray(c);

        System.out.println("-----------------------------------");
        System.out.println("Ordenamiento Insertion:");
        Insertion insertion = new Insertion();
        printArray(d);
        insertion.sort(d);
        printArray(d);
    }

    public static void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }/* */
}