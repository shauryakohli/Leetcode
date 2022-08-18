class Solution {
    public int minSetSize(int[] arr) {
      HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);

        int[] frequencies = new int[map.values().size()];
        int i = 0;
        for (int freq : map.values()) frequencies[i ++] = freq;
        Arrays.sort(frequencies);

        int ans = 0, removed = 0, half = arr.length / 2;
        i = frequencies.length - 1;
        while (removed < half) {
            ans += 1;
            removed += frequencies[i --];
        }
        return ans;   
    }
}