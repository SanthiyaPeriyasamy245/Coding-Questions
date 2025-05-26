import java.util.*;

/*

n=5
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

logic : 2+(n-1)=6,3+(n-1)=7,7+(n-2)=10,....and so on.

1(1,1)
2(2,1) 6(2,2) 
3(3,1) 7(3,2) 10(3,3)
4(4,1) 8(4,2) 11(4,3) 13(4,4)
5(5,1) 9(5,2) 12(5,3) 14(5,4) 15(5,5)

*/

public class Pattern {


	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ? ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp+" ");
				temp+=n-j;	
			}
			System.out.println();
		}
       sc.close();
	}

}
