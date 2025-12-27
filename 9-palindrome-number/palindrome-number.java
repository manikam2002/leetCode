class Solution {
    public boolean isPalindrome(int x) {
        int temp=x; //121
        int ret=0;

        while(x>0){
            int dig=x%10;  //121%10=1
            ret=(ret*10)+dig;//0=(0*10)+1 =1
            x=x/10;  //121/10=12
        }
            if(ret==temp){
                return true;

            }
            return false;

        }
    }
