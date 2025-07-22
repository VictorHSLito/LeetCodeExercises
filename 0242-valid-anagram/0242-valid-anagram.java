class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character ch: t.toCharArray()) {
            if ((!map.containsKey(ch)) || map.get(ch) == 0) return false;
            map.put(ch, map.get(ch) - 1);
        }
        System.out.println(map);

        return true;
    }
}