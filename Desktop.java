package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("Size of the desktop");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop des = new Desktop();
		des.computerModel();
		des.desktopSize();
	}

}
