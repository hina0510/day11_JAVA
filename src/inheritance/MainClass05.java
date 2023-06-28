package inheritance;

class Test05{
	public Test05(String s) {
		System.out.println(s+"부모 생성자 실행");
	}
	public Test05() {
		System.out.println("default 생성자 실행");
	}
}
class TestClass05 extends Test05{
	public TestClass05() {
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass05 {
public static void main(String[] args) {
	TestClass05 t = new TestClass05();
	
}
}
