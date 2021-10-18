package homework;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {3, 6, 9, 89, 78, 4, 5, 51, 2, 23, 13};

        System.out.println();
        System.out.println("---------");
        int min = array[0];
        for(
                int i = 1;
                i<array.length;i++)

        {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = "+min);
    }


}








