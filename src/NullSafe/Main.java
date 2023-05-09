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
		System.out.println(op1);

	}

}
