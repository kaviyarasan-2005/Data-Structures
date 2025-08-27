package Hash;
import java.util.*;
public class HashSets {
		public static void main(String[] args) {
			// can change a hashset into a TreeSet for natural order or LinkedHashSet for insertion order
			Set<Integer> set = new HashSet();
//			Set<Integer> set = new LinkedHashSet();
//			Set<Integer> set = new TreeSet();
			set.add(1);
			set.add(4);
			set.add(5);
			set.add(7);
			set.add(3);
			set.add(9);
			int i=1;
			System.out.println(i++ +"->"+set);
			set.forEach(System.out::print);
			System.out.println();
			set.forEach(e -> System.out.print(e+" "));
			System.out.println();
			System.out.println(i++ +"->"+set);
			set.remove(3);
			System.out.println(i++ +"->"+set);
			System.out.println(i++ +"->"+set.contains(0));
			System.out.println(i++ +"->"+set.size());
			System.out.println(i++ +"->"+set.isEmpty());
			System.out.println(i++ +"->"+set);
			List<Integer> list = new ArrayList<>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			set.addAll(list);
			System.out.println(i++ +"->"+set);
		}
}
