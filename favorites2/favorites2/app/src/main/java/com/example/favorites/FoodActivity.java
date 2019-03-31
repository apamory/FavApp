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

public class FoodActivity extends AppCompatActivity {

    public ArrayList<String> foodsList;
    public ArrayAdapter<String> foodsAdapter;
    public EditText foodsInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ListView listView=(ListView)findViewById(R.id.listView5);
        String[] foodItems = {""};
        foodsList = new ArrayList<>(Arrays.asList(foodItems));
        foodsAdapter = new ArrayAdapter<String>(this, R.layout.food_items, R.id.foodInput, foodsList);
        listView.setAdapter(foodsAdapter);
        foodsInput = (EditText)findViewById(R.id.inputText5);
        Button buttonAdd5 = (Button)findViewById(R.id.addButton5);
        buttonAdd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newFood = foodsInput.getText().toString();
                foodsList.add(newFood);
                foodsAdapter.notifyDataSetChanged();
            }
        });

    }
}
