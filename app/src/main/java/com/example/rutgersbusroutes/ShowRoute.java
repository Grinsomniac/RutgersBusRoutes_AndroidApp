package com.example.rutgersbusroutes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class ShowRoute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route_detail);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // get route name and detail from bundle
        Bundle bundle = getIntent().getExtras();
        String routeName = "";
        String routeDetail = "";

        if (bundle != null) {
            routeName = bundle.getString(RURoutesApp.ROUTE_NAME);
            routeDetail = bundle.getString(RURoutesApp.ROUTE_DETAIL);
        }

        // get the route name and detail view objects
        TextView routeNameView = findViewById(R.id.route_name);
        TextView routeDetailView = findViewById(R.id.route_detail);

        // set name and detail on the views
        routeNameView.setText(routeName);
        routeDetailView.setText(routeDetail);
    }
}
