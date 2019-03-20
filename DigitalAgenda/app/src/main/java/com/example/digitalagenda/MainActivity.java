package com.example.digitalagenda;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView LV;
    private String Opc[];
    private Resources Resources;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV = (ListView)findViewById(R.id.Options);
        Resources = this.getResources();
        Opc = Resources.getStringArray(R.array.Menu);

        ArrayAdapter<String> Addapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Opc);
        LV.setAdapter(Addapter);

    }

}
