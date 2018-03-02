package threads;

public class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " вошел в метод A.foo()");
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("A interrupted");
		}
		System.out.println(name + " пытается вызвать метод B.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("в методе A.last()");
	}
}
