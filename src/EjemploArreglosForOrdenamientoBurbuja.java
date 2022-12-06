import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
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

    public static void sotBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int count = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) > 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                count++;
            }
        }

        System.out.println("count = " + count);
    }

    public static void main(String[] args) {

        String[] productos = {"memoria ram 8GB", "Celular", "pc", "lápiz", "cuaderno", "papel", "dados"};

        int total = productos.length;

        sotBurbuja(productos);

        System.out.println("============= USANDO FOR ===============");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " :" + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = 7;
        numeros[2] = 35;
        numeros[3] = -1;

        sotBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("i = " + i + " : " + numeros[i]);
        }
    }
}
