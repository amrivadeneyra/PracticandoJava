import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "memoria ram 8GB";
        productos[1] = "Celular";
        productos[2] = "laptop";
        productos[3] = "pc";
        productos[4] = "lápiz";
        productos[5] = "cuaderno";
        productos[6] = "papel";

        Arrays.sort(productos); //para ordenar el arreglo de la A - Z

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0]  = " + prod1);
        System.out.println("productos[0]  = " + prod2 );
        System.out.println("productos[0]  = " + prod3 );
        System.out.println("productos[0]  = " + prod4 );
        System.out.println("productos[0]  = " + prod5 );
        System.out.println("productos[0]  = " + prod6 );
        System.out.println("productos[0]  = " + prod7 );

        int[] numeros = new int[4];

        numeros [0] = 20;
        numeros [1] = 5;
        numeros [2] = 3;
        numeros [3] = 45;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
