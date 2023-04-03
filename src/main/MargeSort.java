package main;

public class MargeSort {

    public int [] mergeSort(int [] A)// Ordenar el areglo de numéros A
    {

        if (A.length <= 1) {
            return A;
        } else {
            int [] left;
            int [] right;

            right = new int[A.length / 2];

            if (A.length % 2 == 0) {
                left = new int [A.length/2];
            } else {
                left = new int[(A.length/2 + 1)];
            }

            int i;
            for (i = 0; i < left.length; ++i) {
                left[i] = A[i];
            }

            int k = 0;

            for (int j = i; j < A.length; ++j) {
                right[k] = A[j];
                ++k;
            }

            // Parte recursiva
            int[] arrayOrdenado = Merge(mergeSort(left), mergeSort(right));

            return arrayOrdenado;
        }
    }

    public int[] Merge(int[] a, int[] b) // Recibe dos SubArrays y los une en uno ordenadamente."a,b" deben de estar ordenados
    {
        int i = 0;
        int j = 0;
        int [] c = new int[a.length + b.length];
        for (int k = 0; k < c.length; ++k) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                ++i;
            } else {
                c[k] = b[j];
                ++j;
            }
            if (i == a.length) {
                ++k;
                for (j = j; j < b.length; j++) {
                    c[k] = b[j];
                    ++k;
                }
            } else if (j == b.length) {
                ++k;
                for (i = i; i < a.length; i++) {
                    c[k] = a[i];
                    ++k;
                }
            }
        }
        return c;
    }

}
