
import java.util.Arrays;
import java.util.Comparator;
import models.Estudiante;

public class App {

    public static void main(String[] args) throws Exception {
        // runEjemplosPimitivos();
        runEjemplosObjetos();
        runComparators();
    }

    private static void runComparators() {

        Integer[] original = {5, 6, 4, 1, 2, 3};

        // Orden ascendente
        Arrays.sort(original);

        System.out.println("Orden ascendente:");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Orden descendente
        Arrays.sort(original, Comparator.reverseOrder());

        System.out.println("Orden descendente:");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
    }

    private static void runEjemplosObjetos() {

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
    }
}
