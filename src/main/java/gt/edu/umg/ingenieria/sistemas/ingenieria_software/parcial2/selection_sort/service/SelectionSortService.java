package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort.service;

public class SelectionSortService {

    public SelectionSortService(){
    }

    /**
     * Metodo de ordenamiento de seleccion  para array string
     */
    public void sort (String [] a) {
        for (int i = 0 ; i < a.length - 1 ; i++)
        {
            int minPos = this.minPosition(i,a);

            String temp = a [minPos];
            a [minPos] = a [i];
            a [i] = temp;
        }
    }

    /**
    *Encuentra el elemento mínimo dentro del array a y
     * para realizar el cambio entre el arreglo minimo dentro de un array temporal a su inicio
     */
    private int minPosition(int from, String[] a) {
        String holder = a [from];
        int position = from;
        for (int i = from ; i < a.length ; i++)
        {
            if (a [i].compareTo (holder) < 0)
            {
                holder = a [i];
                position = i;
            }
        }
        return position;
    }

    public void printArray(String arr[]){
        int n=arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
    }
}

