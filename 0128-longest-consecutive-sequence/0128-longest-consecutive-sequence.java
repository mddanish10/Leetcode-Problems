class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] arr = nums;
        int count = 0;
        int ccount = 1;
        if (arr.length==1){
            return 1;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                ccount++;
               
            } else if (arr[i] == arr[i - 1] ) {
               

            } else {
                ccount = 1;
            }
             count = Math.max(count, ccount);

        }
        return count;

    }
}