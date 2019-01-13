package hijava.practice;

public class Hellojava {
	public static void main(String[] args) {
		System.out.println("hello java");
//		  밑에  say 함수를 호출 
		Hellojava.say("hi");
	}
/**
 * 1st java pratice
 * @param chiho
 * @update 19-01-12 by chiho
 */
	public static void say(String msg) { // say(String msg )라는 함수를 만듦
		System.out.println(msg);
	}
}
 