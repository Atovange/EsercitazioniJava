import java.util.Set;
import java.util.HashSet;

public class PositiveIntegerSet {
	protected Set<Integer> set;
	
	public PositiveIntegerSet(int... nums) {
		set = new HashSet<>();
		for(int num: nums) {
			if(num > 0) {
				set.add(num);
			}
		}
	}
	
	public PositiveIntegerSet(PositiveIntegerSet pset) {
		set = new HashSet<>();
		this.set.addAll(pset.getSet());
	}
	
	public Set<Integer> getSet() {
		return this.set;
	}
	
	public void addAll(Set<Integer> set) {
		this.set.addAll(set);
	}
	
	public void insertElement(int k) throws MyIllegalArgumentException{
		if(k > 0) {
			this.set.add(k);
		} else {
			throw new MyIllegalArgumentException();
		}
	}
	
	public void deleteElement(int k) {
		this.set.remove(k);
	}
	
	public int compareTo(PositiveIntegerSet s) {
		if(this.set.size() > s.getSet().size()) {
			return 1;
		} 
		else if(this.set.size() < s.getSet().size()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public PositiveIntegerSet union(PositiveIntegerSet s) {
		PositiveIntegerSet ret = new PositiveIntegerSet();
		ret.addAll(this.set);
		ret.addAll(s.getSet());
		return ret;
	}
	
	public PositiveIntegerSet intersection(PositiveIntegerSet s) {
		PositiveIntegerSet ret = new PositiveIntegerSet();
		/* /old version
		for(int num: this.set) {
			for(int chk: s.getSet()) {
				if(num == chk) {
					ret.insertElement(num);
				}
			}
		}
		*/
		Set<Integer> tmp = new HashSet<>();
		tmp.addAll(this.set);
		tmp.retainAll(s.getSet());
		ret.addAll(tmp);
		return ret;
	}
	
	public PositiveIntegerSet difference(PositiveIntegerSet s) {
		PositiveIntegerSet ret = new PositiveIntegerSet();
		/* /old version
		for(int num: this.set) {
			for(int chk: s.getSet()) {
				if(num == chk) {
					ret.deleteElement(num);
				}
			}
		}
		*/
		Set<Integer> tmp = new HashSet<>();
		tmp.addAll(this.set);
		tmp.removeAll(s.getSet());
		ret.addAll(tmp);
		return ret;
	}
	
	public String toString() {
		String s = "[ ";
		for(int pos: set) {
			s += pos + " ";
		}
		if(s.equals("[ ")) {
			return "Insieme vuoto";
		}
		return s + "]";
	}
}



















