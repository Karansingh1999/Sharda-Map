package com.examples.chooseyouroption;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.examples.chooseyouroption.R;

public class AdmissionCell1 extends AppCompatActivity {



    Button admission_button;
    ListView admission_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_cell1);




        admission_button=findViewById(R.id.admissionlink_button);
        admission_listview=findViewById(R.id.listview_admission);
        final VideoView videoView = findViewById(R.id.videoView);

        String path = "https://firebasestorage.googleapis.com/v0/b/chooseyouroption-627f3.appspot.com/o/appVideos%2Fshardavideos.mp4?alt=media&token=254fa62e-2872-4bf2-8d97-232749854414";
        videoView.setVideoURI(Uri.parse(path));

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                MediaController mediaController = new MediaController(AdmissionCell1.this);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                videoView.start();
            }
        });

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                MediaController mediaController = new MediaController(AdmissionCell1.this);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                videoView.start();
            }
        });


    }
}
