package hijava.practice4;

public abstract class AbstractSuper {
		public abstract int max(int i, int j);
		
		public int min(int i, int j) {
			return i > j ? j : i;
		}
}
