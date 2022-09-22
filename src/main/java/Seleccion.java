
public class Seleccion {

    public static void main(String[] args) {
        System.out.println("Humberto Simón Cruz");
        Cubeta c = new Cubeta();
        int[] arreglo = {13, 45, 1, 14, 25, 6, 60, 7, 30, 10};
        c.bucket(arreglo, 10);

        c.impr(arreglo);
    }

}
