class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character , Integer> S = new HashMap<> ();
        HashMap <Character , Integer> T = new HashMap<> ();

        if(s.length() != t.length()){
            return false;
        }

        int l = s.length();

        for(int i=0; i< l; i++){
            S.put(s.charAt(i),S.getOrDefault(s.charAt(i),0)+1);
            T.put(t.charAt(i),T.getOrDefault(t.charAt(i),0)+1);
        }

        return S.equals(T);
    }
}
