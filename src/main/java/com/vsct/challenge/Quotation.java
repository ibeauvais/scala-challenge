package com.vsct.challenge;

import java.util.List;

public class Quotation {

    private int stock;
    private List<String> travelAdvantages;

    public Quotation() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<String> getTravelAdvantages() {
        return travelAdvantages;
    }

    public void setTravelAdvantages(List<String> travelAdvantages) {
        this.travelAdvantages = travelAdvantages;
    }
}
