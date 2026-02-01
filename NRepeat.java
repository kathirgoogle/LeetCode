package january;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class NRepeat {
	private static IntStream list12;
	public static void main(String args[])
	{	 int result = repeatedNTimes(new int[] {1,2,3,4,4,5,5,5});
		 System.out.println(" result is "+result );
	}
	 public static int repeatedNTimes(int[] nums) {
	        int [] num = nums.clone();
	        Object repeated_num = 0;
	         List <Integer>list1 = new ArrayList<>(Arrays.asList(num));  	 
	         Set <Integer> list2 =  (Set<Integer>)list1.stream()
	        		 .filter (j -> Collections.frequency(list1, new Integer(4))> 0)
	        		      .collect(Collectors.toSet());
	         
	         System.out.println();
	        list2.forEach(i -> System.out.println(i));
	        
	         //System.out.println(list2.size());
	         //repeated_num = (int) list2.get(0);
	        return (int) repeated_num;
	 }
	 
	
}
