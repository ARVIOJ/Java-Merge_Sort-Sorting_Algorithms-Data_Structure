package main;

public class OrdenamientoMergesort {

    public static void main(String[] args) {
        
        MargeSort mg = new MargeSort();
        
        int[] s = {21, 2, 232, 34};
              
        //desordenado
        for (int i = 0; i < s.length; i++) 
        {
            System.out.println(s[i]);
        }
        System.out.println("");
        
        int [] arrayOrdenado = mg.mergeSort(s);
        //ordenado
        for (int i = 0; i < s.length; i++) 
        {
            System.out.println(arrayOrdenado[i]);
        }
        System.out.println("");
    
    }

}
