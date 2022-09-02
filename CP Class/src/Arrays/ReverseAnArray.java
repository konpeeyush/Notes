package Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        System.out.println(reverse(arr,0, arr.length-1));
    }
    static int reverse(int[] arr, int low, int high){
        if(low>=high) return 0 ;
        int temp=arr[low] ;
        arr[low]=arr[high] ;
        arr[high]=temp ;
        return 1+reverse(arr,low+1,high-1) ;
    }
}
