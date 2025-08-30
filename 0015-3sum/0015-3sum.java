class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

    //    int n = nums.length;
    //    Set<List<Integer>> set = new HashSet<>();
       


    //    for(int i=0;i<n;i++){
    //     List<Integer> ls = new ArrayList<>();
    //     for(int j=i+1;j<n;j++){
    //         int third = -(nums[i]+nums[j]);
    //         if(ls.contains(third)){
    //             List<Integer> list = new ArrayList<>();
    //               list.add(nums[i]);
    //               list.add(nums[j]);
    //               list.add(third);
    //               Collections.sort(list);
    //               set.add(list);
    //         }
    //         else {
    //             ls.add(nums[j]);
    //         }
    //     }
    //    }
          
    //       return new ArrayList(set);

      int n = nums.length;
      List<List<Integer>> set = new ArrayList<>();
      Arrays.sort(nums);
      for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1])
        {
            continue;
        }
        int j=i+1;
        int k=n-1;

        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum<0){
                j++;
            }
            else if(sum>0){
                k--;
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                set.add(list);
                  j++;
                  k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k]==nums[k+1]) k--;
            }
        }
      }
      return set;

    }
}