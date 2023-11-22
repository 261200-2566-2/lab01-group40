import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void Sortout(int[] ar,int n) {
        Arrays.sort(ar);
        System.out.println("Sorted result:");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+") "+ar[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner mynum = new Scanner(System.in);
        System.out.print("Enter amout of num: ");
        int n = mynum.nextInt();
        if (n < 0) {
            System.out.println("Pls enter a non-negative int");
            mynum.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+") ");
            numbers[i] = mynum.nextInt();
        }
        Sortout(numbers,n);
        mynum.close();

    }
}
