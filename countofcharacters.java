import java.util.*;
public class Hello {

    public static void main(String[] args) {
	String str ="Beez Innovation Labs or Beezlabs, is a software prototyping and product development company based out of Chennai, Tamil Nadu, India. Beez Innovation Labs offer Prototype As A Service and Products focusing on Artificial Intelligence, Machine Learning, Robotic Process Automation(RPA) and VR/AR to drive Enterprise Digital Transformation";
	int count=0;
	for(int i=0;i<str.length();i++)
	{
	    if(str.charAt(i)!=' '){
	        count+=1;
	    }
	}
System.out.print("Number of Characters : "+count);
	}
}