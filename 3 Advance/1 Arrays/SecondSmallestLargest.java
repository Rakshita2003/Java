public class SecondSmallestLargest {

    public static int smallest(int arr[]) {
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secondsmall = small;
                small = arr[i];
            } else if (arr[i] < secondsmall && arr[i] != small) {
                secondsmall = arr[i];
            }
        }
        return small;
    }

    public static int largest(int arr[]){
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
               secondlarge= large;
                large=arr[i];
            }
         else if(arr[i]>secondlarge && arr[i]!=large){
                secondlarge=arr[i];
            }
        }
        
        return secondlarge;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 8 };
        System.out.println(smallest(arr));
        System.out.println(largest(arr));
    }
}
