
// in terms of efficiency, and considering the array is sorted, I think this is the best method to use. Also a bit more readable than 
// nested for loops and hash sets at a glance.

public class SumPairCount {
    public static int countPairsWithSum(int[] arr, int X) {
        int count = 0; 
        int front = 0; // front half of arr
        int back = arr.length - 1; // back half of arr
        
        // Use two pointers to find pairs that sum to X 
        while (front < back) // while front half and back half don't cross over
        {
            int currentSum = arr[front] + arr[back];
            if (currentSum == sum) 
            {
                count++;
            }
            if (currentSum <= sum) 
            {
                front++;
            } 
            else 
            {
                back--;
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