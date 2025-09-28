class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        int low = min(bloomDay);
        int high = max(bloomDay);
        

        if (((long) m * k )> n) {
            return -1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int no = count(bloomDay, mid, k);

            if (no >= m) {
              
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return low;

    }

    public static int min(int[] bloomDay) {
        int min = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
        }

        return min;

    }

    public static int max(int[] bloomDay) {
        int max = bloomDay[0];
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        return max;
    }

    public static int count(int[] bloomDay, int mid, int k) {

        int bcount = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {
                count++;
               
                }

            else {
                 bcount += count / k;
                 count = 0;
            }
           
        }
         bcount += count / k;

        return bcount;
    }
}