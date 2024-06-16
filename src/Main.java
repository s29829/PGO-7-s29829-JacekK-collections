import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(111, "Jan Kowalski");
        employees.put(333, "Wojciech Kowalski");
        employees.put(222, "Kasia Piotrowska");

        System.out.println("Employee amount: " + employees.size());

        Set<Integer> keySet = employees.keySet();
        System.out.println("Keys:\n" + keySet);
        Collection<String> values = employees.values();
        System.out.println("Values:\n" + values);

        Set<Map.Entry<Integer,String>> entrySet = employees.entrySet();
        for(Map.Entry<Integer, String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
