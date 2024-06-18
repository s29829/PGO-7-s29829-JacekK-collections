import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Zadanie 1.
        ArrayList<Car> car = new ArrayList<>();

//        Zadanie 2.
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("10345", "Spoon steel"));
        items.add(new Item("10256", "Spoon silver"));
        items.add(new Item("20056", "Plate white"));
        items.add(new Item("20077", "Big plate white"));
        items.add(new Item("51123", "Pho soup"));
        items.add(new Item("40087","Chicken with rice"));

        for (Item item : items) {
            item.show();
        }
        ArrayList<Object> itemsHasMap = new ArrayList<>();
        HashMap<String, String> objectObjectHashMap = new HashMap<>();

        for (Item item : items) {
            objectObjectHashMap.put(item.getCode(), item.getName());
        }

        System.out.println(objectObjectHashMap.entrySet());

        ArrayList<Item> booksSandersson = new ArrayList<>();
        booksSandersson.add(new Item("ISBN 978-83-7480-080-8", "The Final Empire"));
        booksSandersson.add(new Item("ISBN 978-83-7480-153-9", "The Well of Ascension"));
        booksSandersson.add(new Item("ISBN 978-83-7480-200-0", "The Hero of Ages"));
        booksSandersson.add(new Item("ISBN 978-83-7480-238-3", "Alloy of Law"));
        booksSandersson.add(new Item("ISBN 978-83-7480-637-4", "Shadows of Self"));
        booksSandersson.add(new Item("ISBN 978-83-7480-646-6", "The Bands of Mourning"));
        booksSandersson.add(new Item("ISBN 978-0-7653-2635-5", "The Way of Kings"));
        booksSandersson.add(new Item("ISBN 978-0-575-09904-3", "Words of Radiance"));
        booksSandersson.add(new Item("ISBN 978-1-4272-7592-9", "Oathbringer"));
        booksSandersson.add(new Item("ISBN 978-83-7966-029-2", "Alcatraz Versus the Evil Librarians"));

        for (Item item : booksSandersson) {
            System.out.println("Code: "+item.getCode()+"Name: "+item.getName());
        }
        System.out.println(booksSandersson.toString());
//        Zadanie 3.

//        Zadanie 4.
//        Utwórz własną klasę wyjątku o nazwie NegativeNumberException.
////        Utwórz pustą tablicę o rozmiarze 10 dla typu int.
//        Utwórz metodę readNumber() zwracającą wartość wczytaną od
//        użytkownika(skorzystaj z pakieu java.util.Scanner).
//        Jeśli użytkownik poda liczbę mniejszą od 0 rzuć zdefiniowany
//        wyjątek z wiadomością "Negative numbers are not allowed".Utwórz metodę fillArray () wrzucającą wartości
//        zwracane przez metodę readNumber () do tablicy, jeśli metoda readNumber () podczas swojego działania rzuci
//        wyjątek, obsłuż go wrzucając do tablicy wartość 0 i wyświetlając na konsoli wiadomość wyjątku.


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
