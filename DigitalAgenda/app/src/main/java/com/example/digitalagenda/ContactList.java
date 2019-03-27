package com.example.digitalagenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactList extends AppCompatActivity {

    private ListView LV;
    private ArrayList<Contact> Contacts;
    private ArrayList<String> ContactNames;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);

        LV = (ListView)findViewById(R.id.LVContacts);
        Contacts = Data.Get();
        ContactNames = new ArrayList<String>();
        if(Contacts.size() == 0){
            ContactNames.add(String.valueOf(R.string.no_records));
        }else{
            for (int i = 0; i < Contacts.size(); i++) {
                ContactNames.add(Contacts.get(i).getName());
            }

        }
    }
}
