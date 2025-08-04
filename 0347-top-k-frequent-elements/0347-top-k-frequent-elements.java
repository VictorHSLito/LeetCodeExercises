class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map.toString());

        List<int[]> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            list.add(new int[] {entry.getValue(), entry.getKey()});
        }

        list.sort((a,b) -> b[0] - a[0]);
        
        int[] res = new int[k];

        for(int i = 0; i < res.length; i++) {
            res[i] = list.get(i)[1];
        }

        return res;
    }
}