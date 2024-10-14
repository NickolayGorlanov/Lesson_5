import java.util.*;

public class PhoneBook {

    private final Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {

        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {

        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "123-4567");
        phoneBook.add("Petrov", "234-5678");
        phoneBook.add("Ivanov", "345-6789");
        phoneBook.add("Sidorov", "456-7890");


        System.out.println("Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Petrov: " + phoneBook.get("Petrov"));
        System.out.println("Sidorov: " + phoneBook.get("Sidorov"));
        System.out.println("Unknown: " + phoneBook.get("Unknown"));
    }
}
