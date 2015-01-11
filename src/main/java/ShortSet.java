import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shawn on 10/01/15.
 */
public class ShortSet {
    public static void main(String[] args) {
        Set<Short> s= new HashSet<Short>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            // this isn't actually removing, it can be seen from the declaration of the method
            s.remove(i - 1); // int-valued expression
        }
        System.out.println(s.size());

    }
}
