class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i: nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
        new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()> k){
                minHeap.poll();
            }
        }


        int[] result = new int[k];
        int i =0;
        while(!minHeap.isEmpty()){
            result[i++] = minHeap.poll().getKey();
        }
        return result;
    }
}
