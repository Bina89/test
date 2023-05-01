package TypeSafe;

public class Main {

	public static void main(String[] args) {
		prints("仮面ライダー",6);
	}
	//第一引数の文字を第二引数の数分表示する
	public static void prints(Object a,int b) {
		for(int i = 0;i<b;i++) {
			System.out.println(a);
		}
	}
}
