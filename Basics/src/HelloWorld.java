
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		
		System.out.println(((Child)pc).c);
		System.out.println(pc.b);
		pc.fun();
		p.fun();
		c.fun();
	}

}
