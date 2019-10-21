public class QuickSortTest
{

    public static int[] vals;

    public static int[] quicksort(int[] val, int begin, int end)
    {
        vals = val;
        int pivot = val[((begin + end)/2)]; // Ter um pivô que esteja no meio do array
        int i = begin;
        int j = end - 1;

        while (i <= j)
        {
            // Verificar os números menores que já estão à esquerda do pivô
            while (vals[i] < pivot && i < end)
            {
                i++;
            }
            // Verificar o próx núm do fim menor que o pivô
            while (vals[j] > pivot && j > begin)
            {
                j--;
            }
            // Deve ser trocado os valores, verificando a procedencia dos números e os mesmos indo para o próximo
            if(i <= j)
            {
                swap(i, j);
                i++;
                j--;
            }
        }
        // Caso o j seja maior que o inicio, dividir e conquistar à direita do pivot
        if(j > begin)
            quicksort(vals, begin, j + 1);
        // Caso o i seja menor que o inicio, dividir e conquistar à esquerda do pivot
        if (i < end)
            quicksort(vals, i, end);
        return vals;
    }
    public static void swap(int indexI, int indexJ)
    {
        int aux = vals[indexI];
        vals[indexI] = vals[indexJ];
        vals[indexJ] = aux;
    }
}
