class DailyTemperatures {
/*space complexity : O(n) ,Time Complexity : O(n) */
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer>stack=new Stack<>();
        int idx=0;
        int[]answer=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
            {
                idx=stack.pop();
                answer[idx]=i-idx;
            }
            stack.push(i);
        }
        return answer;
    }
}