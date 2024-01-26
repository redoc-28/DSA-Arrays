public class leftrotation {
    static int rotate(int[] arr, int n) {
        int temp= arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

            arr[n - 1] = temp;
        }

        return temp;

    }


    

    public static void main(String[] args) {
        int[] arr = {2,3,45,56,6,7};
        int n = 6;

        for (int i = 0; i < n; i++) {
            System.out.println(rotate(arr,n));

        }
    }

}
