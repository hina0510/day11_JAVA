package inheritance;

class Clac02{
	public void display() {
		System.out.println("계산기");
	}
}
class Computer02 extends Clac02{
	public void print() {
		System.out.println("컴퓨터");
		display();
	}
}


public class MainClass02 {
public static void main(String[] args) {
	//Clac02 c = new Clac02();
	//c.display();
	Computer02 com = new Computer02();
	com.print();
	com.display();
	
}
}
