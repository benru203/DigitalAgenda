package com.example.operations;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Number1, Number2;
    private Spinner Operations;
    private TextView Result;
    private Resources Resources;
    private ArrayAdapter<String> Adapter;
    private String[] Options;

    int Total  =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = (TextView)findViewById(R.id.LblResult);
        Operations = (Spinner)findViewById(R.id.SpinnerOptions);
        Number1 = (EditText)findViewById(R.id.TxtNumberOne);
        Number2 = (EditText)findViewById(R.id.TxtNumberTwo);
        Resources = this.getResources();
        Options = this.getResources().getStringArray(R.array.operations);
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Options);
        Operations.setAdapter(Adapter);
    }

    public void ShowTotal(View v){
        Result.setText(" ");
        String OperationSelected;
        OperationSelected = Operations.getSelectedItem().toString();
        int N1 = Integer.parseInt(Number1.getText().toString());
        int N2 = Integer.parseInt(Number2.getText().toString());
        Total = Methods.Calculate(N1, N2, OperationSelected);
        Result.setText(""+Total);
    }
}
