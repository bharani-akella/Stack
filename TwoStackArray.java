package interview;

public class TwoStackArray {
int capacity=6;
int max_size1=3;
int size1=0;
int max_size2=6;
int size2=3;
int top1=-1;
int top2=2;
int s[]=new int[capacity];

public void push1(int x){
   if(size1==max_size1){
	   System.out.println("Stack Overflow");
	   return;
   }
	s[++top1]=x;
	System.out.println(s[top1]+ " pushed into stack1");
   size1=size1+1;
}

public int pop1(){
	if(size1==0){
		System.out.println("Stack1 Underflow");
		return 0;
	}
	int x=s[top1];
	System.out.println(x+" popped from stack1");
	top1--;
	size1=size1-1;
	return x;
}

public void push2(int x){
	   if(size2==max_size2){
		   System.out.println("Stack2 Overflow");
		   return;
	   }
		s[++top2]=x;
		System.out.println(s[top2]+ " pushed into stack1");
	   size2=size2+1;
	}

public int pop2(){
	if(size2==3){
		System.out.println("Stack2 Underflow");
		return 0;
	}
	int x=s[top2];
	System.out.println(x+" popped from stack2");
	top2--;
	size2=size2-1;
	return x;
}

}
