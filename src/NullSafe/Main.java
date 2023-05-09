package NullSafe;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		//nullかどうかチェックしつつインスタンス生成をする
		//newで生成は不可
		Optional<String> op1 = Optional.ofNullable("うんち");
		//nullの格納を許さない
		//Optional<String> op2 = Optional.of(null);

		Optional<String> op2 = Optional.ofNullable(null);

	}

}
