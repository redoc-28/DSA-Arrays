import javax.naming.directory.SearchControls;
import java.util.Scanner;

public class exapmle {
    public static int search(int [] arr, int n,int x) {
        for (int i = 0; i <=n ; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
        }

 //driver Code
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};
         x = 10;
        System.out.println(x  + " found at " +  search(a1,x));
    }
}
