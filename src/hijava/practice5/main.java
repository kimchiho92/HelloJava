package hijava.practice5;

import java.io.IOException;
import java.sql.SQLException;

public class main {
		private static void total() {
			int[] arr = new int[] { 1, 2, 5, 9};
			SubTotal st = new SubTotal();
			System.out.println("Total=" + st.sum(arr));
		}

private static void calculator() {
	Calculator calc = new CalculatorImpl();
	int x = 10, y = 5;
	calc.add(x, y);
	calc.div(x, y);
	calc.div(x, 0);
}
}