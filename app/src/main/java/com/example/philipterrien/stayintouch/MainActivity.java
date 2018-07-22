package com.example.philipterrien.stayintouch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView contactListView;
    ArrayList<Contact> contactList;
    Contact newContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactListView = findViewById(R.id.contactListView);
        contactList = new ArrayList<>();

        Button addBtn = findViewById(R.id.addContactBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AddContact.class);
                startActivity(startIntent);
            }
        });



    }


        //MUST USE START ACTIVITY FOR RESULT
        /*
        String newName = getIntent().getStringExtra("nameInput");
        String newAddress = getIntent().getStringExtra("addressInput");
        String newNotes = getIntent().getStringExtra("notesInput");
        boolean isAddress;

        if (newAddress.equals("") && newNotes.equals("")) {
            newContact = new Contact(newName);
        }
        else if (newAddress.equals("") && !newNotes.equals("")) {
            isAddress = false;
            newContact = new Contact(newName, newNotes, isAddress);
        }
        else if (!newAddress.equals("") && newNotes.equals("")) {
            isAddress = true;
            newContact = new Contact(newName, newNotes, isAddress);
        }
        else {
            newContact = new Contact(newName, newAddress, newNotes);
        }

        contactList.add(newContact);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),contactListView)
        */

}
