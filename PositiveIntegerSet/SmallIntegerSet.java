import java.util.Set;
import java.util.HashSet;

public class SmallIntegerSet extends PositiveIntegerSet {
	
	public SmallIntegerSet(int... nums) {
		set = new HashSet<>();
		for(int num: nums) {
			if(num >= 1 && num <= 1000) {
				set.add(num);
			}
		}
	}
	
	public void insertElement(int k) throws MyIllegalArgumentException{
		if(k >= 1 && k <= 1000) {
			this.set.add(k);
		} else {
			throw new MyIllegalArgumentException();
		}
	}
}