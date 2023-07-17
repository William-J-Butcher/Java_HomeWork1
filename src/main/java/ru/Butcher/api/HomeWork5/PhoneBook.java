package ru.Butcher.api.HomeWork5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(lastName, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(lastName, phoneNumbers);
    }

    public List<String> get(String lastName) {
        return contacts.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123456789");
        phoneBook.add("Петров", "987654321");
        phoneBook.add("Иванов", "111222333");

        List<String> ivanovNumbers = phoneBook.get("Иванов");
        System.out.println("Иванов - номер телевона: " + ivanovNumbers);

        List<String> petrovNumbers = phoneBook.get("Петров");
        System.out.println("Петров - номер телевона: " + petrovNumbers);
    }
}