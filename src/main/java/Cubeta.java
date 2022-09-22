
import java.util.ArrayList;

public class Cubeta {

    public void bucket(int[] arr, int n) {
      

        ArrayList cubetas[] = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            cubetas[i] = new ArrayList();
        }
        for (int index = 0; index < n; index++) {
            int num = arr[index] / n;
            cubetas[num].add(arr[index]);
        }
        
        
           int pivote = 0;
        int temp = 0;
        int aux = 0;
        int min = 0;

        //metodselect ordena = new metodselect();
        for (int a = 0; a < n; a++) {
            //ordena.ordenselect((cubetas[a]));
            for (pivote = 0; pivote < arr.length; pivote++) {
            min = pivote;
            for (aux = pivote + 1; aux < arr.length; aux++) {
                if (arr[aux] < arr[min]) {
                    min = aux;
                }
            }
            temp = arr[pivote];
            arr[pivote] = arr[min];
            arr[min] = temp;
        }  
        }
        int Contador = 0;
        for (int cub = 0; cub < n; cub++) {
            for (int val = 0; val < cubetas[cub].size(); val++) {
                arr[Contador] = (int) cubetas[cub].get(val);
                Contador = Contador + 1;

            }
        }
        

    }
 public void impr(int[] arr) {
        for (int h = 0; h < arr.length; h++) {

            System.out.print(arr[h] + ",");
        }

    }
}
