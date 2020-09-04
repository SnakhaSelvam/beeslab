import java.util.*;
public class Hello {

    public static void main(String[] args) {
		System.out.println("Enter x and y");  
        Scanner sc = new Scanner(System.in);  
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("Before swapping");  
        System.out.println("x= "+x);  
        System.out.println("y= "+y);  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping without a third variable");
        System.out.println("x= "+x);  
        System.out.println("y= "+y);

	}
}