package hijava.practice2;

public class Method1 {
	public static void main(String[] args) {
			System.out.println("fn1=" + fn1(123));
			System.out.println("fn1=" + fn1("abc"));
			//System.out.println("fn1=" + fn1(123, "abc"));
		}
		private static String fn1(String str) {
			return str + " is String!!";
		}

		private static String fn1(int i) {
			return i + " is INT!!";
		}
}