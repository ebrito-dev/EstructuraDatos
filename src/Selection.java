public class Selection {
    public int[] sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            //la condicion dice que se va a recorrer el arreglo hasta el penultimo 
            // elemento, ya que el ultimo elemento no tiene con quien compararse
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                comparaciones++;
                /*
                Numero de comparaciones se incrementa en 1 cada vez 
                que se compara un elemento del arreglo con el elemento 
                mínimo encontrado hasta el momento
                */
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            // Intercambiar el elemento mínimo encontrado con el primer elemento
            int temp = arreglo[min];
            arreglo[min] = arreglo[i];
            arreglo[i] = temp;
            cambios++; 

            System.out.println("Pasada= " + i + " " + "|" + "Cambios= " + arreglo[min] + "<->" + arreglo[i]);
            /**
            Incrementar el contador de cambios 
            por que se hizo un intercambio 
            al final de cada pasada
            */

        }

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Ordenado Asc:");
        return arreglo; // para que después se pueda imprimir el arreglo ordenado en la clase App.java
    }
}   