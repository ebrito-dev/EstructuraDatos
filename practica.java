public class practica {
    public static void main(String[] args) {
        int [] numeros = new int[] {30, 7, 12, 5};
        for (int i = numeros.length - 1; i >= 0; i--){
            System.out.println("Combinacion del " + numeros[i]);
            for (int j = 0; j < numeros.length; j++){
                System.out.println(numeros[i] + "-" + numeros[j]);
        }
    }
    }
}