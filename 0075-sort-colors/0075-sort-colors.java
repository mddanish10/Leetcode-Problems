class Solution {
    public void sortColors(int[] nums) {
         int n=nums.length;
        int red=0;
        int white=0;
        int blue=0;
       for(int i=0;i<n;i++){
        if(nums[i]==0){
            red++;
        }
        if(nums[i]==1){
            white++;
        }
        if(nums[i]==2){
            blue++;
        }
       }

       for(int j=0;j<red;j++){
        nums[j]=0;
       }
        for(int j=red;j<red+white;j++){
        nums[j]=1;
       }
        for(int j=red+white;j<red+white+blue;j++){
        nums[j]=2;
       }
        
    }
}