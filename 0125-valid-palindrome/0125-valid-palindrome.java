class Solution {

    public boolean isPalindrome(String s) {
        //instead of convert the whole string 
        int left =0;
        int right = s.length()-1;
        
         while(left< right){
            
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //make sure that the left and right are letter or digit and then convert to lower case and check!!!
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) ){
                return false;
            }
            left ++;
            right--;
        }

return true;


       /*
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int left =0;
        int right = s.length()-1;

        
         while(left< right){
            if(s.charAt(left) != s.charAt(right) ){
                return false;
            }
            left ++;
            right--;
        }

        return true;*/
    }
}