/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=10;
	    boolean[]primes=new boolean[n+1];
	    Arrays.fill(primes,true);
	    for(int i=2;i<=n;i++)
	    {
	        if(primes[i])
	        {
	        for(int j=i+i;j<=n;j+=i)
	        {
	            primes[j]=false;
	        }
	        
	        }
	    }
	    System.out.println("Prime Numbers in the range of (0,n) are :");
	    for (int k=2;k<primes.length;k++)
	    {
	        if(primes[k])
	        {
	            System.out.println(k);
	        }
	    }
	    
	}
}