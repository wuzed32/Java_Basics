package threads;

public class MyThread implements Runnable {
	public String name;
	public Thread t;
	public boolean suspendFlag;
	
	public MyThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		suspendFlag = false;
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 15; i++) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag)
						wait();
				}
			}
			
		}
		catch (InterruptedException e) {
			System.out.println(name + " interrupted");
		}
		System.out.println(name + " done");
	}
	
	synchronized public void mysuspend() {
		suspendFlag = true;
	}
	
	synchronized public void myresume() {
		suspendFlag = false;
		notify();
	}
	
}
