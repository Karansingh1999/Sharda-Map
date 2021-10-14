package com.examples.chooseyouroption;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.examples.chooseyouroption.R;

public class ClassromcardView extends AppCompatActivity {
    ImageView block1_imageview,block2_imageview,block3_imageview;
    TextView textView_1,textView_2,textView3,textViewsub_1,textViewsub_2,textViewsub_3;
    Button block1_button,block2_button,block3_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classromcard_view);

        block1_imageview=findViewById(R.id.block1image_imageview);
        block2_imageview=findViewById(R.id.block2_imageview);
        block3_imageview=findViewById(R.id.block3_imageview);
        textView_1=findViewById(R.id.block1_textview);
        textView_2=findViewById(R.id.block2_textview);
        textView3=findViewById(R.id.block3_textview);
        textViewsub_1=findViewById(R.id.block1sub_textview) ;
        textViewsub_2=findViewById(R.id.block2sub_textview);
        textViewsub_3=findViewById(R.id.block3sub_textview);
        block1_button=findViewById(R.id.block1_button);
        block2_button=findViewById(R.id.block2class_button);
        block3_button=findViewById(R.id.block3class_button);

        block1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassromcardView.this,block1.class);
                startActivity(intent);
            }
        });
        block3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ClassromcardView.this,BLOCK3.class);
                startActivity(intent);

            }
        });
    }
}
