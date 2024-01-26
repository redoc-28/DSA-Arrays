public class Removduplieff {
    static int remove(int[] arr) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;


    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 20, 30, 30, 30, 30, 40, 40, 40, 40};
        int n = 12;

        System.out.println("before removal");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

        System.out.println();
        n = remove(arr);
        System.out.println("after removal");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}


