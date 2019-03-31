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

public class MoviesActivity extends AppCompatActivity {

    public ArrayList<String> moviesList;
    public ArrayAdapter<String> moviesAdapter;
    public EditText movieInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ListView listView=(ListView)findViewById(R.id.listView6);
        String[] movieItems = {""};
        moviesList = new ArrayList<>(Arrays.asList(movieItems));
        moviesAdapter = new ArrayAdapter<String>(this, R.layout.movie_items, R.id.movieInput, moviesList);
        listView.setAdapter(moviesAdapter);
        movieInput = (EditText)findViewById(R.id.inputText6);
        Button buttonAdd6 = (Button)findViewById(R.id.addButton6);
        getSupportActionBar().setTitle("Favorite Movies");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buttonAdd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newMovie = movieInput.getText().toString();
                moviesList.add(newMovie);
                moviesAdapter.notifyDataSetChanged();
            }
        });

    }
}
