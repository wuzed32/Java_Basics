package data;

public class DynStack implements IStack {
	private int stack[];
	private int tos;
	
	public DynStack(int size) {
		stack = new int[size];
		tos = -1;
	}
	
	@Override
	public int len() {
		return tos;
	}
	
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if (tos == stack.length - 1) {
			int[] temp = new int[stack.length * 2];
			for (int i = 0; i < stack.length; i++)
				temp[i] = stack[i];
			stack = temp;
			stack[++tos] = item;
		}
		else {
			stack[++tos] = item;
		}
	}

	@Override
	public int pop() {
		if (tos < 0) {
			System.out.println("stack is empty");
			return 0;
		}
		return stack[tos--];
	}

}
