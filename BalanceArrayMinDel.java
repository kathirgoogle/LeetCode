package balance_Array;
import java.util.*;
public class BalanceArrayMinDel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		System.out.println(minimumDeletions(s));
		
	}
	 public static int minimumDeletions(String s) {
		 s = "aaaabbbabbabbbabab";
	     String temp = s.intern();	int l = temp.length();
	     int i = (int) l/2;	int cnt = 0;
	     CharSequence ch1 = "a"; CharSequence ch2 = "b";
	     System.out.println( temp.length());
		 while( temp.substring(0, i-1).contains(ch2))
		 {	
			temp = temp.replace((String)ch2, "");
			cnt++;	
		 }
		 System.out.println( temp.length());
		 System.out.println( temp );
		 return cnt;
	    }
	
}
