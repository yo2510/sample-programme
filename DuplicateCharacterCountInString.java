import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharacterCountInString {
	private static Map<Character, Integer> map = new HashMap<Character, Integer>();
	public void countDuplicateCharacter(String str) {
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
	}
	public static void main(String[] args) {
		DuplicateCharacterCountInString d = new DuplicateCharacterCountInString();
		d.countDuplicateCharacter("adyanshyogeshdeepali");

		//using forEach
		System.out.println("using forEach loop");
		map.forEach((ch, i)->{	System.out.println("char : "+ch+" : count : "+i);});
		System.out.println();
		
		//using streams
		System.out.println("using java 8 streams api");
		map.entrySet().stream().forEach(e -> {System.out.println("char : "+e.getKey()+" : count : "+e.getValue());});
		System.out.println();
		
		//using entryset
		System.out.println("using entrySet");
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {			
			System.out.println("char : "+entry.getKey()+" : count : "+entry.getValue());
		}
		System.out.println();
		
		System.out.println("using keySet");
		for (Character key : map.keySet()) {
		      System.out.println("Key : " + key + " value : " + map.get(key));
		}
		System.out.println();
		System.out.println("Using iterator through map");
		Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		}
		
		System.out.println();
		System.out.println("using keySet");
		Iterator<Character> iterator1 = map.keySet().iterator();
		while (iterator.hasNext()) {
			Character key = iterator1.next();
			System.out.println("Key : " + key + " value : " + map.get(key));
		}
	}

}
