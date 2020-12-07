/*
-1-
Максимальное среди массива на 20 чисел

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
 */

public class first {
    public static void main(String[] args)
    {
        int[] list = {2, 12, 85, 0 , -6, 23, 65, 4, 87, 5, 74, 123, 66, 73, 722, -90, 80, 46, 56, 1, 64};
        int max = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] > max)
                max = list[i];
        }
System.out.println("Max is " + max);
    }
}
