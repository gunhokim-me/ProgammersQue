package level2;

import java.util.Arrays;

public class JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String answer = "";

		String[] temp = s.split(" ");
		for (int i = 0; i < temp.length; i++) {
			temp[i] = temp[i].toLowerCase();
			int test = temp[i].substring(0, 1).charAt(0);
			if (test >= 48 || test <= 57) {
				continue;
			} else {
				test = test - 32;
			}
		}
		System.out.println(Arrays.toString(temp));
	}

}
