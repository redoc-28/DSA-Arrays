public class leadereff {
    static void leader(int[] arr, int n){
        n = arr.length;
        int arr_ldr = arr[n-1];
        System.out.println(arr_ldr);
        for (int i = n-2; i <arr.length ; i--) {
            if(arr_ldr < arr[i]){
                arr_ldr = arr[i];
            }

            System.out.println(arr_ldr);
        }

    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        System.out.println(leader(arr,n));
    }

}
