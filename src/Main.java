import javax.swing.*;


public class Main
{
    public static void main(String[] args)
    {
        int[] vals;
        while (true)
        {
            String[] s = JOptionPane.showInputDialog("Insira o valor separados por ',': ").split(",");
            vals = new int[s.length];
            for (int i = 0; i < s.length; i++)
            {
                try
                {
                    vals[i] = Integer.parseInt(s[i]);
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Error: Not a Int", "ERROR", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
            }
            break;
        }
        vals = QuickSortTest.quicksort(vals, 0, vals.length);
        for (int i = 0; i < vals.length; i++)
        {
            System.out.println(vals[i]);
        }
    }
}
