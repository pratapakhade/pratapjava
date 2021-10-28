package com.java.lambda;

/*interface dr1{
	
	public void draw();
}*/
interface dr2 {

	int add(int x, int y);
}

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int width = 10; dr1 d = () -> { System.out.println("width " +width); };
		 * d.draw(); }
		 */
		dr2 add1 = (x, y) -> x + y;
		System.out.println(add1.add(20, 30));
	}
}
