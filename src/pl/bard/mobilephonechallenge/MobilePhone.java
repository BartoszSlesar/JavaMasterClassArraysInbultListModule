package pl.bard.mobilephonechallenge;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class MobilePhone {
    private String number;

    private List<Contact> contactList;

    public MobilePhone() {
        this("999999000");
    }

    public MobilePhone(String number) {
        this.number = number;
        this.contactList = new ArrayList<>();
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public boolean addContact(String name, String number) {
        Contact contact = new Contact(name, number);
            return this.contactList.add(contact);

    }

    public Contact getContact(String name) {
        Optional<Contact> contact = contactList.stream().filter(n -> n.getName().equals(name)).findFirst();
        return contact.orElse(null);
    }

    public boolean removeContact(Contact contact) {

        return contactList.remove(contact);


    }

    public void removeContact(String name) {
        Contact contact = getContact(name);
        if (contact != null) {
            contactList.remove(contact);
        } else {
            System.out.println("Contact Do not exist");
        }
    }

    private int getIndexOfContact(Contact contact) {
        return contactList.indexOf(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int contactIndex = getIndexOfContact(oldContact);
        contactList.remove(contactIndex);
        return contactList.add(newContact);


    }


    public void printContacts() {
        contactList.forEach(System.out::println);
    }


}
