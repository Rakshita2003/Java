// Find the index of element in the given array, key=10
// using Linear Search   T.C=O(n)

public class Searching {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}
