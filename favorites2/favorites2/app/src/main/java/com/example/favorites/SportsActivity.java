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

public class SportsActivity extends AppCompatActivity {

    public ArrayList<String> sportsList;
    public ArrayAdapter<String> sportsAdapter;
    public EditText sportInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        ListView listView=(ListView)findViewById(R.id.listView9);
        String[] sportItems = {""};
        sportsList = new ArrayList<>(Arrays.asList(sportItems));
        sportsAdapter = new ArrayAdapter<String>(this, R.layout.sport_items, R.id.sportInput, sportsList);
        listView.setAdapter(sportsAdapter);
        sportInput = (EditText)findViewById(R.id.inputText9);
        Button buttonAdd9 = (Button)findViewById(R.id.addButton9);
        buttonAdd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newSport = sportInput.getText().toString();
                sportsList.add(newSport);
                sportsAdapter.notifyDataSetChanged();
            }
        });

    }
}
