import java.util.Arrays;

class OddEvenSort {
    public void sortIt(Long arr[]) {
        
        int n = arr.length;

        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]%2!=0)
            {
                long temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        Arrays.sort(arr,0,i,(a,b)->Long.compare(b,a));
        Arrays.sort(arr,i,n,(a,b)->Long.compare(a,b));
        
    }
}
  //  public static void sort(Long[]arr,int s,int e)
    // {
    //     int l=s;
    //     int h=e;
    //     while(l<=h)
    //     {
    //      int mid=l+(h-l)/2;
    //      while(arr[l]<arr[mid])
    //      {
    //          l++;
    //      }
    //       while(arr[mid]<arr[h])
    //      {
    //          h--;
    //      }
    //      if(s<=e)
    //      {
    //          long temp=arr[l];
    //          arr[l]=arr[h];
    //          arr[h]=temp;
    //      }
    //     }
    //     sort(arr,s,h);
    //     sort(arr,h,e);
    // }
//}
