class frequencyarr {
    static void  print(int[] arr) {
        int freq = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println("frequency of " + arr[i - 1] + " is " + freq);
                freq = 1;
            }


        }
        System.out.println("frequency of " + arr[arr.length- 1] + " is " + freq);

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};

        print(arr);

    }
}
