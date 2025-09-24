class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
       // int res = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int total = totalhr(piles, mid);

            if (total <= h) {
             //   res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return low;
    }

    public static int max(int piles[]) {

        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    public static int totalhr(int piles[], int hour) {

        int totalhr = 0;
        for (int i = 0; i < piles.length; i++) {
            totalhr += Math.ceil((double)piles[i] / hour);
        }
        return (int)totalhr;
    }

}