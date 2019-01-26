package hijava.pratice3;

public class Score {
	private String subject;
	private int score;
	// 과목과 성적이라는 멤버 변수 (인스턴스)를 갖는다;
	/*
	 * public Score() {
	 *  default로 만들어 져 있승ㅁ
	 *  
	 * }
	 */

	public Score(String subject, int score) {
		this.subject= subject;
		this.score= score;
	}

	public Score() {
		// TODO Auto-generated 기본 생성자 
	}

	public Score(String subject) {
		//this.subject=subject;
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = "과목+"+subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "StudentTest [subject=" + subject + ", score=" + score + "]";
	}
}
 