// maxSubarraySum using Kadanes Algorithm. T.C is O(n)

public class MaxSubarraySum {
    public static void kadanesAlgo(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        System.out.println("Max Subarray sum is " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanesAlgo(numbers);
    }
}