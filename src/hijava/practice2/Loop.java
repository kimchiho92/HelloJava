package hijava.practice2;

public class Loop {
	public static void main(String[]args) {
		int i;
		int sum;
		for(i=1, sum=0;i<=100;i++) {
//			if(i%2==1) 
				sum +=i;
		}
			System.out.println(sum);
			System.out.println("=================");
			
		int j =1;
		int sum1=0;
		while(j<=100) {
			//if(j%2==1)
			sum1+=j;
			j++;
		}
		System.out.println(sum1);
	}
}
