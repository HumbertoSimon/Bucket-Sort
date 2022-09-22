
public class Seleccion {

    public static void main(String[] args) {
        System.out.println("Humberto Simón Cruz");
        metodselect ordena = new metodselect();
        int[] arreglo = {123, 45, 1, 14, 25, 7, 60, 7, 30, 0};
        ordena.ordenselect(arreglo);
        ordena.impr(arreglo);
    }

}
