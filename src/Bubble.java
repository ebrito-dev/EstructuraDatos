public class Bubble {
        public int[] sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Pasada " + i);
            boolean combinaciones = false;
            /**
             * PARA PASADAS MÁXIMAS
             * Se inicializa la variable combinaciones en false, para que si 
             * no se hace ningún cambio en el arreglo, se rompa el bucle 
             * y no se hagan más pasadas innecesarias.
             */
            // FOR j
            for(int j = 1; j < arreglo.length - i ; j++){
                /**
                 * PARA COMPARACIONES Y CAMBIOS
                 * Se le resta i a arreglo.length para que no se compare con los elementos 
                 * que ya están ordenados, ya que el algoritmo de burbuja va dejando 
                 * los elementos ordenados al final del arreglo.
                 */
                // COMPARACIÓN if
                comparaciones ++;
                if(arreglo[j -1] > arreglo[j]){
                    // INTERCAMBIO DE VALORES
                    cambios ++;
                    combinaciones = true;
                    int aux = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;
   
                }
            
            }
            if(!combinaciones){
                /**
                 * PARA PASADAS MÁXIMAS Y RECORRIDO DE COMPARACIONES Y CAMBIOS
                 * Si no se hicieron cambios en el arreglo, se rompe el bucle 
                 * y no se hacen más pasadas innecesarias.
                 */
                break; // break rompe bucle, return rompe método, continue rompe iteración y pasa a la siguiente
            }
            System.out.println("Comparaciones: " + comparaciones);
            System.out.println("Cambios: " + cambios);
        
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        return arreglo;
    }
}