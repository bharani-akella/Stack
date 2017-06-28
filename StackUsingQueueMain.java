package interview;

public class StackUsingQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Queue q1=new Queue();
            Queue q2=new Queue();
            StackUsingQueueMain obj=new StackUsingQueueMain();
            obj.push(q1, q2, 10);
            obj.push(q1, q2, 20);
            obj.push(q1, q2, 30);
            obj.push(q1, q2, 40);
            obj.pop(q1, q2);
            obj.pop(q1, q2);
            obj.pop(q1, q2);
            obj.pop(q1, q2);
            obj.pop(q1, q2);
	}

	public void push(Queue queue1,Queue queue2,int x){
		if(queue1.isEmpty()){
			queue2.enqueue(x);
			System.out.println(x+" is pushed into the stack");
		}else{
			queue1.enqueue(x);
			System.out.println(x+" is pushed into the stack");
		}
	}
	
	public int pop(Queue queue1,Queue queue2){
		if(queue1.isEmpty()){
			if(queue2.isEmpty()){
				System.out.println("Stack Underflow");
				return 0;
			}else{
				while(queue2.returnFront()!=queue2.returnRear()){
					queue1.enqueue(queue2.dequeue());
				}
				System.out.println(queue2.returnRear()+" is popped");
				int x= queue2.returnRear();
				queue2.dequeue();
				return x;
			}
		}else{
			while(queue1.returnFront()!=queue1.returnRear()){
				queue2.enqueue(queue1.dequeue());
			}
			System.out.println(queue1.returnRear()+" is popped");
			int x= queue1.returnRear();
			queue1.dequeue();
			return x;
		}
	}
}
