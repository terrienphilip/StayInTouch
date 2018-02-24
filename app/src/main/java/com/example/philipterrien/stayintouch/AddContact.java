package com.example.philipterrien.stayintouch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {
    String nameInput;
    String addressInput;
    String notesInput;
    Contact newContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        //Create Contact
        nameInput = ((EditText)findViewById(R.id.nameEditText)).getText().toString();
        addressInput = ((EditText)findViewById(R.id.addressEditText)).getText().toString();

        newContact = new Contact(nameInput, addressInput);
    }
}
