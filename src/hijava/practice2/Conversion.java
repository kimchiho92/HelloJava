package hijava.practice2;

public class Conversion {
	public static void main(String[]args) {
		// char c= 65; int i =(int)c;
		int i = 0;
			System.out.println(i);
				i++; //==i=i+1
				i--; //== i+i-1
		int j= i++;
		//int j=(i=i+1);
		System.out.println(j);
			
		int k = (i>0)?	199:2000;
		System.out.println("k="+k);

		int s = !(i>0)?	199:2000;
		System.out.println("k="+s);

	}
	
}
