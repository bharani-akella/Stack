package interview;

public class StackToolsLink {
Node head;
Node top=null;

public void push(int x){
	
Node n1=new Node(x);
	if(head==null){
	head=n1;
	top=head;
	System.out.println("Element inserted is "+top.data);
	return;
}	
Node temp=head;
while(temp.next!=null){
	temp=temp.next;
}
temp.next=n1;
top=n1;
System.out.println("Element inserted is "+top.data);
}

public int pop(){
	if(head==null){
		System.out.println("Stack Underflow");
		return 0;
	}
	Node temp=head;
	Node prev=null;
	while(temp.next!=null){
		prev=temp;
		temp=temp.next;
	}if(prev!=null){
		prev.next=null;
		top=prev;
		System.out.println("Element popped is "+temp.data);
		return temp.data;	
	}else{
		head=null;
		System.out.println("Element popped is "+temp.data);
		return temp.data;
	}
	
}

public int peek(){
	if(head!=null){
		return top.data;
	}else{
		System.out.println("Stack is empty");
		return 0;
	}
}

}
