package interview;

public class StackSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Stack s1=new Stack();
                Stack s2=new Stack();
                s1.push(1);
                s1.push(3);
                s1.push(2);
                s1.push(5);
                s1.push(4);
              StackSortMain obj=new StackSortMain();
              obj.sort(s1, s2);
              System.out.println(s2.pop());
              System.out.println(s2.pop());
              System.out.println(s2.pop());
              System.out.println(s2.pop());
              System.out.println(s2.pop());
              
	}
	
	public void sort(Stack stack1,Stack stack2){
		int curr=0;
		while(!stack1.isEmpty()){
			curr=stack1.pop();
			if(curr>stack2.returnTop()){
				stack2.push(curr);
			}else{
				while(curr<stack2.returnTop()){
					stack1.push(stack2.pop());
				}
				stack2.push(curr);
			}
		}
	}


}
