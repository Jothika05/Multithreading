package thread;

import java.math.BigInteger;

public class multithreadfactorial {

	public static void main(String[] args) throws InterruptedException {
		long start=System.currentTimeMillis();
	    int arr[]= {10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};
        MyThread th[]=new MyThread[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
           th[i]=new MyThread(arr[i]);
            th[i].start();
        }
		for(int i=0;i<th.length;i++) 
		{
		 th[i].join();	
		}
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+"!="+th[i].result);
		}	
        System.out.println("time taken: "+(System.currentTimeMillis()-start)/1000.0+ "seconds");

  }
}

class MyThread extends Thread
{
	private int num;
	public BigInteger result;
	public MyThread(int num) {
		this.num=num;
		this.result=BigInteger.valueOf(1);
	}
	public void run()
	{
		for(int i=2;i<=num;i++) {
			this.result=this.result.multiply(BigInteger.valueOf(i));
			}
	}
}
