package com.example.philipterrien.stayintouch;

import android.app.Activity;
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
    String firstNameInput;
    String lastNameInput;
    String phoneInput;
    String emailInput;
    String notesInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_add_contact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                Bundle input = readInput();
                if (firstNameInput.equals("") && lastNameInput.equals("")) {
                    Toast.makeText(getApplicationContext(), R.string.no_name_save, Toast.LENGTH_SHORT).show();
                    return true;
                }
                if (!firstNameInput.equals("") || !lastNameInput.equals("")) {
                    Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                    mainIntent.putExtras(input);
                    setResult(Activity.RESULT_OK, mainIntent);
                    finish();
                    return true;
                }
                return true;

                default:
                return super.onOptionsItemSelected(item);
        }
    }

    private Bundle readInput() {
        Bundle input = new Bundle();
        firstNameInput = ((EditText) findViewById(R.id.firstNameEditText)).getText().toString();
        lastNameInput = ((EditText) findViewById(R.id.lastNameEditText)).getText().toString();
        phoneInput = ((EditText) findViewById(R.id.phoneEditText)).getText().toString();
        emailInput = ((EditText) findViewById(R.id.emailEditText)).getText().toString();
        notesInput = ((EditText) findViewById(R.id.noteEditText)).getText().toString();

        input.putString("firstNameInput", firstNameInput);
        input.putString("lastNameInput", lastNameInput);
        input.putString("phoneInput", phoneInput);
        input.putString("emailInput", emailInput);
        input.putString("notesInput", notesInput);

        return input;
    }

}

