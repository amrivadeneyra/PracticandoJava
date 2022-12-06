import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloinverso(String[] arreglo) {

        /*EXPLICITA
        * EXPLICITA
        * EXPLICITA
        * EXPLICITA
        * */
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {"memoria ram 8GB", "Celular", "pc", "lápiz", "cuaderno", "papel"};

        int total = productos.length;

        Arrays.sort(productos); //para ordenar el arreglo de la A - Z
        arregloinverso(productos);


       // Collections.reverse(Arrays.asList(productos));//convierte un arreglo de tipo String a una lista de tipo String

        System.out.println("============= USANDO FORE ===============");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " :" + productos[i]);
        }
    }
}
