package rensyuu2_1;

public class StrongBox<A> {
	private A box;

	public void put(A box) {
		this.box = box;
	}
	public A get(){
		return this.box;
	}
}
