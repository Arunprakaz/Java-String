package STRING_sample;

public class palindrome {

	  public static void main(String[] args)
	    {
	        String str="arun";
	        int i = 14321;
	        
	        checkpali(i);
//	     String reverse="";
//	        for(int i=str.length()-1;i<=0;i--)
//	        {
//	            reverse=reverse+str.charAt(i);
//	            
//	        }
//	        
//	        if(reverse.equals(str))
//	        {
//	            System.out.println("this is palindrome");
//	        }
//	         else{
//	            System.out.println("this is  not palindrome");
//	        }
	    }
	    
	    

public static void checkpali(int i) {
	
int num= i ,digit =0,sum=0;
while(num !=0)
{
digit = num%10;
sum=(sum*10)+digit;
num=num/10;
}

if(sum==i)
{
System.out.println("this is palindrome");
}
else
{
System.out.println("this is not palindrome");
}
}
	        
	
}
