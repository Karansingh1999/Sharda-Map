package com.examples.chooseyouroption;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.examples.chooseyouroption.R;

public class MapDetailActivity extends AppCompatActivity {

    TextView textViewName, textViewDetail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_detail);

        textViewName = findViewById(R.id.textView_name);
        textViewDetail = findViewById(R.id.textView_detail);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();

        PlaceModel placeModel = (PlaceModel) intent.getSerializableExtra("item");

        imageView.setBackgroundResource(placeModel.getImage());
        textViewDetail.setText(placeModel.getDetail());
        textViewName.setText(placeModel.getName());
    }
}
