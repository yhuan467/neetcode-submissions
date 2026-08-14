class Solution {
    public boolean isValid(String s) {
        //配對的一定要是偶數
        if((s.length()%2)!=0){
            return false;
        }
        //檢查有沒有配對起來
        //從一半開始
        int n = s.length();
        int half = n/2;
        for(int i=half; i<n; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(n-i)!= '('){
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(s.charAt(n-i)!= '{'){
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                if(s.charAt(n-i)!= '['){
                    return false;
                }
            }
        }
        return true;
    }
}
