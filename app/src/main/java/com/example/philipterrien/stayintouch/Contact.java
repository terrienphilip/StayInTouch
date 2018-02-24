package com.example.philipterrien.stayintouch;

/**
 * Created by philipterrien on 2/24/18.
 */

public class Contact {
    String name;
    String address;
    String notes;

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Contact(String name, String address, String notes) {
        this.name = name;
        this.address = address;
        this.notes = notes;
    }


}
