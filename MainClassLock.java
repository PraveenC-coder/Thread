package Thread;

class resource{
	static void printAlpha() {
		for(char a='a';a<='e';a++) {
			System.out.println((char)a);
		}
	}
	static void printNumber() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
class MyThread extends Thread{
	public void run() {
		synchronized(resource.class) {
			resource.printAlpha();
			resource.printNumber();
		}
	}
}

public class MainClassLock {
	public static void main(String [] args) {
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		
		t1.start();
		t2.start();
	}

}