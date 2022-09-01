package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {20, 10, 120, 40};
        System.out.println(sMax(arr, arr.length));
    }

    static int sMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax && max != arr[i]) {
                sMax=arr[i] ;
            }
        }
        return sMax ;
    }
}
