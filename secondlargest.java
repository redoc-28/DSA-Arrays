public class secondlargest {
    static  int largest(int arr[] ){
        int max= arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
            return max;

        }

    }

    static int secondlarge(int[] arr){
        int max2 = largest(arr);
        int res =-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] != max2)
            {
                if (res == -1)
                    res = i;
                else if (arr[i]>arr[res])
                    res = i;
                    
                }
            }
            return res;
        }
    }


}
