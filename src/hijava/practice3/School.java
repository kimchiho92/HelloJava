package hijava.practice3;

public class School {
	public static void main(String[]args) {
	Score korean = new Score(); // Score 이라는 생성자 호출 
	
	korean.setSubject("국어");
	korean.setScore(90);
	
	Score math = new Score("수학", 80);
	
	Score science  = new Score("과학");
	
	System.out.println(korean);
	String k = korean.toString();
	System.out.println(k);
	
	System.out.println(math);
	}
}
