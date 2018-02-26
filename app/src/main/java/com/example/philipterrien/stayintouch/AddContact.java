package com.example.philipterrien.stayintouch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {
    String nameInput;
    String addressInput;
    String notesInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        nameInput = ((EditText)findViewById(R.id.nameEditText)).getText().toString();
        addressInput = ((EditText)findViewById(R.id.addressEditText)).getText().toString();
        notesInput = ((EditText)findViewById(R.id.notesEditText)).getText().toString();


        Button saveContactBtn = findViewById(R.id.saveContactBtn);
        saveContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
                backIntent.putExtra("nameInput", nameInput);
                backIntent.putExtra("addressInput", addressInput);
                backIntent.putExtra("notesInput", notesInput);
            }
        });
    }
}
