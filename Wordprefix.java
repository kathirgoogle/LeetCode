package january;

import java.util.*;
import java.util.regex.*;
public class Wordprefix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"pay","attention","practice","attend","atlast"};
		System.out.println("The no of words are "+ prefixcount( words , "at") );	
	}
	static public int prefixcount(String [] words, String prefix)
	{	 
		int cnt = 0,i=0,j=0;
		int len = words.length;
		
		String temp = "at";
		String words1[] = new String[5];
		prefix = "^["+ temp +"].*";
		String str = String.join(" ", words);
		String words2 = Arrays.toString(words);
		System.out.println(words2);
		while(i != len ) {
		Pattern p = Pattern.compile(prefix);
		Matcher M = p.matcher(words1[i]);
		
		if( M.matches())
		{
		 words1[j] = words[i];
		 System.out.println(words1[j]);
		 cnt++;
		}
		j++;i++;
		}
		
		return cnt;
	}
}
