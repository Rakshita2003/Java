// print the subarrays in an array
// total subarrays and sum of all subarrays is the same

public class SubPairs {
    public static void printSubarrays(int numbers[]) {
        int ts = 0; // total subarrays

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    // print subarray
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                 System.out.println();
            }
            System.out.println();

        }
        System.out.println("total subarrays = " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }
}
