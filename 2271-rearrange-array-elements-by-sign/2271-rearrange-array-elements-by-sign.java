class Solution {
    public int[] rearrangeArray(int[] nums) {
        //Brute force

        int n=nums.length;
        List<Integer> arrpos = new ArrayList<>(n/2);
        List<Integer> arrneg = new ArrayList<>(n/2);
       

        for(int i=0;i<n;i++){
            if (nums[i]<0)
            {
                arrneg.add(nums[i]);
            }
            else {
                arrpos.add(nums[i]);
        }}

        for(int i=0;i<n/2;i++){
            nums[2*i]=arrpos.get(i);
            nums[2*i+1]=arrneg.get(i);
        }

        return nums;

        
    }
  } 