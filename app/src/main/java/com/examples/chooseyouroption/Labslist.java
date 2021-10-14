package com.examples.chooseyouroption;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.examples.chooseyouroption.R;

public class Labslist extends AppCompatActivity {

    ImageView block1_imageview,block3_imageview;
    TextView block1_textview,block3_textview;
    Button block1_button,block3_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labslist);
        block1_imageview=findViewById(R.id.block1lab_imageview);
        block3_imageview=findViewById(R.id.block3lab_imageview);
        block1_textview=findViewById(R.id.block1lab_textview);
        block3_textview=findViewById(R.id.block3lab_textview);
        block1_button=findViewById(R.id.block1lab_button);
        block3_button=findViewById(R.id.block3lab_button);

        block1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Labslist.this,Block1labs.class);
                startActivity(intent1);
            }
        });
        block3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Labslist.this,Block3labs.class);
                startActivity(intent2);
            }
        });
    }
}
