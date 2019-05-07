package com.croozer.earthquakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a fakelist of earthquake locations
        ArrayList<String> earthquakes = new ArrayList<>();

        earthquakes.add("San Fransisco");
        earthquakes.add("London");
        earthquakes.add("Tokyo");
        earthquakes.add("Mexico City");
        earthquakes.add("Moscow");
        earthquakes.add("Rio De Janeiro");
        earthquakes.add("Paris");

        //Link to layout
        ListView earthquakeListView = findViewById(R.id.list);

        //Create an ArrayAdapter of earthquakes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                earthquakes);

        earthquakeListView.setAdapter(adapter);


    }
}
