package hijava.practice3;

public class Alpha {
	public static void main (String []args) {
		ex6();
		

		
	}

	private static void ex6() {
		int upperStart=  65;
		int lowerStart= 97;
		
		for(int i= 65; i<upperStart+26;i++) {
			int x=i+upperStart;
			System.out.println(x+"="+((char)x));
		}
		//for(int i= 65; i<lowerStart+26;i++) {
			//System.out.println(i+"="+((char)i));
		//}
	}
}
