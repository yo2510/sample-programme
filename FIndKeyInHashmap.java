import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FIndKeyInHashmap {
	static Map<String, String> map = new HashMap<String, String>();
	
	public static void main(String[] args) {
		map.put("Yogesh", "9819406446");
		map.put("Yogesh", "9819798698");
		map.put("Deepali", "9702818494");
		map.put("Father", "9833955294");
		
		
		String key = map.entrySet().stream().filter(e -> e.getValue().equals("9819406446")).map(Map.Entry::getKey).findFirst().orElse(null);
		
		map.entrySet() .stream() .filter(entry ->"9819406446".equals(entry.getValue())).map(Map.Entry::getKey);
		 
		
		System.out.println("key : "+key);
		
		/*
		 * FIndKeyInHashmap f = new FIndKeyInHashmap(); String key1 = f.getKey(map,
		 * "9819406446"); System.out.println("key : "+key1);
		 */
	}	
	
	public static String getKey(Map<String, String> map, String value) {
	    return map.keySet()
	                   .stream()
	                   .filter(key -> value.equals(map.get(key)))
	                   .findFirst().get();
	}
}
