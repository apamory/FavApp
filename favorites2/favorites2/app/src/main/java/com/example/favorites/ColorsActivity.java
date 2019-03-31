package com.example.favorites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {


    public ArrayList<String> colorsList;
    public ArrayAdapter<String> colorsAdapter;
    public EditText colorsInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ListView listView=(ListView)findViewById(R.id.listView1);
        String[] colorItems = {""};
        colorsList = new ArrayList<>(Arrays.asList(colorItems));
        colorsAdapter = new ArrayAdapter<String>(this, R.layout.color_items, R.id.colorsInput, colorsList);
        listView.setAdapter(colorsAdapter);
        colorsInput = (EditText)findViewById(R.id.inputText);
        Button buttonAdd = (Button)findViewById(R.id.addButton);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newColor = colorsInput.getText().toString();
                colorsList.add(newColor);
                colorsAdapter.notifyDataSetChanged();
            }
        });




    }
}
