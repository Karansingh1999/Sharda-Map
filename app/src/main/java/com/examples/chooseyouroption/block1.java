package com.examples.chooseyouroption;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.examples.chooseyouroption.R;

public class block1 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block1);
        listView=findViewById(R.id.lstview);
    }
}
