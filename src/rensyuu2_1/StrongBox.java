package rensyuu2_1;

import java.util.Optional;

import NullSafe.KeyType;

public class StrongBox<A> {
	private A box;
	private KeyType kt;
	private int count = 0;

	public StrongBox(KeyType kt) {
		this.kt = kt;
	}

	public void put(A box) {
		this.box = box;
	}
	//戻り値にOptionalが付いてる理由は戻り値でnull安全性を
	//確保するため
	public Optional<A> get(){
		this.count++;

		//戻り値に渡す値を入れる変数
		A r = null;

		//受け取ったktの名前に対応した処理を繰り返す
		switch(this.kt) {
		case PADLOCK:
			r = checkCount(5);
			break;

		case BUTTON:
			r = checkCount(10);
			break;

		case DIAL:
			r = checkCount(5);
			break;

		case FINGER:
			r = checkCount(5);
			break;
		}
		return Optional.ofNullable(r);
	}

	//privateメソッドは作成したクラス内でのみアクセス可能
	private A checkCount(int needNum) {
		A r;

		//必要な数が呼び出されているかチェック
		if(this.count < needNum) {
			r = null;
		}else {
			r = this.box;
		}
		return r;
	}

	//KeyType用getter
	public KeyType getKeyType() {
		return this.kt;
	}
}
