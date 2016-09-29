package com.acadgild.intentcontactsmenu;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewContacts();
    }

    private void viewContacts() {
        // TODO Auto-generated method stub
        try
        {
            Button viewContacts = (Button)findViewById(R.id.ViewContacts);
            viewContacts.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent contacts = new Intent();
                    contacts.setAction(android.content.Intent.ACTION_VIEW);
                    contacts.setData(Contacts.People.CONTENT_URI);
                    startActivity(contacts);
                }
            });
        }
        catch(ActivityNotFoundException e)
        {
            Log.e("ViewContacts","Unable to View the contacts", e);
        }

    }
}
