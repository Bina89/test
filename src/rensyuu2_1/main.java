package rensyuu2_1;

public class main {
	public static void main(String[]args) {
		StrongBox<String> b = new StrongBox();
		b.put("開いた");
		System.out.println(b.get());
	}
}
