package interview;

public class TwoStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               TwoStackArray obj=new TwoStackArray();
               
               obj.push1(10);
               obj.push1(20);
               obj.push1(30);
               obj.push1(40);
               obj.push1(50);
               obj.pop2();
               obj.pop1();
               obj.pop1();
               obj.pop1();
               obj.pop1();
               obj.push2(100);
               obj.push2(200);
               obj.push2(300);
               obj.push2(100);
               obj.pop2();
               obj.pop2();
	}

}
