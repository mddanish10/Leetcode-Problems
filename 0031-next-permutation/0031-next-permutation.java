class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int bp = -1;
        //find breakpoint and come out of the loop;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                bp = i;
                break;

            }
        }

        if (bp == -1) {
            rev(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i >= bp + 1; i--) {
            if (nums[i] > nums[bp]) {
                swap(nums, bp, i);
                break;
            }
        }

        rev(nums, bp + 1, n - 1);

    }

    public static void swap(int nums[], int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }

    public static void rev(int nums[], int a, int b) {

        while (a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }

    }

}