package com.example.rutgersbusroutes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RURoutesApp extends AppCompatActivity {
    private ListView listView;
    private String[] routeNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.routes_list);

        listView = findViewById(R.id.routes_list);
        routeNames = getResources().getStringArray(R.array.routes_array); ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, R.layout.route, routeNames); listView.setAdapter(adapter);
    }
}