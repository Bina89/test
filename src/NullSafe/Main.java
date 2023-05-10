package NullSafe;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		//nullが入るインスタンス生成をする
		//newで生成は不可
		Optional<String> op1 = Optional.ofNullable("うんち");
		//nullの場合は空のOptional型を返す
		Optional<String> op2 = Optional.ofNullable(null);

		//ofはnull出ない値専用
		//Optional<String> op2 = Optional.of(null);

		//nullが格納されてるか見よう（trueなら入ってるfalseなら入ってない）
		System.out.println(op1.isPresent());
		System.out.println(op2.isPresent());

		//変数の中身を表示（中身が存在すれば表示されnullならエラー）
		System.out.println(op1.get());
		//System.out.println(op2.get());←エラー吐くからコメントアウト

		//変数の中身を表示（中身がnullなら引数を表示）
		System.out.println(op1.orElse("うんこ"));
		System.out.println(op2.orElse("うんこ"));

		//decorateメソッドを用いて表示
		//まずメソッドを変数に格納
		Optional<String> op3 = decorate("うんち","💩");
		//nullを考慮して表示
		System.out.println(op3.orElse("nullが格納されてる"));
	}

	//decorateメソッド
		//目的：文字列の両端に文字を追加する（$たなか$）
		//第一引数：文字列（たなか）
		//第二引数：はさむ文字（$）
		//戻り値：Optional<String>　nullが格納される可能性があることを考慮した処理を呼び出し側に強制させる
		//処理：文字列がnull、もしくは文字数が0の場合nullを返す。
		//		正しい引数が設定された場合、文字列の両端にはさむ文字を追加する
	public static Optional<String> decorate(String mozi,String hasamu) {
		if(mozi == null || mozi.length() == 0) {
			return Optional.empty();
		}
		return Optional.of(hasamu + mozi + hasamu);
	}



}
