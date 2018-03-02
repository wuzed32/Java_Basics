package threads;

public class Deadlock implements Runnable {
	A a = new A();
	B b = new B();
	
	public Deadlock() {
		Thread.currentThread().setName("Main thread");
		Thread t = new Thread(this, "Соперничающий поток");
		t.start();
		a.foo(b);
		System.out.println("Back to main thread");
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.bar(a);
		System.out.println("Back to another thread");
		
	}

}
