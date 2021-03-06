package com.tmjonker.burgerbonanza.entities.purchase.purchaserequest;

import com.tmjonker.burgerbonanza.entities.address.Address;
import com.tmjonker.burgerbonanza.entities.menu.MenuItem;

import java.util.List;

public class PurchaseRequest {

    private List<MenuItem> menuItems;
    private double totalPrice;
    private String username;

    private Address address;

    public PurchaseRequest(List<MenuItem> menuItems, double totalPrice, String username, Address address) {
        this.menuItems = menuItems;
        this.totalPrice = totalPrice;
        this.username = username;
        this.address = address;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
