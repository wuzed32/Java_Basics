package data;

interface IStack {
	void push(int item);
	int pop();
	int len();
	default void clear() {
		System.out.println("not impemented");
	}
}
