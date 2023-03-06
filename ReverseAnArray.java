import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args)  {

        int x[]={1,2,3,4,5};
        System.out.println(Arrays.toString(x));
        reverse(x);
        System.out.println(Arrays.toString(x));
    }


    public static void reverse(int a[])
    {
        int n=a.length-1;  //last index
        for (int i = 0; i < a.length/2; i++) {

            int temp=a[i];
            a[i]=a[n];
            a[n]=temp;
            n--;

        }
    }


    
    
    
}
