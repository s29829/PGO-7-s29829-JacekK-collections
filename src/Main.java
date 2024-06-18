import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Zadanie 1.
        ArrayList<Car> car = new ArrayList<>();

//        Zadanie 2.
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Spoon steel", "10345"));
        items.add(new Item("Spoon silver", "10256"));
        items.add(new Item("Plate white", "20056"));
        items.add(new Item("Big plate white", "20077"));
        items.add(new Item("Pho soup", "51123"));
        items.add(new Item("Chicken with rice", "40087"));

        for (Item item : items) {
            item.show();
        }
        ArrayList<Object> itemsHasMap = new ArrayList<>();
        HashMap<String, String> objectObjectHashMap = new HashMap<>();

        for (Item item : items) {
            objectObjectHashMap.put(item.getCode(), item.getName());
        }

        System.out.println(objectObjectHashMap.entrySet());

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("","Spoon steel"));
        items.add(new Item("","Spoon silver"));
        items.add(new Item("","Plate white"));
        items.add(new Item("","Big plate white"));
        items.add(new Item("","Pho soup"));
        items.add(new Item("","Chicken with rice"));
//        Zadanie 3.

//        Map<Integer, String> employees = new HashMap<>();
//        employees.put(111, "Jan Kowalski");
//        employees.put(333, "Wojciech Kowalski");
//        employees.put(222, "Kasia Piotrowska");
//
//        System.out.println("Employee amount: " + employees.size());
//
//        Set<Integer> keySet = employees.keySet();
//        System.out.println("Keys:\n" + keySet);
//        Collection<String> values = employees.values();
//        System.out.println("Values:\n" + values);
//
//        Set<Map.Entry<Integer,String>> entrySet = employees.entrySet();
//        for(Map.Entry<Integer, String> entry: entrySet) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
    }
}
