public class movezero {
    static int move(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == 0){
                for (int j = 0; j <arr.length ; j++) {
                    if(arr[i]!=0){
                        swap(arr[i],arr[j])
                    }

                }
            }

        }
    }
}
