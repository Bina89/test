package TypeSafe;

public class Main {

	public static void main(String[] args) {
//		String型をInteger型にキャストしたらエラー
//		これがダウンキャスト
		prints(6,"仮面ライダー");
	}
	//第一引数の文字を第二引数の数分表示する
	public static void prints(Object a,Object b) {
		for(int i = 0;i<(Integer)b;i++) {
			System.out.println(a);
		}
	}
}
