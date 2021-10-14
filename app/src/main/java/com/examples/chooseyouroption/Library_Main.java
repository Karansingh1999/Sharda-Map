package com.examples.chooseyouroption;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.examples.chooseyouroption.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class Library_Main extends AppCompatActivity {
    SliderLayout sliderLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library__main);
        sliderLayout = findViewById(R.id.imageSlider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();


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

