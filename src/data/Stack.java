package data;

public class Stack implements IStack {
	private int stack[];
	private int tos;
	
	public Stack(int size) {
		stack = new int[size];
		tos = -1;
	}
	
	@Override
	public void push(int item) {
		if (tos == stack.length - 1)
			System.out.println("stack overflow");
		else
			stack[++tos] = item;
	}
	
	@Override
	public int pop() {
		if (tos < 0) {
			System.out.println("stack is empty");
			return 0;
		}
		return stack[tos--];
	}
	
	@Override
	public int len() {
		return stack.length;
	}
}
