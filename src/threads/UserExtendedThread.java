package threads;


public class UserExtendedThread extends Thread {
	public UserExtendedThread() {
		super("UserExtendedThread");
		System.out.println("User thread: " + this);
		start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("User thread: " + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Дочерний поток завершен");
	}
}
