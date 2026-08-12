

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;  // 长度都不一样，不可能是anagram
        }

        List<Character> tList = new ArrayList<>();
        for (char c : t.toCharArray()) {
            tList.add(c);
        }

        for (char c : s.toCharArray()) {
            if (tList.contains(c)) {
                tList.remove(Character.valueOf(c));  // 注意这里！
            } else {
                return false;
            }
        }

        return true;
    }
}
