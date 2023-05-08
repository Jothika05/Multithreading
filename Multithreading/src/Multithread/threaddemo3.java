package Multithread;
class  Factors{
	synchronized public void printnum(int n) {
		for(int i=1;i<=10;i++) {
			if(n%i==0) {
				System.out.println("factor of  "+ n +"  is  "+ i);
			}
		}
	}
}
public class threaddemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factors f=new Factors ();
		
		Thread t=new Thread() {
			public void run() {
				f.printnum(10);
			}
		};
		Thread t1=new Thread() {
			public void run() {
				f.printnum(4);
			}
		};
	t.start();
	t1.start();	
		
		
	}
}
