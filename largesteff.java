import com.sun.jdi.PathSearchingVirtualMachine;

public class largesteff {
    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 5, 6, 67, 8888, 889989};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }

}








