public class second {
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
