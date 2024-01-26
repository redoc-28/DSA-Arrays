public class maxdiffeff {
    static int max(int[] arr){
        int minval = arr[0];
        int res = arr[1]-arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]-minval > res )
                res = arr[i]-minval;
            if (minval > arr[i])
                minval = arr[i];
        }
    return res;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,90,10,110};
        System.out.println(max(arr));
    }
}
