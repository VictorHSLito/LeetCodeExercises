class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        int quantity = nums.length/3;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer key: map.keySet()) {
            if (map.get(key) > quantity) {
                answer.add(key);
            }
        }

        return answer;
    }
}