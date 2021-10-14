package com.examples.chooseyouroption;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import com.examples.chooseyouroption.R;

import java.util.ArrayList;
import java.util.List;

public class TeacherDetailActivity extends AppCompatActivity {

    ListView listView;
    List<TeacherModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_detail);

        listView = findViewById(R.id.listView);

        //Temp List, add more teachers if required.
        list.add(new TeacherModel(R.drawable.t1));
        list.add(new TeacherModel(R.drawable.t2));
        list.add(new TeacherModel(R.drawable.t12));
        list.add(new TeacherModel(R.drawable.t13));
        list.add(new TeacherModel(R.drawable.t3));
        list.add(new TeacherModel(R.drawable.t10));
        list.add(new TeacherModel(R.drawable.t5));
        list.add(new TeacherModel(R.drawable.t7));
        list.add(new TeacherModel(R.drawable.t8));
        list.add(new TeacherModel(R.drawable.t6));
        list.add(new TeacherModel(R.drawable.t14));
        list.add(new TeacherModel(R.drawable.t11));
        list.add(new TeacherModel(R.drawable.t4));
        list.add(new TeacherModel(R.drawable.t9));
        list.add(new TeacherModel(R.drawable.t15));
        list.add(new TeacherModel(R.drawable.t16));
        list.add(new TeacherModel(R.drawable.t17));
        list.add(new TeacherModel(R.drawable.t18));
        list.add(new TeacherModel(R.drawable.t19));
        list.add(new TeacherModel(R.drawable.t20));
        list.add(new TeacherModel(R.drawable.t21));
        list.add(new TeacherModel(R.drawable.t22));
        list.add(new TeacherModel(R.drawable.t23));
        list.add(new TeacherModel(R.drawable.t24));
        list.add(new TeacherModel(R.drawable.t25));
        list.add(new TeacherModel(R.drawable.t26));
        list.add(new TeacherModel(R.drawable.t27));
        list.add(new TeacherModel(R.drawable.t28));
        list.add(new TeacherModel(R.drawable.t29));
        list.add(new TeacherModel(R.drawable.t30));
        list.add(new TeacherModel(R.drawable.t31));
        list.add(new TeacherModel(R.drawable.t32));
        list.add(new TeacherModel(R.drawable.t33));
        list.add(new TeacherModel(R.drawable.t34));
        list.add(new TeacherModel(R.drawable.t35));
        list.add(new TeacherModel(R.drawable.t36));
        list.add(new TeacherModel(R.drawable.t37));
        list.add(new TeacherModel(R.drawable.t38));
        list.add(new TeacherModel(R.drawable.t39));
        list.add(new TeacherModel(R.drawable.t40));
        list.add(new TeacherModel(R.drawable.t41));


        TeacherListAdapter teacherListAdapter = new TeacherListAdapter(
                TeacherDetailActivity.this,
                list
        );

        listView.setAdapter(teacherListAdapter);
    }

}
