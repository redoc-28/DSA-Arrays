public class leftrotatedtimes {
    static int rotate(int[] arr, int n) {
        int temp= arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];

            arr[n - 1] = temp;
        }

        return temp;

    }
    static int rotate2(int[] arr , int d , int n) {
        for (int i = 1; i < d; i++) {
            rotate(arr, n);
        }
        return rotate(arr,n);
    }




    public static void main(String[] args) {
        int[] arr = {2,3,45,56,6,7};
        int n = 6;

        for (int i = 0; i < n; i++) {
            System.out.println(rotate(arr,n));

        }
    }

}
