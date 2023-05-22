package lambda;

import java.util.function.Function;

public class main {

	public static void main(String[] args) {

		//ラムダ式：関数を直接記述する   ↓引数					↓戻り値(文字数を返す)
		Function<String,Integer>func = (String s) -> {return s.length();};

		int num = func.apply("Amazon");

		System.out.println("文字数 :" + num);

	}

}
