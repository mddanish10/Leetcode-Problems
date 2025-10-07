class Solution {
    public int splitArray(int[] nums, int k) {

        int low = max(nums);
        int high=sum(nums);

         if (nums.length<k){
            return -1;
        }

        while(low<=high){
            int mid = (low+high)/2;
            int count = split(nums,mid);
            if(count>k){
               
               low=mid+1;
            } else{
             high=mid-1;
            }

        }
        return low;
    }
    public static int max(int[] arr){
        int max=arr[0];
        
        for(int ar:arr){
            if (ar>max){
                max=ar;
            }
        }
        
        return max;
    }
    
    public static int sum(int[] arr){
        int sum=0;
        for(int ar:arr){
           sum+=ar;
        }
        
        return sum;
    }

    public static int split(int[] arr,int s){
        int count=1; int sum=0;

        for(int i =0;i<arr.length;i++){
            if(sum+arr[i]<=s){
                sum+=arr[i];
            }
            else{
                count++;
                sum=arr[i];
            }
        }
        return count;
    }
    
}