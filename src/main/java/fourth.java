//Массив из чисел в обратном порядке (4 задание)
public class fourth {
    public static void main(String[] args)
    {
        int[] list = new int [10];
        {
            for (int i = 0; i < list.length; i++)
                list [i] = i + 1;
            {
                for (int i = 0; i < list.length; i++)
                {
                    int j = list.length - i - 1;
                    System.out.println(j);
                }

            }

        }


    }
}
