package recieve_response_test;

public class Q {
	int n;
	boolean valueSet = false;
	
	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
		System.out.println("Sended: " + n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		while (valueSet) {
			try {
				wait();
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Recieved: " + n);
		this.n = n;
		valueSet = true;
		notify();
	}
}
