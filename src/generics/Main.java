package generics;

public class Main {

	public static void main(String[] args) {
		Pocket p = new Pocket();

//		データの入力
		p.put("ローマ");

//		データを取り出し変数に格納 Objectなのでキャスト
		String s = (String)p.get();

//		表示
		System.out.println(s);
	}

}
