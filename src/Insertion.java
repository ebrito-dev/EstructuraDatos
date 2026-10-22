public class Insertion {
    public int[] sort(int[] arreglo) {
        for(int i = 1; i < arreglo.length; i++){
            int key = arreglo[i];
            int j = i - 1;
            while(j >= 0 && arreglo[j] > key){
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
            System.out.println("Se inserta el valor " + key + " en la posición " + (j + 1));
        }
        return arreglo;
    }   
}