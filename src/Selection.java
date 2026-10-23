
public class Selection {

    public int[] sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {

            // Buscar el indice del elemento minimo
            int min = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;

                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            // Intercambiar solo si el minimo esta en otra posicion
            if (min != i) {
                int temp = arreglo[min];
                arreglo[min] = arreglo[i];
                arreglo[i] = temp;

                cambios++;

                System.out.println(
                    "Pasada = " + i
                    + " | Intercambio realizado"
                );
            } else {
                System.out.println(
                    "Pasada = " + i
                    + " | No hace falta intercambiar"
                );
            }
        }

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + cambios);
        System.out.println("Ordenado ascendente:");

        return arreglo;
    }
}
