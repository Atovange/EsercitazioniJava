public class Razionale {
	private int num;
	private int denum;
	
	public Razionale(int num, int denum) {
		this.num = num;
		this.denum = denum;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDenum(int denum) {
		this.denum = denum;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public int getDenum() {
		return this.denum;
	}
	
	public Razionale somma(Razionale r) {
		int num;
		int denum;
		if(this.denum == r.denum) {
			denum = this.denum;
			num = this.num + r.num;
		}
		else {
			denum = this.denum * r.denum;
			num = (int) (this.num*(denum/this.denum) + r.num*(denum/r.denum));
		}
		return new Razionale(num, denum);
	}
	
	public Razionale sottrai(Razionale r) {
		int num;
		int denum;
		if(this.denum == r.denum) {
			denum = this.denum;
			num = this.num - r.num;
		}
		else {
			denum = this.denum * r.denum;
			num = (int) (this.num*(denum/this.denum) - r.num*(denum/r.denum));
		}
		return new Razionale(num, denum);
	}
	
	public String toString() {
		return this.num + "/" + this.denum;
	}
}