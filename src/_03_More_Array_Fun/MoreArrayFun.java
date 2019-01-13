package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String[] string = { "alice", "bob", "carl", "dave", "eli", "francis", "george", "hannah", "itai", "james",
				"karl", "liam", "mark" };
		RandomStrings(string);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	void Strings(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	void OppositeStrings(String[] a) {
		String[] b = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			b[a.length - (i + 1)] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	void EveryOtherStrings(String[] a) {
		for (int i = 0; i < a.length; i += 2) {
			System.out.println(a[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	static void RandomStrings(String[] a) {
		String[] b = new String[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = "";
		}
		Random r = new Random();
		int in = 0;
		boolean bo = false;
		for (int i = 0; i < a.length; i++) {
			bo = false;
			while (bo == false) {
				in = r.nextInt(a.length);
				if (b[in] == "") {
					b[in] = a[i];
					bo = true;

				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
