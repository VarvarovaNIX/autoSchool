/*
-2-
Массив из строчек в обратном порядке

1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */

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
