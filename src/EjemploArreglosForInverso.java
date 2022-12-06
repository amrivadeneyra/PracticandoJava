import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"memoria ram 8GB","Celular","pc","lápiz","cuaderno","papel"};
        int total = productos.length;

       /* productos[0] = "memoria ram 8GB";
        productos[1] = "Celular";
        productos[2] = "laptop";
        productos[3] = "pc";
        productos[4] = "lápiz";
        productos[5] = "cuaderno";
        productos[6] = "papel";
*/
        Arrays.sort(productos); //para ordenar el arreglo de la A - Z

        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " :" + productos[i]);
        }
        System.out.println("============= USANDO FOR INVERSO ===============");
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }

        System.out.println("============= USANDO FOR inverso 2 ===============");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
