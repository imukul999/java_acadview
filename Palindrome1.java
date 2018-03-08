package mukul;

public class Palindrome1 {
      public static void main(String[]arg) {
    	   int num,temp,rev=0,rem=0;
    	   num=12121;
    	   temp=num;
    	   while(temp/10>=1)
    	   {
    		   rem=temp%10;
    		   rev=(rev*10)+rem;
    		   temp=temp/10;
    		   
    	   }
    			rev=(rev*10)+temp;
    			if(rev==num)
    				System.out.println("the number is palandrome");
    				else
    					System.out.print("the number is not a palandrome");
      }
     
}
