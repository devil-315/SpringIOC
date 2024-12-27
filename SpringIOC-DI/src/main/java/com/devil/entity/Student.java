package com.devil.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * ClassName：Student
 *
 * @author: Devil
 * @Date: 2024/9/8
 * @Description:
 * @version: 1.0
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String > hobbys;
    private Map<String ,String > card;

    public Student() {
    }

    public Student(String name, Address address, String[] books, List<String> hobbys, Map<String, String> card) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.hobbys = hobbys;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                '}';
    }
}
