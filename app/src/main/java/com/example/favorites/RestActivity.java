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

public class RestActivity extends AppCompatActivity {

    public ArrayList<String> restsList;
    public ArrayAdapter<String> restsAdapter;
    public EditText restInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
        ListView listView=(ListView)findViewById(R.id.listView7);
        String[] restItems = {""};
        restsList = new ArrayList<>(Arrays.asList(restItems));
        restsAdapter = new ArrayAdapter<String>(this, R.layout.rest_items, R.id.restInput, restsList);
        listView.setAdapter(restsAdapter);
        restInput = (EditText)findViewById(R.id.inputText7);
        Button buttonAdd7 = (Button)findViewById(R.id.addButton7);
        getSupportActionBar().setTitle("Favorite Restaurants");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buttonAdd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newRest = restInput.getText().toString();
                restsList.add(newRest);
                restsAdapter.notifyDataSetChanged();
            }
        });

    }
}
