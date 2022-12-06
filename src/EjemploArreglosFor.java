import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "memoria ram 8GB";
        productos[1] = "Celular";
        productos[2] = "laptop";
        productos[3] = "pc";
        productos[4] = "lápiz";
        productos[5] = "cuaderno";
        productos[6] = "papel";

        Arrays.sort(productos); //para ordenar el arreglo de la A - Z

        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " :" + productos[i]);
        }

        System.out.println("============= USANDO FOREACH ===============");
        for (String prod : productos) {
            System.out.println("prod = " + prod);

        }
        System.out.println("============= USANDO WHILE ===============");
        int i = 0;
        while (i < total) {
            System.out.println("Para indice " + i + " :" + productos[i]);
            i++;
        }
        System.out.println("============= USANDO DO WHILE ===============");
        int j = 0;
        do {
            System.out.println("Para indice " + j + " :" + productos[j]);
            j++;
        } while (j < total);

        int[] numeros = new int[10];
        int totalnum = numeros.length;

        for (int k = 0; k < totalnum; k++) {
            numeros[k] = k * 2;
        }

        for (int k = 0; k < totalnum; k++) {
            System.out.println("numeros = " + numeros[k]);
        }


    }
}
