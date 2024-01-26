import java.util.ArrayList;

public class findingcomonarr {
    static void dupli(int arr1[],int arr2[] )
    {

        ArrayList<Integer> set = new ArrayList<>();

        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                        set.add(arr1[i]);
                        break;


                }
                
            }
        }
        // appending common elements to array list
        for (Integer i : set) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {2,4,5,8,7};
        dupli(arr1,arr2); //calling func

    }

}
