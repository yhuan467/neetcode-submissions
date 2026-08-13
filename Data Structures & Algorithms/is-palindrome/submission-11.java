class Solution {
    public boolean isPalindrome(String s) {
        //for loop 比較頭尾
        //注意大小寫
        // 題目說了：ignores all non-alphanumeric characters..
        int n = s.length();
        
        for(int i=0;i<n; i++){
            //移除所有空格跟標點符號
            if(s.charAt(i) == (' ' | '?')){
                s.remove.charAt(i);
            }
        }

        //to lowercase
        s = s.toLowerCase;
        n = s.length();

        for(int i=0;i<n; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
