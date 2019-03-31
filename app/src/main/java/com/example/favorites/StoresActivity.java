package com.example.favorites;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StoresActivity extends AppCompatActivity {

    public ArrayList<String> storesList;
    public ArrayAdapter<String> storesAdapter;
    public EditText storeInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);
        ListView listView=(ListView)findViewById(R.id.listView10);
        String[] storeItems = {""};
        storesList = new ArrayList<>(Arrays.asList(storeItems));
        storesAdapter = new ArrayAdapter<String>(this, R.layout.store_items, R.id.storeInput, storesList);
        listView.setAdapter(storesAdapter);
        storeInput = (EditText)findViewById(R.id.inputText10);
        Button buttonAdd10 = (Button)findViewById(R.id.addButton10);
        getSupportActionBar().setTitle("Favorite Stores");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buttonAdd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newStore = storeInput.getText().toString();
                storesList.add(newStore);
                storesAdapter.notifyDataSetChanged();
            }
        });

    }
}

