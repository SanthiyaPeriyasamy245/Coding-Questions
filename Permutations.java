import java.util.*;


public class Permutations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.next();
		permutations("",word);
		System.out.println(permutationslist("",word));
		Set<String>set=new HashSet<>();
		permutationsuniquelist("",word,set);
		System.out.println(set);
		sc.close();

	}

	private static void permutations(String string, String word) {
		
		if(word.isEmpty())
		{
			System.out.println(string);
			return ;
		}
	
		char ch=word.charAt(0);
		for(int i=0;i<=string.length();i++)
		{
			String f=string.substring(0,i);
			String s=string.substring(i,string.length());
			permutations(f+ch+s,word.substring(1));
			
		}
	}
		
private static ArrayList<String> permutationslist(String string, String word) {
		
		if(word.isEmpty())
		{
			ArrayList<String>ans=new ArrayList<>();
			ans.add(string);
			return ans;
		}
		ArrayList<String>answer=new ArrayList<>();
		char ch=word.charAt(0);
		for(int i=0;i<=string.length();i++)
		{
			String f=string.substring(0,i);
			String s=string.substring(i,string.length());
			answer.addAll(permutationslist(f+ch+s,word.substring(1)));	
			
		}
		return answer;
	}
// to get unique permutations without repetition
private static void permutationsuniquelist(String string, String word,Set<String>set) {
	
	if(word.isEmpty())
	{
		
		set.add(string);
		return ;
	}

	char ch=word.charAt(0);
	for(int i=0;i<=string.length();i++)
	{
		String f=string.substring(0,i);
		String s=string.substring(i,string.length());
		permutationsuniquelist(f+ch+s,word.substring(1),set);	
	}
	
}


}
