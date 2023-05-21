package MethodObject;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
	//第１級オブジェクト
	//・変数に代入可能
	//・引数に設定可能
	//・実行中に生成可能

	public static void main(String[] args) {

		//関数を変数に格納(格納するものは参照する)
		//		 ↓引数  ↓戻り値 		↓Mainクラスのlenメソッドを参照
		Function<String,Integer>func = Main::len;

		//文字数格納変数
		int length = func.apply("うおおんおうんおん");

		//文字数を出力
		System.out.println(length);

		//phpのprepareみたいな感じ ↓実行する文を事前に入れる
		Consumer<String>con = System.out::println;
		//	↓こっちはexecuteと同じ役割
		con.accept("💩");

		//↑の引数を取らず、値を返すだけver(改行コードを返す)
		Supplier<String>sup = System::lineSeparator;
		con.accept("1行目"+sup.get()+"2行目");

		//引数2つver<引数、引数、戻り値>			 ↓システムのプロパティ情報取得
		BiFunction<String,String,String>bi = System::getProperty;
		con.accept(bi.apply("user.name", "keyが正しくないです"));
		
		//関数インターフェースを作成することで関数を柔軟に格納できる
		
		
		
	}

	//文字数を数える
	public static Integer len(String string) {
		return string.length();
	}

}
