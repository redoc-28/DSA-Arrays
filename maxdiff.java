public class maxdiff {
    static int max(int[] arr){
       int  res = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i +1; j < arr.length ; j++)
            {
                if( arr[j]-arr[i] > res);
                res = arr[j]-arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 90, 10, 110};
        System.out.println(max(arr));
    }
}
