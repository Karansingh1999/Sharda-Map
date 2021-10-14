package com.examples.chooseyouroption;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.examples.chooseyouroption.R;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    Button button_map,button_cafeteria,button_teacher,button_library,
            button_admissioncell,button_classroom,button_lab,button_parks,button_frehser,button_other;
    ImageView image_map,profile_imageview, image_cafeteria,image_teacher,image_library,image_admission,image_classroom,image_lab,image_parks,image_freshers,image_other;

    TextView textView_map,textView_cafeteria,textView_teacher,textView_library,textView_admission,textView_classroom,textView_lab,textView_parks,textView_freshers,textView_other;

    private Uri imageUri;
   ImageView imageViewgif;

    public FloatingActionButton floatingActionButton1,floatingActionButton2,floatingActionButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewgif=findViewById(R.id.imageview_gif);

        floatingActionButton1=findViewById(R.id.floatingActionitem1);
        floatingActionButton2=findViewById(R.id.floatingActionitem2);
        floatingActionButton3=findViewById(R.id.floatingActionitem3);
    //for sharing
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareintent=new Intent();
                shareintent.setAction(Intent.ACTION_SEND);
                shareintent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.examples.chooseyouroption");
                shareintent.setType("text/plain");
                startActivity(Intent.createChooser(shareintent,"Share via"));
            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FloatingActionItem2.class);
                startActivity(intent);

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FloatingActionItem3.class);
                startActivity(intent);
            }
        });

//for gif videos
        Glide.with(MainActivity.this).load(R.raw.video).into(imageViewgif);



        NotificationChannel channel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            channel = new NotificationChannel("MyNotification","MyNotification", NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        FirebaseMessaging.getInstance().subscribeToTopic("general" )
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "Successfull";
                        if (!task.isSuccessful()) {
                            msg="failed";
                        }

                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });

        button_map=findViewById(R.id.button_map);
        button_cafeteria=findViewById(R.id.button_cafeteria);
        button_teacher=findViewById(R.id.button_teacher);
        button_library=findViewById(R.id.button_library);
        button_admissioncell=findViewById(R.id.button_admission);
        button_classroom=findViewById(R.id.button_classroom);
        button_lab=findViewById(R.id.button_labs);
        button_parks=findViewById(R.id.button_parks);
        button_frehser=findViewById(R.id.button_freshers);
        button_other=findViewById(R.id.button_others);



        textView_map=findViewById(R.id.textview_map);
        textView_cafeteria=findViewById(R.id.textview_cafe);
        textView_teacher=findViewById(R.id.textview_teacher);
        textView_library=findViewById(R.id.textview_library);
        textView_admission=findViewById(R.id.textview_admission);
        textView_classroom=findViewById(R.id.textview_classroom);
        textView_lab=findViewById(R.id.textview_labs);
        textView_parks=findViewById(R.id.textview_parks);
        textView_freshers=findViewById(R.id.textview_freshers);
        textView_other=findViewById(R.id.textview_others);

        image_map=findViewById(R.id.imageview_map);
        image_cafeteria=findViewById(R.id.imageview_cafe);
        image_teacher=findViewById(R.id.imageview_teacher);
        image_library=findViewById(R.id.imageview_library);
        image_admission=findViewById(R.id.imageview_admission);
        image_classroom=findViewById(R.id.imageview_classroom);
        image_lab=findViewById(R.id.imageview_labs);
        image_parks=findViewById(R.id.imageview_parks);
        image_freshers=findViewById(R.id.imageview_fresher);
        image_other=findViewById(R.id.imageview_other);
        profile_imageview=findViewById(R.id.yourProfile_imageview);
        profile_imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,1);
            }
        });

        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,ShardaMapActivity.class);
                startActivity(intent1);
            }
        });
        button_cafeteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,ImageSliderCafeteria.class);
                startActivity(intent1);
            }
        });

        button_teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,TeacherDetailActivity.class);
                startActivity(intent3);
            }
        });
        button_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,Library_Main.class);
                startActivity(intent4);
            }
        });
        button_admissioncell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,AdmissionCell1.class);
                startActivity(intent5);
            }
        });
        button_classroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(MainActivity.this,ClassromcardView.class);
                startActivity(intent6);
            }
        });
        button_lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(MainActivity.this,Labslist.class);
                startActivity(intent7);
            }
        });
        button_parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(MainActivity.this,ParksPlayground.class);
                startActivity(intent8);
            }
        });
        button_frehser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9=new Intent(MainActivity.this,FreshersClassLab.class);
                startActivity(intent9);
            }
        });
        button_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10=new Intent(MainActivity.this,Other_Issues.class);
                startActivity(intent10);
            }
        });






    }

    @Override
    public boolean onCreateOptionsMenu(Menu manu){
       getMenuInflater().inflate(R.menu.main,manu);
       return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.id_profile){
            return true;
        }
        if (id==R.id.id_set){
            return  true;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode==1 && resultCode ==RESULT_OK)
        {
            Uri uri=data.getData();
            imageUri=uri;
            profile_imageview.setImageURI(uri);

        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}