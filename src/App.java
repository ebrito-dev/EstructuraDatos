public class App {
    public static void main(String[] args) throws Exception {
         int [] original = {5, 6, 4, 1, 2, 3};
        /**
         * El arreglo original no se puede modificar, por eso 
         * se hace un clon de este para que se pueda usar en 
         * los dos métodos de ordenamiento.
         */
        int [] b = original.clone();
        int [] c = original.clone(); 
        int [] d = original.clone();
        /**
         * El clone sirve para que el arreglo original no se modifique 
         * y se pueda usar en los dos métodos de ordenamiento.
         */ 

        // USAR MÉTODO DEL ARCHIVO (clase) BUBBLE
        System.out.println("---------------------------------------------------");
        // INSTANCIAR el archivo BUBBLE
        // INSTANCIA la clase BUBBLE
        System.out.println("Original:");
        Bubble bubble = new Bubble();
        // EJECUTAR CÓDIGO DEL ARCHIVO BUBBLE, USO LA INSTANCIA bubble
        printArray(b);
        bubble.sort(b);
        printArray(b);
        
        System.out.println("---------------------------------------------------");
        /// Instanciar el archivo SELECTION
        Selection selection = new Selection();
        printArray(c);
        selection.sort(c);
        printArray(c);
        /*
         * El sort sirve para llamar el método de ordenamiento SELECTION, se le 
         * pasa el arreglo c que es una copia del arreglo original, 
         * para que se pueda usar en los dos métodos de ordenamiento y
         * el printArray para imprimir el arreglo ordenado después de usar 
         * el método sort.
         */
        Insertion insertion = new Insertion();
        printArray(d);
        insertion.sort(d);
        printArray(d);

        

    }

    public static void printArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) 
            System.out.print(arreglo[i] + " - ");
        System.out.println();
        /**
         * Este método sirve para imprimir el arreglo, 
         * se le pasa el arreglo que se quiere imprimir y funciona 
         * con un bucle for que recorre el arreglo e imprime cada elemento.
         */
         
            
    }
}