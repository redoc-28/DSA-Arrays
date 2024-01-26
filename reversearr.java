public class reversearr {
    static int reverse(int[] arr,int n) {
        int temp , low = 0, high = n - 1;

        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        // doubt

    }
    static void print(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.println(arr[i]);

    }

        public static void main (String[]args){
            int[] arr = {12, 13, 14, 15, 16};

            print(arr, 6);
            reverse(arr, 6);
            System.out.println("Reversed array");
            print(arr, 6);
        }
    }

