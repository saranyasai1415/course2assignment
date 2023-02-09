import java.util.*;

// sec5 -->1.15

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Arraylist");
		ArrayList<String> city = new ArrayList<String>();
		city.add("madurai");
		city.add("sss");
		city.add("asas");
		System.out.println(city);
		
		System.out.println("Vector");
		Vector<Integer> numbers = new Vector();
		numbers.add(4);
		numbers.add(7);
		numbers.add(11);
		System.out.println(numbers);
		
		System.out.println("LinkedList");
		LinkedList<String> list = new LinkedList<String>();
		list.add("sara");
		list.add("shiva");
		list.add("sai");
		System.out.println(list);
		
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Hashset");
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(7);
		System.out.println(hs);
		
		System.out.println("Hashmap");
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		System.out.println(map);
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
				
		
		
	}

}
