import java.util.*;

public class Main {

    public static void main(String[] args) {



//      Zadanie 2.
        zadanie02();


//      Zadanie 3.
        zadanie03();


//      Zadanie 1.
        zadanie01();


//      Zadanie 4.


//      Sample from lesson.
        sampleFromWordToTrashAtTheEnd();
    }


    private static void zadanie02() {
        ArrayList<Item> zad2Item = new ArrayList<>();
        zad2Item.add(new Item("10345", "Spoon steel"));
        zad2Item.add(new Item("10256", "Spoon silver"));
        zad2Item.add(new Item("20056", "Plate white"));
        zad2Item.add(new Item("20077", "Big plate white"));
        zad2Item.add(new Item("51123", "Pho soup"));
        zad2Item.add(new Item("40087", "Chicken with rice"));

        System.out.println("\nMethod show()");
        for (Item item : zad2Item) {
            item.show();
        }

        HashMap<String, String> objectObjectHashMap = new HashMap<>();

        for (Item item : zad2Item) {
            objectObjectHashMap.put(item.getCode(), item.getName());
        }

        System.out.println("\n____1. option - Show HasMap.entrySet )");

        System.out.println(objectObjectHashMap.entrySet());


        System.out.println("\n____2. option - change to Map )");

        Set<Map.Entry<String, String>> zad2Map = objectObjectHashMap.entrySet();
//        System.out.println(zad2Map);
        System.out.println("\nIteration )");

        for (Map.Entry<String, String> entry : zad2Map) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void zadanie03() {
        List<Item> booksSandersson = new ArrayList<>();
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
            System.out.println("Code: " + item.getCode() + "Name: " + item.getName());
        }


        List<Item> shortListOfBooks = new ArrayList<>();
        shortListOfBooks = booksSandersson.subList(0, 5);

        System.out.println("___________ Short list of previous list. First 5th elements. ");
        for (Item item : shortListOfBooks) {
            System.out.println("Code: " + item.getCode() + "Name: " + item.getName());
        }

        HashSet<Object> shotListInHashSet = new HashSet<>();

        for (Item item : shortListOfBooks) {
            shotListInHashSet.add(item.getName());
        }
        System.out.println("SSS " + shotListInHashSet);

        for (Object item : shotListInHashSet) {
            System.out.println("OR: " + item);
        }
    }

    private static void zadanie01() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2022, "Mazda"));
        cars.add(new Car(2013, "Fiat"));
        cars.add(new Car(2021, "BYD"));
        cars.add(new Car(2001, "Jaguar"));
        cars.add(new Car(1986, "Citroen"));
        cars.add(new Car(2024, "Ford"));
        cars.add(new Car(2012, "Mazda"));
        cars.add(new Car(2006, "Suzuki"));
        cars.add(new Car(2018, "Fiat"));
        cars.add(new Car(2020, "Peugeot"));

        System.out.println("\nArrayList of Cars without sorting");
        int i = 0;

        for (Car car : cars) {
            System.out.println(i++ + ". " + car.getModel() + " | " + car.getYearProduction());
        }

        cars.sort(Car::compareTo);

        System.out.println("\n___________ Cars after sorting");
        i = 0;
        for (Car car : cars) {
            System.out.println(i++ + ". " + car.getModel() + " |: " + car.getYearProduction());
        }
    }

    private static void sampleFromWordToTrashAtTheEnd() {
        HashSet<Object> booksyHashSet = new HashSet<>();
//        new ArrayList<>()


//        shortListOfBooks = (ArrayList<Item>) booksSandersson.subList(0, 5);
//        System.out.println(booksSandersson.toString());
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
