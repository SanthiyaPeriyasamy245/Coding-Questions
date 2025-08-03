class ThirdMax {
    int thirdLargest(int arr[]) {

        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        int third_max=Integer.MIN_VALUE;
        
        for(int x:arr)
        {
            if(x>max)
            {
                third_max=second_max;
                second_max=max;
                max=x;
            }
            else if(x<=max && x>second_max)
            {
                third_max=second_max;
                second_max=x;
            }
            else if(x<=second_max && x>third_max)
            {
                third_max=x;
            }
    }
    return third_max;
    }
}