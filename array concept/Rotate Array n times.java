import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int count=1;count<=k%size;count++){
           int copy = a[size-1];
            for(int i=size-1;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0]=copy;
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
