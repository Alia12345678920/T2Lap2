import java.util.Arrays;
import java.util.Scanner;

public class RemoveEllement {

    static int[] h = {1, 2, 3, 4, 5, 6};
    ;
    static int numofelement = h.length;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int newElement ;
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        for (int j = 0; j < 6; j++) {

            System.out.println("Enter any element to move from the Array:");
            newElement = in.nextInt();
            for (int i = 0; i < a.length; i++) {
                if (a[i] == newElement) {
                    a[i] = 0;
                    System.out.println(Arrays.toString(a));

                }

            }

            }




        }

    }





