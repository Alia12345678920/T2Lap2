import java.util.Arrays;
public class CopyAnArray {
    static int[] h ={1,2,3,4,5};
    public static void main(String[] args) {

        System.out.println(Arrays.toString(h));
        copy(h);

    }
    public static void copy(int[] a)
    {

        for (int i = 0; i < a.length; i++) {

            a[i]=h[i];

        }

        System.out.println(Arrays.toString(a));
    }
}
