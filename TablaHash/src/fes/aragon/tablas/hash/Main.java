package fes.aragon.tablas.hash;

public class Main {
	public static void main(String[] args) {
		Hash test = new Hash(7);
		System.out.println(test.funcionHash("b"));
		System.out.println(test);
		test.Add("150", "a");
		System.out.println(test);
		test.Add("6", 1);
		test.Add("87", 9);
		System.out.println(test);
		System.out.println("\n");
		test.Add("56", 2);
		test.Add("2", 11);
		test.Add("c", "d");
		System.out.println(test);
		System.out.println(test.valueOf("2"));
		System.out.println("");
		test.Remove("150");
		System.out.println(test);

	}

}
