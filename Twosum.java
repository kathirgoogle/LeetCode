package leetcode;

import java.util.*;
public class Twosum {

	public Twosum() {
		// TODO Auto-generated constructor stub
		// program to get user input and break with specific input
		}

	 public int[] twoSum(int[] nums, int target) {
	        int [] arr= {};
	        return arr;
	    }
	    public static void main(String args[])
	    {
	        int[] nums= new int[10];
	        
	        final int max_len = 50;
	        int length1 = nums.length,i=0,t=0;String s;
	        char eof;
	        System.out.println("Enter the source array elements");
	        Scanner in = new Scanner(System.in);
	        Boolean flag = false;
	        do {
	    	   s= in.nextLine();
	    	    	    		   
	    	   try {
	    	   t = Integer.parseInt(s);
	    	   nums[i] = t;
	    	   } catch(NumberFormatException Exc) {
	    		 	    		 
	    		   if(s.isBlank() )	break ;
		    	  
	    	   }
	    	   	                                                                                                                                                                                                                                                              	  
	    	   i++;
	    	  // System.out.println(i);
	    	  
	       }while( !(s.equals("q")));
	        
	        
	        System.out.println("Input is over");
	        
	        
	        // sort the array in increasing order
	        for(i=0;i < nums.length;i++)
	        	for(int j=i;j<length1;j++)
	        	{
	        		if(nums[i] > nums[j])
	        		{
	        			t = nums[i];
	        			nums[i] = nums[j];
	        			nums[j] = t;
	        		}
	        		
	        	}
	        System.out.println("Enter the sum");
	        int sum = in.nextInt();
	        int key;
	        boolean possible = false ,over=false;
	        for( i=0;i<length1;i++)
	        {
	        	if(sum < nums[i])
	        		break;
	        }
	        int last =  i-1,front=0,back=i;
	        int center = (front + back)/2; 
	        while( !(back == front) && front < center/2 && back < center/2 )
	        {
	        	int k=nums[front] + nums[back];
	        	
	        	 if(k == sum)  { possible = true; over = true;}
	        	 else if (k >sum){ 	back--;		  }
	        	 else { front++; }        
	        }
	        if(possible == true) System.out.println("Elements add to provide the Sum");
	    // main loop end
	        }
}
