import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the start range: ");
	int start = sc.nextInt();
	System.out.println("Enter the end range:");
	int end = sc.nextInt();
	    int count=0;
	for(int i =start;i<=end;i++)
	{
	    String num =i+"";
	    if(num.charAt(0)=='1')
	    {
	        count++;
	    }
	 
	}
System.out.println("The number of ones present from "+start+" to "+end+" is "+count+" one's.");
		

	}
}