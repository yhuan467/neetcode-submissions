class Solution {
    public boolean isPalindrome(String s) {
        //for loop 比較頭尾
        //注意不要管大小寫
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i) != s.charAt(n-i)){
                return False;
            }
        }
        return True;
    }
}
