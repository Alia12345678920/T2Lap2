import java.util.Arrays;

public class Q_3 {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};
        int[] newint = new int[arr1.length + arr2.length];
        for (int i = 0; i < newint.length; i++) {
            if (i < arr1.length) {
                newint[i] = arr1[i];
            } else {
                newint[i] = arr2[i - arr1.length];
            }System.out.print(newint[i]);

        }
        System.out.println(" ");

        int[] str1 = {1,2};
        int[] str2 = {3,4,5};
        int str1Length = str1.length;
        int str2length = str2.length;

        str1 = Arrays.copyOf (str1, str1Length + str2length);// توسيع المصفوفة
        System.arraycopy(str2, 0, str1, str1Length, str2length);
        System.out.println(Arrays.toString(str1));
    }
}