package interview;
public class StackReverse {
	Node head;
	Node top;

	public void push(char x){
		Node n1=new Node(x);
		if(head==null){
			head=n1;
			top=head;
			System.out.println("Element pushed is "+top.data);
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=n1;
		top=n1;
		System.out.println("Element pushed is "+top.data);
	}
	
	public char pop(){
		if(head==null){
			System.out.println("Stack underflow");
			return 0;
		}
		Node prev=null;
		Node temp=head;
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}if(prev!=null){
			prev.next=null;
			top=prev;
			System.out.println("Element popped is "+temp.data);
			return temp.data;
		}else{
			top=temp;
			temp=null;
			head=null;
			System.out.println("Element popped is "+top.data);
			return top.data;
		}	
	}
	
	public char returnTop(){
		if(head==null){
			System.out.println("The stack is empty!");
			return 0;
		}
		System.out.println("The top element is "+top.data);
		return top.data;
		
	}
	
	public boolean isEmpty(){
		if(head==null){
			System.out.println("Stack is empty");
			return true;
		}else{
			return false;
		}
	}
	
	public void revere(String s){
		String reverseString=new String("");
		for(int i=0;i<s.length();i++){
			push(s.charAt(i));
		}
		
		while(!isEmpty()){
			reverseString=reverseString+pop();
		}
		System.out.println("The reversed string is "+reverseString);
	}
	
}
