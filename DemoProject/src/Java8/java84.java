package Java8;


import java.util.*;

public class java84 {


	 

	   public static void main(String[] args) {
	         
	         ArrayList<Integer> list = new ArrayList() ;
	        
	         
	            list.add(10);
	            list.add(20);
	            list.add(30);
	            list.add(40);
	            list.add(50);
	            
	            System.out.println( list.stream().mapToInt(i -> i).sum());
	    }
	}