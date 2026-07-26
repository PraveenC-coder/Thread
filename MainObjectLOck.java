package Objectlock_Classlock;

class Resource{
	void printNumbers() {
		for(int i =0;i<5;i++) {
			System.out.println(i);
		}
	}
	void printAlpha() {
		for(int a='a';a<'e';a++) {
			System.out.println((char)a);
		}
	}
}
class Mythread implements Runnable{

	Resource res = new Resource();

	@Override
	public void run() {
		
		synchronized(res){
			
			res.printNumbers();
			res.printAlpha();
		}
	}	
}

public class MainObjectLOck {
	public static void main(String [] args) {
		Mythread mt=new Mythread();
		
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		t1.start();
		t2.start();
	}

}
