package com.examples.chooseyouroption;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.examples.chooseyouroption.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class ParksPlayground extends AppCompatActivity {

    RecyclerView recyclerView;
    SliderLayout sliderLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks_playground);

        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();


        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(ParksPlayground.this, RecyclerView.HORIZONTAL, false));

        List<ImageModel> list = new ArrayList<>();

        list.add(new ImageModel(R.drawable.creket, "Cricket"));
        list.add(new ImageModel(R.drawable.vollybol, "Vollyball"));
        list.add(new ImageModel(R.drawable.football, "Football"));
        list.add(new ImageModel(R.drawable.park, "Parks"));





        recyclerView.setAdapter(new RecyclerViewAdapter(list, new RecyclerViewAdapter.ClickListener() {
            @Override
            public void onClicked(ImageModel imageModel) {
                if (imageModel.getName().equalsIgnoreCase("Image 1")) {

                } else if (imageModel.getName().equalsIgnoreCase("Image 2")) {

                }
            }
        }));

        //Fetching videos from url

    }
    private void setSliderViews() {
        for (int i = 0; i <= 3; i++) {
            DefaultSliderView defaultsliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    defaultsliderView.setImageDrawable(R.drawable.libpic);
                    defaultsliderView.setDescription("FIRST IMAGE");
                    break;
                case 1:
                    defaultsliderView.setImageDrawable(R.drawable.libpic2);
                    defaultsliderView.setDescription("SECOND IMAGE");
                    break;
                case 2:
                    defaultsliderView.setImageDrawable(R.drawable.lib3);
                    defaultsliderView.setDescription("THIRD IMAGE");
                    break;
                case 3:
                    defaultsliderView.setImageDrawable(R.drawable.lib4);
                    defaultsliderView.setDescription("FOURTH IMAGE");
                    break;
                case 4:
                    defaultsliderView.setImageDrawable(R.drawable.lib6);
                    defaultsliderView.setDescription("FIFTH IMAGE");
                    break;
                case 5:
                    defaultsliderView.setImageDrawable(R.drawable.lib7);
                    defaultsliderView.setDescription("SIXTH IMAGE");
                    break;

                case 6:
                    defaultsliderView.setImageDrawable(R.drawable.lib8);
                    defaultsliderView.setDescription("SEVENTH IMAGE");
                    break;

                case 7:
                    defaultsliderView.setImageDrawable(R.drawable.lib9);
                    defaultsliderView.setDescription("EIGHT IMAGE");
                    break;

            }

            defaultsliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            defaultsliderView.setDescription("" + (i + 1));
            final int final1 = 1;
            defaultsliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {

                }
            });
            sliderLayout.addSliderView(defaultsliderView);


        }


    }
}
