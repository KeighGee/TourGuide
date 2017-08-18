package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button parksData;
    private Button restaurantData;
    private Button entertainmentData;
    private Button schoolsData;
    private Button tourGuide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        entertainmentData = (Button) findViewById(R.id.entertainment);
        parksData = (Button) findViewById(R.id.parks);
        restaurantData = (Button) findViewById(R.id.restuarants);
        schoolsData = (Button)findViewById(R.id.schools);
        tourGuide = (Button) findViewById(R.id.toolbar);

        entertainmentData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EntertainmentActivity.class);
                startActivity(intent);

            }
        });
        parksData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ParksActivity.class);
                startActivity(intent);
            }
        });

        restaurantData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(intent);
            }
        });

        schoolsData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SchoolsActivity.class);
                startActivity(intent);
            }
        });

        tourGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TourDataActivity.class);
                startActivity(intent);
            }
        });
    }
}