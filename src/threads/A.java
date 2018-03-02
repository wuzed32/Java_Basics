package threads;

public class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " ����� � ����� A.foo()");
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("A interrupted");
		}
		System.out.println(name + " �������� ������� ����� B.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("� ������ A.last()");
	}
}
