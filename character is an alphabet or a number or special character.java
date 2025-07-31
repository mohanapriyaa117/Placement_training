import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        char ch = sc.next().charAt(0);
        if(ch>=65&&ch<=90||ch>=97&&ch<=122)
           System.out.println("ALPHABET");
        else if(ch>=48&&ch<=57)
            System.out.println("NUMBER");
        else
            System.out.println("SPECIAL CHARACTER");
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
