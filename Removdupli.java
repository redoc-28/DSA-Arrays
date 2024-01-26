public class Removdupli {
    static int remove(int[] arr, int n) {
        int temp[] = new int[n];

        temp[0] = arr[0];

        int res = 1;
        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }

        }
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,20,30,30,30,30,40,40,40,40};
        int n=12;

        System.out.println("before removal");
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);
            System.out.println();
        }


        n = remove(arr,n);
        System.out.println("after removal");
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        }

    }
}


