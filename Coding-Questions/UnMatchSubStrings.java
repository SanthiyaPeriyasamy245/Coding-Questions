import java.util.*;

/*
Unmatched Substrings
Given two strings of equal length, find and print all the substrings where the characters at the same positions in both strings are different. The output should display the mismatched substrings from both strings.

Example Input: schoollifeisusefull, schoollongofuselike
Example Output:
ifeis , ongof
full , like
 
 
 */


public class UnMatchSubStrings {

	public static void main(String[] args) {
		
		String str1="schoollifeisusefull";
		String str2="schoollongofuselike";
		
		String s1="";
		String s2="";
		ArrayList<String>answer=new ArrayList<>();
		int i=0; 
		int j=0;
		while(i<str1.length() && j<str2.length())
		{
			
			if(str1.charAt(i)!=str2.charAt(j))
			{
				s1+=str1.charAt(i);
				s2+=str2.charAt(j);
				
			}
			else if(!(s1.isEmpty() && s2.isEmpty()))
			{
				
				answer.add(s1);
				answer.add(s2);
				s1="";
				s2="";
			}
			i++;
			j++;
			
		}
		if(!(s1.isEmpty() && s2.isEmpty()))
		{
			
			answer.add(s1);
			answer.add(s2);
		}
		
		System.out.println(answer);
		

	}
	

}
