package com.example.philipterrien.stayintouch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView contactListView;
    ArrayList<Contact> contactList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactListView = findViewById(R.id.contactListView);
        contactList = new ArrayList<Contact>();

        Button addBtn = findViewById(R.id.addContactBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AddContact.class);
                startActivity(startIntent);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();


    }
}
