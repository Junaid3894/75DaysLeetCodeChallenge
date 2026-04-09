class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int reverseNumber=0;
        if(x<0)
            n*=-1;
        while(n!=0){
            int lastDigit=n%10;
            reverseNumber=reverseNumber*10 +lastDigit;
            n/=10;
        }
        if(x<0){
            String str=reverseNumber + "-";
            String original=String.valueOf(x);
            if(original.equals(str)){
                return true;
            }
            else
                return false;
        }
        if(x>0){
        if(reverseNumber==x)
            return true;
        else
            return false;
        } 
        return true;   
    }
}