package client;

import program.Program;

public class Client implements ICallback {

	@Override
	public void callback(int param) {
		Program.print("����� callback(), ���������� �� ���������: " + param);
	}
	
	
	void display() {
		Program.print("lol");
	}

}
