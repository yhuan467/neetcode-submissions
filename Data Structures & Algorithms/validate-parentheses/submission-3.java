class Solution {
    public boolean isValid(String s) {
        //配對的一定要是偶數
        if((s.length()%2)!=0){
            return false;
        }
        //檢查有沒有配對起來
        //從一半開始
        int half = s.length()/2;
        for(int i=half; i<s.length; i++){
            if(s.CharAt(i) == ')'){
                if(s.CharAt(i-1)!= '('){
                    return false;
                }
            }
            else if(s.CharAt(i) == '}'){
                if(s.CharAt(i-1)!= '{'){
                    return false;
                }
            }
            else if(s.CharAt(i) == ']'){
                if(s.CharAt(i-1)!= '['){
                    return false;
                }
            }
        }
        return true;
    }
}
