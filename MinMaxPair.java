package january;
import java.util.*;
import java.util.stream.Collectors;
public class MinMaxPair {

public static int minPairSum(int[] nums ) {
       int [] num = nums.clone();
       int len = num.length;
       int j=0,k=0,s=0; k = len/2 ;
       List  list1 = Arrays.stream(num).boxed()
    		   		.sorted(Comparator.naturalOrder()).collect(Collectors.toList());
       
    	    
       return 0;	
}
	
}

