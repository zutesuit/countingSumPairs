public static int countSumPairs(int[] arr, int X) {
        int count = 0; 
        
        // Count pairs and check sums
        for (int i = 0; i < arr.length; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if ((arr[i] + arr[j]) == X) 
                    count++;
        
        return count;
        // while fine, bit of a jumble to look at initially. 
}

// seems the obvious way to do it? I like this way too:

public static int countPairsWithSum(int[] arr, int X) {
        Set<Integer> seen = new HashSet<>();
        int count = 0;

        for (int num : arr) 
        {
            int complement = X - num;
            if (seen.contains(complement)) 
            {
                count++;
            }
            seen.add(num);
        }
        return count;
    }

    
