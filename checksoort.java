public class checksoort {

    static boolean check(int arr[]) {
        for (int i = 0; i < arr.length; i++) {


            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,4,5,6,7};
        System.out.println(check(arr));
    }
}



