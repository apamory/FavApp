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

public class CarsActivity extends AppCompatActivity {


    public ArrayList<String> carsList;
    public ArrayAdapter<String> carsAdapter;
    public EditText carsInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
        ListView listView=(ListView)findViewById(R.id.listView3);
        String[] carItems = {""};
        carsList = new ArrayList<>(Arrays.asList(carItems));
        carsAdapter = new ArrayAdapter<String>(this, R.layout.car_items, R.id.carsInput, carsList);
        listView.setAdapter(carsAdapter);
        carsInput = (EditText)findViewById(R.id.inputText3);
        Button buttonAdd3 = (Button)findViewById(R.id.addButton3);
        buttonAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newCar = carsInput.getText().toString();
                carsList.add(newCar);
                carsAdapter.notifyDataSetChanged();
            }
        });
        }
}
