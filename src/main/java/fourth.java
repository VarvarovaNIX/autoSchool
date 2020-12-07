/*
-4-
Массив из чисел в обратном порядке

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
 */

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
