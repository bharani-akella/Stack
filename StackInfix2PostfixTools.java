package interview;
public class StackInfix2PostfixTools {
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
	
	public int checkPrecedence(char c){
		switch(c){
		
		case '+':
		case '-':
			return 1;
		case '/':
		case '*':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	public void infixToPostfix(String expression){
		String result=new String("");
		for(int i=0;i<expression.length();i++){
			char c=expression.charAt(i);
			if(Character.isLetterOrDigit(c)){
			      result+=c;	
			}else if(c=='+' || c=='-' || c=='/' || c=='*' || c=='^'){
				int precedence=checkPrecedence(c);
				if(precedence>checkPrecedence(returnTop())){
					push(c);
				}
				else{
					while(precedence<=checkPrecedence(returnTop())){
						result=result+pop();	
					}
					push(c);
				}
			}
			
			else if(c=='('){
				push(c);
			}
			
			else if(c==')'){
				while(!isEmpty() && returnTop()!='('){
					pop();
				}if(returnTop()=='('){
					pop();
				}
			}
		}
		while(!isEmpty() && returnTop()!='('){
			result=result+pop();
		}
		System.out.println("PostFix expression is "+result);
	}
}
