package Multithread;
class abc implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++) {
		System.out.println("update");
	try {
		Thread.sleep(1000);
	   } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
}
}
class def extends Thread  {
	public void run(){
		for(int i=1;i<=5;i++) {
			System.out.println("DB");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=new abc();
		Thread t=new Thread(r);
		//Thread t=new Thread(new abc());
		t.start();
		t.join();
		def d=new def();
		d.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread");
		}
	}


}
