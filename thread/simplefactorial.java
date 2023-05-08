package thread;

import java.math.BigInteger;

public class simplefactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long start=System.currentTimeMillis();
    int arr[]= {10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]+"!="+calculate(arr[i]));
    }
    System.out.println("time taken: "+(System.currentTimeMillis()-start)/1000.0+ "seconds");
	}

	public static BigInteger calculate(int n) {
		BigInteger bi=BigInteger.valueOf(1);
		for(int i=2;i<=n;i++) {
			bi=bi.multiply(BigInteger.valueOf(i));
			}
		return bi;
	}

}
