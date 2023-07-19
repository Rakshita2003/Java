// given an integer arr nums, return true if any value appears atleast twice in the array and return false if every element is distinct 
// T.C is O(n^2)

public class appearsTwice {
    public static boolean containsDuplicate(int nums[]) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }
}
