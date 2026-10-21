public class insertion {
    public int[] sort(int[] arreglo) {
        for(int i = 1; i < arreglo.length; i++){
            int key = arreglo[i];
            int j = j - 1;
            while(j >= 0 && arreglo[j] > key){
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
    }   
}
