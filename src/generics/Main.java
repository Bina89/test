package generics;

public class Main {

	public static void main(String[] args) {
		Pocket<String> p = new Pocket();

//		データの入力
		p.put("ローマ");

//		データを取り出し変数に格納 Objectなのでキャスト
		String s = p.get();

//		表示
		System.out.println(s);


	}

}
