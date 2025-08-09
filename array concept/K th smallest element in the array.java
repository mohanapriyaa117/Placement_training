import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        if (k > size) {
            System.out.print("Out of Range");
        } else {
            Arrays.sort(a); // Sort the array
            System.out.print(a[k - 1]); // k-th smallest (index is k-1)
        }
    }
}
