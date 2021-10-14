package com.examples.chooseyouroption;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Other_Issues extends AppCompatActivity {


    ImageView imageviewGmail;
    ImageView imageviewLms;
    ImageView imageviewPeople;
    ImageView imageviewWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_issues);

        imageviewGmail = findViewById(R.id.imageview_gmail);
        imageviewLms = findViewById(R.id.imageview_lms);
        imageviewPeople = findViewById(R.id.imageview_people);
        imageviewWifi = findViewById(R.id.imageview_wifi);

        imageviewGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(Other_Issues.this, Main3Activity.class);
                startActivity(intent3);

            }
        });
        imageviewLms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent4 = new Intent(Other_Issues.this, Main4Activity.class);
                startActivity(intent4);
            }
        });
        imageviewPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent5 = new Intent(Other_Issues.this, Main5Activity.class);
                startActivity(intent5);
            }
        });
        imageviewWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent6 = new Intent(Other_Issues.this, Main6Activity.class);
                startActivity(intent6);


            }
        });


        imageviewGmail = findViewById(R.id.imageview_gmail);
        imageviewLms = findViewById(R.id.imageview_lms);
        imageviewPeople = findViewById(R.id.imageview_people);
        imageviewWifi = findViewById(R.id.imageview_wifi);
    }
}
