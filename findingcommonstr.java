import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findingcommonstr {
    static void findcommon(String arr1[],String arr2[]){

        Set<String> set = new HashSet<> ();
        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    set.add(arr1[i]);
                    break;
                }


            }

        }
        for (String  i : set){
            System.out.println(set);
        }
    }

    public static void main(String[] args) {
        String[]  arr1 = { "AB","DF","GH","IU"};
        String[]  arr2 = { "DF","GH","JK","OP"};
        System.out.println("array 1" + Arrays.toString(arr1));
        System.out.println("array 2" + Arrays.toString(arr2));
        findcommon(arr1,arr2);
    }

}
