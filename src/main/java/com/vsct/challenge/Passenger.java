package com.vsct.challenge;

import java.util.List;
import java.util.Set;

public class Passenger {

    private int age;
    private Set<String> passengerType;
    private List<String> cards;
    private int price;

    public Passenger() {


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(Set<String> passengerType) {
        this.passengerType = passengerType;
    }

    public List<String> getCards() {
        return cards;
    }

    public void setCards(List<String> cards) {
        this.cards = cards;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
