class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // if the elements in the nums is equal to k means return array as it is.
        if(k==nums.length)
        {           
             return nums;
        }
        // store values and it's frequency.
        Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        //queue which stores the value which occurs most frequently.
        Queue<Integer>heap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b)); 
        // The elements should be stored in the ascending order based on  it's occurence .
        for(int n:map.keySet())
        {
            heap.add(n);
            if(heap.size()>k)
            {
              heap.poll(); // whenever queue goes over the limit of k the first element will be removed.
            }

        }

 /*You count frequencies of all elements → O(n)

You go through each unique element and:

Add to a min-heap (priority queue), which takes O(log k) time per element

You only keep k elements in the heap the whole time.*/


        int[]ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=heap.poll();
        }
        return ans;
    }
}