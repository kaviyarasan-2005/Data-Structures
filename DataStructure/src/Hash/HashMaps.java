package Hash;
import java.util.*;
public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		int i=1;
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"a");
		map.put(4,"c");
		map.put(5,"f");
		System.out.println(i++ +"->"+map);
		System.out.println(i++ +"->"+map.get(5));
		System.out.println(i++ +"->"+map.containsKey(1));
		System.out.println(i++ +"->"+map.containsValue("c"));
		map.replace(3, "h");
		System.out.println(i++ +"->"+map);
		map.replace(20, "h");
		System.out.println(i++ +"->"+map);
		map.putIfAbsent(1, "m");
		System.out.println(i++ +"->"+map);
		map.putIfAbsent(7,"v");
		System.out.println(i++ +"->"+map);
		map.remove(5);
		System.out.println(i++ +"->"+map);
		
	}
}
