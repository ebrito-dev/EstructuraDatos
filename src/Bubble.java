public class Bubble {
        public int[] sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Pasada" + i);
            boolean combinaciones = false;
            /**
             * PARA PASADAS MAXIMAS
             * se inicializa la variable combinaciones en false, para que si 
             * no se hace ningun cambio en el arreglo, se rompa el bucle 
             * y no se hagan mas pasadas innecesarias
             */
            // FOR j
            for(int j = 1; j < arreglo.length - i ; j++){
                /**
                 * PARA  COMPARACIONES Y CAMBIOS
                 * se le resta i a arreglo.length para que no se compare con los elementos 
                 * que ya estan ordenados, ya que el algoritmo de burbuja va dejando 
                 * los elementos ordenados al final del arreglo
                 */
                // COMPARACION if
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
                 * PARA PASADAS MAXIMAS Y RECORRIDO DE COMPARACIONES Y CAMBIOS
                 * si no se hicieron cambios en el arreglo, se rompe el bucle 
                 * y no se hacen mas pasadas innecesarias
                 */
                break; //break rompe bucle, return rompe metodo, continue rompe iteracion y pasa a la siguiente
            }
            System.out.println("Comparaciones: " + comparaciones);
            System.out.println("Cambios: " + cambios);
        
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        return arreglo;
    }

}
    

