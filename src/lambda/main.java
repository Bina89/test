package lambda;

import java.util.Date;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

public class main {

	public static void main(String[] args) {

		//ラムダ式：関数を直接記述する   ↓引数					↓戻り値(文字数を返す)
		Function<String,Integer>func = (String s) -> {return s.length();};

		int num = func.apply("Amazon");

		System.out.println("文字数 :" + num);

		//引数ないver(日付出力)
		Supplier<Date> sup = () -> {return new java.util.Date();};
		System.out.println(sup.get());

		//メソッドaddを格納する関数オブジェクトの作成（int型を使用することが可能なFunctionを使う）
		IntBinaryOperator bo = main::add;
		;
		System.out.println(bo.applyAsInt(10, 90));
	}

	//引数int2つ
	//引数の合計を出すメソッドaddを作成
	//staticを付けるとインスタンス生成しなくても使える
	public static int add(int a,int b) {
		return a+b;
	}

}
