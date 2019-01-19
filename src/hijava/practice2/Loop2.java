package hijava.practice2;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumByfor();
	}

	private static void sumByfor() {
		// TODO Auto-generated method stub
		int total=0;
		for(int i= 0; i<100;i++) {
			System.out.println(i);
			total= total+(i+1);
		}
		System.out.println(total);
	}

	
}
