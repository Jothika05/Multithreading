package thread;

	class one extends Thread{
		public void run() {
	       for(int i=0;i<=10;i++) {
		      System.out.println("Thread A :"+i);
	         }
		}
		
	}
	class two extends Thread{
		public void run() {
	       for(int i=0;i<=10;i++) {
		      System.out.println("Thread B :"+i);
	         }
		}
		
	}
	public class threadexample2 {
           
		public static void main(String[] args) {
	    one ob1=new one();
	    two ob2=new two();
	     ob1.start();
	     ob2.start();
		}

	}

