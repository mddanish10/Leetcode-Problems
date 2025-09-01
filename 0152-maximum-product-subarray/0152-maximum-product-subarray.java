class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        
        // brute force 
        // for (int i = 0; i < n; i++) {
        //     int product = 1;
        //     for (int j = i; j < n; j++) {
        //         product = product * nums[j];
        //         largest = Math.max(largest, product);
        //     }
           

        // }

        //optimal solution
        //1-if all positive than its 
        //2-if even negative
        //3-if odd negative
        //4 if any zero than value be after the zero
         int prefix =1;
            int suffix =1;
        for(int i=0;i<n;i++){
           
           if ( prefix == 0 ) {prefix=1;}
           if ( suffix == 0) {suffix =1;}
           prefix = prefix * nums[i];
           suffix = suffix * nums[n-1-i];
           largest= Math.max(largest, Math.max(prefix,suffix));
        }


        return largest;

    }
}