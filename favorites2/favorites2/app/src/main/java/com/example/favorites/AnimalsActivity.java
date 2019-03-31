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


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnimalsActivity extends AppCompatActivity {

    public ArrayList<String> animalsList;
    public ArrayAdapter<String> animalsAdapter;
    public EditText animalsInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        ListView listView=(ListView)findViewById(R.id.listView2);
        String[] animalItems = {""};
        animalsList = new ArrayList<>(Arrays.asList(animalItems));
        animalsAdapter = new ArrayAdapter<String>(this, R.layout.animals_items, R.id.animalsInput, animalsList);
        listView.setAdapter(animalsAdapter);
        animalsInput = (EditText)findViewById(R.id.inputText2);
        Button buttonAdd2 = (Button)findViewById(R.id.addButton2);
        buttonAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newAnimal = animalsInput.getText().toString();
                animalsList.add(newAnimal);
                animalsAdapter.notifyDataSetChanged();
            }
        });

    }
}
