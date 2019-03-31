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

public class ShowsActivity extends AppCompatActivity {

    public ArrayList<String> showsList;
    public ArrayAdapter<String> showsAdapter;
    public EditText showInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shows);
        ListView listView=(ListView)findViewById(R.id.listView8);
        String[] showItems = {""};
        showsList = new ArrayList<>(Arrays.asList(showItems));
        showsAdapter = new ArrayAdapter<String>(this, R.layout.show_items, R.id.showInput, showsList);
        listView.setAdapter(showsAdapter);
        showInput = (EditText)findViewById(R.id.inputText8);
        Button buttonAdd8 = (Button)findViewById(R.id.addButton8);
        buttonAdd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newShow = showInput.getText().toString();
                showsList.add(newShow);
                showsAdapter.notifyDataSetChanged();
            }
        });

    }
}
