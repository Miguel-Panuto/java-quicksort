public class Quicksort
{

    private int[] vals;
    private int pivot, pivotIndex;

    public Quicksort(int[] vals)
    {
        this.vals = vals;
        quicksort(0, (vals.length));
    }

    private void quicksort(int began, int end)
    {
        int i = began; // Variável auxiliar do inicio
        int j = end - 1; // Variável auxiliar do final (lembrando que o index total é diferente do último)
        int pivot = vals[(i + j) /2];
        while (i <= j)
        {
            while(vals[i] < pivot && i < end)
            {
                i ++;
            }
            while(vals[j] > pivot && j > began)
            {
                j --;
            }
            if(i <= j)
            {
               swap(i, j);
               i++;
               j--;
            }
        }
        if(j > began)
            quicksort(began, j + 1);
        if (i < end)
            quicksort(i, end);
    }

    private void swap(int minIndex, int maxIndex)
    {
        int aux = vals[minIndex];
        vals[minIndex] = vals[maxIndex];
        vals[maxIndex] = aux;
    }

    @Override
    public String toString()
    {
        String s = "";
        for (int i = 0; i < vals.length; i++)
        {
            s += vals[i];
            if(i != vals.length - 1)
                s+= ", ";
        }
        return s;
    }
}
