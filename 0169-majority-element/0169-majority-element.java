class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int res=0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
             Integer key = entry.getKey();
             Integer count = entry.getValue();
            if (count>n/2){
                res=key;
                break;
            }
        }

        return res;
    }
}