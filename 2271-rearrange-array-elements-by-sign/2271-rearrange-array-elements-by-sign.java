class Solution {
    public int[] rearrangeArray(int[] nums) {
       

        int n=nums.length;

         //Brute force
        // List<Integer> arrpos = new ArrayList<>(n/2);
        // List<Integer> arrneg = new ArrayList<>(n/2);
       

        // for(int i=0;i<n;i++){
        //     if (nums[i]<0)
        //     {
        //         arrneg.add(nums[i]);
        //     }
        //     else {
        //         arrpos.add(nums[i]);
        // }}

        // for(int i=0;i<n/2;i++){
        //     nums[2*i]=arrpos.get(i);
        //     nums[2*i+1]=arrneg.get(i);
        // }
       
       //Optimal Solution
    int pos=0;
    int neg=1;
    int arr [] = new int[n];
    for(int i=0;i<n;i++){

         if (nums[i]>0 && pos<n){
           arr[pos]=nums[i];
            pos+=2;
         } 
         if(nums[i]<0 && neg<n) {
          arr[neg]=nums[i];
            neg+=2;
         }

    }
        return arr;
        
    }
  } 