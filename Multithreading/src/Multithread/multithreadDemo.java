package Multithread;
class multithread extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}
}
class  multithread2 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("how are you");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
public class multithreadDemo{
	public static void main(String[] args) throws InterruptedException {
		 multithread  m=new  multithread();
		 multithread2 m1=new  multithread2();
		 m.start();
		// m.join();
		 for(int i=1;i<=5;i++) {
				System.out.println("main thread");
			}
		 m.join();
		 m1.start();
	
	
	}
}