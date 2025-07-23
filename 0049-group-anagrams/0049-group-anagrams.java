class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word: strs) {
            String sortedWord = sortString(word);
            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        return convertToList(map);
    }


    private String sortString(String word) {
        char[] characters = word.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }


    private List<List<String>> convertToList(HashMap<String, List<String>> map) {
        List<List<String>> result = new ArrayList<>();

        for (List<String> values: map.values()) {
            result.add(values);
        }

        return result;
    }
}