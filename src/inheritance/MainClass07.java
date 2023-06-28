package inheritance;

class Test07{
	protected int num;//protected는 자신과 같은 패키지 내에서는 허용. private와 public 사이
	public void test() {
		System.out.println("부모 test");
	}
}
class TestClass07 extends Test07{
	public void display() {
		num = 100;
		System.out.println("display 실행");
		test(); //자기자신에 있는 메소드 먼저 실행
	}
	public void test() {
		System.out.println("자식 test");
	}
}

public class MainClass07 {
public static void main(String[] args) {
	TestClass07 t = new TestClass07();
	t.display();
}
}
