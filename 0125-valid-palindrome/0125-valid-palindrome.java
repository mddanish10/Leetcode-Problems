class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       
       int begin=0;
       int end = st.length()-1;

       while(begin < end ){
         
         if (st.charAt(begin)!=st.charAt(end)){
            return false;
         }
         begin++;
         end--;

       }
       return true;

      
    }
}