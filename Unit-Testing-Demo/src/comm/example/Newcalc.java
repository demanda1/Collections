package comm.example;

public class Newcalc{

	private int x;
	private int y;
	private int result;
	
	
	public Newcalc() {
		super();
	}


	public Newcalc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int subMethod() {
		result=x-y;
		return result;
	}
}
