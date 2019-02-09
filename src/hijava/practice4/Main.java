package hijava.practice4;

public class Main {
	/*public static void main(String[] args) {
		weight();
	}

	private static void weight() {
		Weight guen = new Guen();
		Weight pound = new Pound();

		int cnt = 5;
		System.out.println("Guen=" + guen.getGram(cnt));
		System.out.println("Pound=" + pound.getGram(cnt));
	}
}*/
public static void main(String[] args) {
/*	animal();
}
	private static void animal() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		barkAnimal(dog);
		barkAnimal(cat);
	}

	private static void barkAnimal(Animal ani) {
		ani.bark();
	}
*/
	netsport();
}
	private static void netsport() {
		NetSport pp = new Pingpong();
		NetSport te = new Tennis();
		pp.play();
		System.out.println("-----------");
		te.play();
	}

}
