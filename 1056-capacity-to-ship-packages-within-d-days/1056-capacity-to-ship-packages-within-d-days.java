class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);
        int nodays = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int fun = countnodays(weights, mid);
            if (fun <= days) {
                nodays = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return nodays;
    }

    public static int sum(int[] weights) {
        int sum = 0;
        for (int num : weights) {
            sum += num;
        }
        return sum;
    }

    public static int max(int[] weights) {
        int max = weights[0];
        for (int num : weights) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int countnodays(int[] weights, int days) {
        int newdays = 1;
        int sum = 0;
        for (int num : weights) {
            sum += num;
            if (sum <= days) {
                continue;
            } else {
                newdays++;
                sum = num;

            }

        }

        return newdays;
    }
}