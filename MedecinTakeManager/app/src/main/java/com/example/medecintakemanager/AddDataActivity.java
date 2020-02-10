package com.example.medecintakemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);
        Spinner spinnerNames = (Spinner) findViewById(R.id.spinnerNames);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(AddDataActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinnerNames.setAdapter(myAdapter);
    }
}
