package com.examples.chooseyouroption;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.examples.chooseyouroption.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class ImageSliderCafeteria extends AppCompatActivity {


    SliderLayout sliderLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider_cafeteria);

        sliderLayout1=findViewById(R.id.imageSlider1);
        sliderLayout1.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout1.setScrollTimeInSec(1);


        setSliderViews();

    }
    private void setSliderViews(){
        for (int i = 0; i <= 3; i++){
            DefaultSliderView defaultsliderView = new DefaultSliderView(this);

            switch (i){
                case 0:
                    defaultsliderView.setImageDrawable(R.drawable.cafe1);
                    defaultsliderView.setDescription("FIRST IMAGE");
                    break;
                case 1:
                    defaultsliderView.setImageDrawable(R.drawable.cafe2);
                    defaultsliderView.setDescription("SECOND IMAGE");
                    break;
                case 2:
                    defaultsliderView.setImageDrawable(R.drawable.cafe3);
                    defaultsliderView.setDescription("THIRD IMAGE");
                    break;
                case 3:
                    defaultsliderView.setImageDrawable(R.drawable.cafe4);
                    defaultsliderView.setDescription("FOURTH IMAGE");
                    break;

                case 4:
                    defaultsliderView.setImageDrawable(R.drawable.cafe5);
                    defaultsliderView.setDescription("FIFTH IMAGE");
                    break;

                case 5:
                    defaultsliderView.setImageDrawable(R.drawable.cafe6);
                    defaultsliderView.setDescription("SIXTH IMAGE");
                    break;
            }

            defaultsliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            defaultsliderView.setDescription("" +(i+1));
            final  int final1 = 1;
            defaultsliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {

                }
            });
            sliderLayout1.addSliderView(defaultsliderView);


        }
    }
}
