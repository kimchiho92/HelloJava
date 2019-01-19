package hijava.practice2;

import java.util.Calendar;

public class CurrentTimeMillis {
	public static void main(String []args) {
		long star_Time = System.currentTimeMillis()	;
		long end_Time;
		long result_sum= 0;
		
		for(int i =0; i<10000000;++i) {
			result_sum+=i;
		
		}
		end_Time=System.currentTimeMillis();
		System.out.println(" 합의 결과:"+result_sum);
		System.out.println("실행시간( ms)"+(end_Time-star_Time));
		System.out.println("=========================================");
		long star_Time2 = Calendar.getInstance().getTimeInMillis();
		long end_Time2;
		long result_sum2= 0;
		
		for(int i =0; i<10000000;++i) {
			result_sum2+=i;
		
		}
		end_Time2=System.currentTimeMillis();
		System.out.println(" 합의 결과2:"+result_sum2);
		System.out.println("실행시간2( ms)"+(end_Time2-star_Time2));
		
	}
}
