
// in terms of efficiency, and considering the array is sorted, I think this is the best method to use. Also a bit more readable than 
// nested for loops and hash sets at a glance.

public class SumPairCount {
    public static int countPairsWithSum(int[] arr, int X) {
        int count = 0; 
        int left = 0; // front
        int right = arr.length - 1; // back
        
        // Use two pointers to find pairs that sum to X 
        while (left < right) 
        {
            int currentSum = arr[left] + arr[right];
            if (currentSum == sum) 
            {
                count++;
            }
            if (currentSum <= sum) 
            {
                left++;
            } 
            else 
            {
                right--;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6};
        int target = 9;

        int result = countPairsWithSum(array, targetSum);
        System.out.printf("Amount of pairs that sum to %d: %d", targetSum, result);
    }
}