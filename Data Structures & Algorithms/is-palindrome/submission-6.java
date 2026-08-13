class Solution {
    public boolean isPalindrome(String s) {
        //for loop 比較頭尾
        //注意大小寫 還要考慮到空格跟其他符號（問號可以省略）
        int n = s.length();
        if(s.charAt(n)== "?"){
            n = n-1;
        }
        for(int i=0;i<n; i++){
            if(s.charAt(i) != s.charAt(n-1)){
                return false;
            }
        }
        return true;
    }
}
