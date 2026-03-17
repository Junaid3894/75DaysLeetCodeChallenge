import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Step 1: Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap (based on frequency)
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Step 3: Keep only top k elements
        for(int key : map.keySet()){
            pq.add(key);
            if(pq.size() > k){
                pq.poll(); // remove smallest frequency
            }
        }

        // Step 4: Build result
        int[] res = new int[k];
        for(int i = k - 1; i >= 0; i--){
            res[i] = pq.poll();
        }

        return res;
    }
}