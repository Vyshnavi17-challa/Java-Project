package cscorner;

class Car1 implements  Runnable {
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(" BMW Car moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
class Bike1 implements Runnable {
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(" ninja Bike is moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
	
}
public class InterfaceRace {

	public static void main(String[] args) {
		Thread caThread= new Thread(new Car1());
		Thread baThread= new Thread(new Bike1());
		System.out.println("Goo");
		caThread.start();
		baThread.start();
		

	}

}
