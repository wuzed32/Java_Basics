package threads;

public class Caller implements Runnable {
	public String msg;
	public Callme target;
	public Thread t;
	
	public Caller(Callme target, String s) {
		this.target = target;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// target.call(msg);
		synchronized(target) {
			target.call(msg);
		}
	}

}
