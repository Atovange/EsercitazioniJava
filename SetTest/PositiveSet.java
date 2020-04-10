import java.util.HashSet;

public class PositiveSet extends HashSet<Integer> {
	public PositiveSet(int... nums) {
		super();
		for(int num: nums) {
			if(num > 0) {
				add(num);
			}
		}
	}
	
	public PositiveSet(PositiveSet p) {
		super(p);
	}
	
	public PositiveSet union(PositiveSet p) {
		PositiveSet ret = new PositiveSet(this);
		ret.addAll(p);
		return ret;
	}
	
	public PositiveSet intersection(PositiveSet p) {
		PositiveSet ret = new PositiveSet(this);
		ret.retainAll(p);
		return ret;
	}
	
	public String toString() {
		return super.toString();
	}
}