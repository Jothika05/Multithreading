package thread;
class A implements Runnable{

	@Override
	public void run() {
       for(int i=0;i<=10;i++) {
	      System.out.println("Thread A :"+i);
         }
	}
	
}
class B implements Runnable{

	@Override
	public void run() {
       for(int i=0;i<=10;i++) {
	      System.out.println("Thread B :"+i);
         }
	}
	
}
public class threadexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread ob1=new Thread(new A());
     Thread ob2=new Thread(new B());
     ob1.start();
     ob2.start();
	}

}
