package com.example.favorites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button colorsButton; //Button 1
    private Button sportsButton; //Button 2
    private Button moviesButton; //Button 3
    private Button showsButton; //Button 4
    private Button carsButton; //Button 5
    private Button storesButton; //Button 6
    private Button restButton; //Button 7
    private Button foodButton; //Button 8
    private Button designersButton; //Button 9
    private Button animalsButton; //Button 10

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorsButton = (Button) findViewById(R.id.colorsButton);
        colorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ColorsActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        sportsButton = (Button)findViewById(R.id.sportsButton);
        sportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SportsActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        moviesButton = (Button)findViewById(R.id.moviesButton);
        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MoviesActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        showsButton = (Button)findViewById(R.id.showsButton);
        showsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShowsActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        carsButton = (Button)findViewById(R.id.carsButton);
        carsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CarsActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        storesButton = (Button)findViewById(R.id.storesButton);
        storesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StoresActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        restButton = (Button)findViewById(R.id.restButton);
        restButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RestActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        foodButton = (Button)findViewById(R.id.foodButton);
        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FoodActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        designersButton = (Button)findViewById(R.id.designersButton);
        designersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DesignersActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });

        animalsButton = (Button)findViewById(R.id.animalsButton);
        animalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnimalsActivity.class); //good for going from one Activity to Another
                startActivity(i);
            }
        });
    }
}
