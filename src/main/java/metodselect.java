
public class metodselect {

    public void ordenselect(int [] arr) {
        int pivote = 0;
        int temp = 0;
        int aux = 0;
        int min = 0;

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

    public void impr(int[] arr) {
        for (int h = 0; h < arr.length; h++) {

            System.out.print(arr[h] + ",");
        }

    }
   }
