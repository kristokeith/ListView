package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listNegara);

        String[] negara = {"Indonesia", "Malaysia", "Singapore", "Italia",
                "Inggris", "Belanda", "Argentina", "Chile", "Mesir", "Uganda"};

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, negara);
        list.setAdapter(myAdapter);
    }
}