package day11;

class TestClass03{
	static TestClass03 t;//test메서드에서 static 으로 객체 생성하기 때문에 static 필요함
	private TestClass03() {
		System.out.println("생성자 실행");
	}
	public static TestClass03 getInstance() {
		System.out.println("test 실행");
		if(t==null) {
			t = new TestClass03();
		}return t;
	}
}

public class MainClass03 {
public static void main(String[] args) {
	TestClass03 t01 = TestClass03.getInstance(); 
	TestClass03 t02 = TestClass03.getInstance(); 
	TestClass03 t03 = TestClass03.getInstance(); 
	System.out.println(t01);
	System.out.println(t02);
	System.out.println(t03);
	//생성자가 private일 경우 new로 객체 생성 불가, 다른 메서드를 통해 객체 생성
	
	
}
}
