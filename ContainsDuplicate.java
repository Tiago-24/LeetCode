//217. Contains Duplicate

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> s = new HashSet<>();
        for (int n : nums) {
            if (s.contains(n)){
                return true;
            }
            s.add(n);
        }
        return false;
    }
}
