package com.example.philipterrien.stayintouch;

/**
 * Created by philipterrien on 2/24/18.
 */

public class Contact {
    String name;
    String address;
    String notes;
    int queueRank;

    public Contact(String name) {
        this.name = name;
        queueRank = 0;
    }

    public Contact(String name, String address, boolean isAddress) {
        this.name = name;

        if (isAddress) {
            this.address = address;
        }
        else {
            this.notes = address;
        }
        queueRank = 0;
    }

    public Contact(String name, String address, String notes) {
        this.name = name;
        this.address = address;
        this.notes = notes;
        queueRank = 0;
    }


}
