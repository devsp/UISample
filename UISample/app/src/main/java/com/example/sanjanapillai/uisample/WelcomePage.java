package com.example.sanjanapillai.uisample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void booktrip(View view){
        ImageButton bookatrip = (ImageButton)findViewById(R.id.btnbookatrip);
        bookatrip.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent booktripIntent = new Intent(WelcomePage.this, BookTripActivity.class);
                startActivity(booktripIntent);
            }
        });

    }

    public void event(View view){
        ImageButton eventbtn = (ImageButton)findViewById(R.id.btnbookatrip);
        eventbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent eventIntent = new Intent(WelcomePage.this, EventActivity.class);
                startActivity(eventIntent);
            }
        });

    }

    public void searchnearby(View view){
        ImageButton searchnearby = (ImageButton)findViewById(R.id.btnsearchnearby);
        Intent searchnearbyIntent = new Intent(WelcomePage.this, SearchNearbyActivity.class);
        startActivity(searchnearbyIntent);
    }

    public void review(View view){
        ImageButton review = (ImageButton)findViewById(R.id.btnreview);
        Intent reviewIntent = new Intent(WelcomePage.this, ReviewActivity.class);
        startActivity(reviewIntent);
    }

    public void profile(View view){
        ImageButton profile = (ImageButton)findViewById(R.id.btnProfile);
        Intent profileIntent = new Intent(WelcomePage.this, ProfileActivity.class);
        startActivity(profileIntent);
    }
}
