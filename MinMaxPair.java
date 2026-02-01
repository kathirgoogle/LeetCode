package january;
import java.util.*;
import java.util.stream.Collectors;
public class MinMaxPair {

public static int minPairSum(int[] nums, Integer obj) {
       int [] num = nums.clone();
       int len = num.length;
       int j=0,k=0,s=0; k = len/2 ;
       List  list1 = Arrays.stream(num).boxed()
    		   		.sorted(Comparator.naturalOrder()).collect(Collectors.toList());
       List list2 = list1.stream().map(	i-> {  } );
    	    
       return 0;	
}
	
}
