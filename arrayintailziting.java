public class arrayintailziting {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("element of index " + i + arr[i]);

        }
    }
}
