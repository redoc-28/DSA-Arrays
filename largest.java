import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;

public class largest {
    static void large(int[] arr , int n )
    {
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }

            }
            if (flag == true) {


            }
        }



    }

    public static void main(String[] args)
            throws IOException {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println();
    }
}
