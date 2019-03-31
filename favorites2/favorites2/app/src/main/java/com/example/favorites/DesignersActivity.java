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

public class DesignersActivity extends AppCompatActivity {

    public ArrayList<String> designersList;
    public ArrayAdapter<String> designersAdapter;
    public EditText designersInput;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designers);
        ListView listView=(ListView)findViewById(R.id.listView4);
        String[] designerItems = {""};
        designersList = new ArrayList<>(Arrays.asList(designerItems));
        designersAdapter = new ArrayAdapter<String>(this, R.layout.designers_items, R.id.designersInput, designersList);
        listView.setAdapter(designersAdapter);
        designersInput = (EditText)findViewById(R.id.inputText4);
        Button buttonAdd4 = (Button)findViewById(R.id.addButton4);
        buttonAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newDesigner = designersInput.getText().toString();
                designersList.add(newDesigner);
                designersAdapter.notifyDataSetChanged();
            }
        });

    }
}
