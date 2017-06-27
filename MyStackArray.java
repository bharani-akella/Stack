package interview;
import java.util.*;
public class MyStackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of stack");
		StackToolsArray obj=new StackToolsArray(scan.nextInt());
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		
		System.out.println(obj.peek());
		
	}

}
