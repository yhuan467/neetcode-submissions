class Solution {
    public boolean isPalindrome(String s) {
        //for loop 比較頭尾
        //注意大小寫
        // 題目說了：ignores all non-alphanumeric characters..
        
        // 方案A:regex一行解決
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int n = s.length();

        for(int i=0;i<n; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }
}
