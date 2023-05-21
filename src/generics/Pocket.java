package generics;

//					ジェネリクス（仮型引数）一度型を入れるとその型以外入れられなくなる
//					↓  基本型以外の型は入れられない（int,double,booleanとかが基本型）
//					↓	インスタンス生成の際に<>を使い型を決定
//					↓  型を入れないとObjectが入る
public class Pocket<E> {
	private E data;

//	SetterとGetter作成
	public void put(E o) {this.data = o;};
	public E get() {return this.data;};


}
