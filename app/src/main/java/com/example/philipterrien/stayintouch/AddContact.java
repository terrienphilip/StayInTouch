package com.example.philipterrien.stayintouch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContact extends AppCompatActivity {
    String nameInput;
    String addressInput;
    String notesInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        /*Button saveContactBtn = findViewById(R.id.saveContactBtn);
        saveContactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameInput = ((EditText)findViewById(R.id.nameEditText)).getText().toString();
                addressInput = ((EditText)findViewById(R.id.addressEditText)).getText().toString();
                notesInput = ((EditText)findViewById(R.id.notesEditText)).getText().toString();

                if(nameInput.equals("")){
                    Toast.makeText(getApplicationContext(), R.string.no_name_save, Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_contact, menu);
        return true;
    }
}
