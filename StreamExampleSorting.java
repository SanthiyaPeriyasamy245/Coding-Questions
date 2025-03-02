import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleSorting {

	public static void main(String[] args) {
		
		Long [] arr = {1l,2l,3l,4l,5l,6l,7l,8l};
		
		sorted(arr);
		System.out.print(Arrays.toString(arr));
	}

	private static void sorted(Long[]arr) {
		
			List<Long>even=new ArrayList<Long>(Arrays.stream(arr).filter(x->x%2==0).toList());
			
			List<Long>odd=new ArrayList<Long>(Arrays.stream(arr).filter(x->x%2==1).toList());
			
			Collections.sort(even);
		
			Collections.sort(odd,Collections.reverseOrder());

			int i=0;
			int j=0;
			while(i<odd.size())
			{
				arr[j]=odd.get(i);
				i++;
				j++;
			}
			int k=0;
			while(k<even.size())
			{
				arr[j]=even.get(k);
				k++;
				j++;
			}
		
	}
}
