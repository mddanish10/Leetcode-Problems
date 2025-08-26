class Solution {
    public int longestConsecutive(int[] nums) {
        //better Solution
        // int n = nums.length;
        // Arrays.sort(nums);
        // int[] arr = nums;
        // int count = 1;
        // int ccount = 1;

        // if (arr.length==0){
        //     return 0;
        // }

        // for (int i = 1; i < n; i++) {
        //     if (arr[i] - arr[i - 1] == 1) {
        //         ccount++;

        //     } else if (arr[i] == arr[i - 1] ) {

        //     } else {
        //         ccount = 1;
        //     }
        //      count = Math.max(count, ccount);

        // }
        // return count;

        //Optimal Solution

        if (nums.length == 0) {
            return 0;
        }

        int count = 1;
        Set<Integer> hs = new HashSet<>();
        for (int arr : nums) {
            hs.add(arr);
        }

        for (int arr : hs) {
            if (!hs.contains(arr - 1)) {
               int cnum = arr;
                int ccount = 1;

            while (hs.contains(cnum + 1)) {
                cnum++;
                ccount++;

            }
            count = Math.max(count, ccount);
            }
                
            
        }

        return count;

    }
}