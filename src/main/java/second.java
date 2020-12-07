import jdk.swing.interop.SwingInterOpUtils;
//Массив из строчек в обратном порядке (2 задание)
public class second {
    public static void main(String[] args)
    {
        String[] list = new String[10];
        for (int i = 0; i <= 7; i++)
        {
            list[i] = "test" + 1;

        }
        for (int i = 0; i < list.length; i++)
        {
            int j = list.length - i - 1;
            System.out.println(list [j]);
        }
    }
}
