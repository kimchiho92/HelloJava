package hijava.practice;

//���� �ΰ��� �ָ�, �ΰ��� ���� ���� ġȯ�ϴ� swap() �Լ��� �ۼ��Ͻÿ�.
public class Swap {
	int x = 10;
	int y = 100;

	public static void main(String[] args) {
		Swap sw = new Swap();

		System.out.println("x=" + sw.y);
		System.out.println("y=" + sw.x);
		System.out.println("==================");
		sw.sw1();
		System.out.println("x=" + sw.y);
		System.out.println("y=" + sw.x);
	}

	public void sw1() {
		int c= x;
//		int b= y;= 
		x=y;
		y=c;
	}
}