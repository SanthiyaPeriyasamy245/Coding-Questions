class TopKfrequentElements {
    public List<String> topKFrequent(String[] words, int k) {
        
 
        Map<String ,Integer>map=new HashMap<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
    Queue<String>ans=new PriorityQueue<>((a,b)->{
    int diff=map.get(a)-map.get(b);
    if(diff==0)
    {
        return b.compareTo(a);
    }
    return diff;
    });
        for(String Keys:map.keySet())
        {
            ans.add(Keys);

            if(ans.size()>k)
            {
                ans.poll();
            }
            
           
        }

        List<String>answer=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            String str=ans.poll();
            answer.add(str);
        }
      Collections.reverse(answer);
        return answer;

    }
}