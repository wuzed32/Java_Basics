package threads;

public class UserThread implements Runnable {
	public String name;
	public Thread t;
	
	public UserThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Новый поток: " + t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(this.name + ": " + i);
				Thread.sleep(600);
			}
		}
		catch (InterruptedException e) {
			System.out.println(name + " прерван");
		}
		
		System.out.println(name + " завершен");
	}
}
