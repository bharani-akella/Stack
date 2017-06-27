package interview;
import java.util.*;
public class StackToolsArray {
int max;
int top=-1;
int stack[];

public StackToolsArray(int s){
	max=s;
	stack=new int[max];
}

public void push(int x){
	if(top==max){
		System.out.println("Stack Overflow");
		return;
		}
		else{
			stack[++top]=x;
		}
	}

public int pop(){
	if(top<0){
		System.out.println("Stack Underflow");
		return 0;
	}else{
		return stack[--top];
	}
}

public boolean isEmpty(){
	if(top<0){
		return false;
	}else{
		return true;
	}
}

public int peek(){
	if(top<0){
		System.out.println("Stack is empty");
		return 0;
	}else{
		return stack[top];
	}
}

}


