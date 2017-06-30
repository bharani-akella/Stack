package interview;

public class StackMax {
Node head;
Node top;	
public void push(int x){
	Node n1=new Node(x);
	if(head==null){
		head=n1;
		top=head;
		System.out.println(top.data+" has been pushed");
	return;
	}
	Node temp=head;
	while(temp.next!=null){
		temp=temp.next;
	}
	temp.next=n1;
	top=n1;
	System.out.println(top.data+" has been pushed");
	if(top.max<temp.max){
		top.max=temp.max;
	}
}

public int pop(){
	if(head==null){
		System.out.println("Stack is empty");
		return 0;
	}
	Node temp=head;
	Node prev=null;
	while(temp.next!=null){
		prev=temp;
		temp=temp.next;
	}
	if(prev!=null){
		int x=temp.data;
		System.out.println(x+" has been popped!");
		prev.next=null;
		top=prev;
		return x;
	}else{
		int x=temp.data;
		System.out.println(x+" has been popped!");
		top=prev;
		return x;
	}
}

public int max(){
	if(head==null){
		System.out.println("Stack is empty!");
		return 0;
	}
	System.out.println("The maximum value is "+top.max);
	return top.max;
}

}

