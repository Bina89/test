package rensyuu2_1;

import NullSafe.KeyType;

public class main {
	public static void main(String[]args) {
		StrongBox<String> b = new StrongBox(KeyType.BUTTON);
		b.put("開いた");
		System.out.println(b);
	}
}
