import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Estudiante;

public class Comparable {
    
    private List<Estudiante> estList;
    private Estudiante[] estArray;
    
    public Comparable() {
        Estudiante e1 = new Estudiante("Juan", 10);    
        estArray = new Estudiante[] {e1,
                    new Estudiante("Maria", 7.5),
                    new Estudiante("Pedro", 3.4),
                    new Estudiante("Pedro", 7),
                    new Estudiante("Diego", 6.8),
        };

        estList = new ArrayList<>(List.of(estArray));

        //ejemplo1();
        ejemplo2();
        ejemplo3();

    }
    /* 
    private void ejemplo1() {
        int x = 10 ; int y = 20;
        int compInt = Integer.compare(x, y);
        String a = "Hola" ; String b = "hola";
        int compStr = a.compareTo(b);
        Estudiante e1 = estList.get(0);
        Estudiante e2 = estList.get(1);
        int compEst = Double.compare(e1.getNota(), e2.getNota());
        estList.sort(null);
    }
    */

    //orden natural
    private void ejemplo2() {
        System.out.println("Ejemplo 2: Orden natural de Estudiante");
        List<Estudiante> list = new ArrayList<>(estList);
        list.sort(null);
        print(list);
    }

    private void print(List<Estudiante> list) {
        for(Estudiante est : list) {
            System.out.println(est);
        }
    }

    //Orden natural descendente
    //Comparable -> orden natural invertido
    private void ejemplo3() {
         System.out.println("Ejemplo 3");
        List<Estudiante> list = new ArrayList<>(estList);
        list.sort(Comparator.reverseOrder());
        print(list);
    }

}