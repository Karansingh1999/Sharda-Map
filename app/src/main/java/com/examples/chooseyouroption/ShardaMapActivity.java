package com.examples.chooseyouroption;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.examples.chooseyouroption.R;

import java.util.ArrayList;
import java.util.List;

public class ShardaMapActivity extends AppCompatActivity {

    ListView listView;
    EditText editTextSearch;
    List<PlaceModel> list = new ArrayList<>();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharda_map);

        editTextSearch = findViewById(R.id.editText_search);
        listView = findViewById(R.id.listView);

        list.add(new PlaceModel("Library", R.drawable.library1, "THIS IS LIBRARY FOR SCHOOL OF ENGINEERING STUDENTS.\n BLOCK-2,FIRST FLOOR."));
        list.add(new PlaceModel("Block 1", R.drawable.block1, "this is block- 1."));
        list.add(new PlaceModel("HOD Office", R.drawable.hodoffice, "THIS IS HOD OFFICE OF OUR COMPUTER SCIENCE DEPARTMENT\nBLOCK-1,THIRD FLOOR,AT THE CORNER."));
        list.add(new PlaceModel("CAFETERIA", R.drawable.cafe2, "1.This is georgia\n2. It is near Block-1 or gate no. 4"));
        list.add(new PlaceModel("Dean Office", R.drawable.deanoffice,"Block-1 ground floor,Room no. - 001."));
        list.add(new PlaceModel("Admission Cell", R.drawable.admissionoffice,"This is Admission office(Block-1,ground floor) which is beside dean office.\n here new students come and submit there detais.\n room no.- is 002."));
        list.add(new PlaceModel("Coordination Cell", R.drawable.coordinationcell,"This is B.tech first year coordination cell.\n Here new students get their (Time-Table and Classroom details)"));
        list.add(new PlaceModel("OSD",R.drawable.osdoffice,"Block-1 ,ground floor,Room no.-003.\nOpposite to dean office"));
        list.add(new PlaceModel("Block 2", R.drawable.block2,"This is block-2"));
        list.add(new PlaceModel("Block 3",R.drawable.block3,"This is block- 3 \n In this block-3, all the new student or first year student class is alloted.  "));
        list.add(new PlaceModel("BLOCK-3 ,108B",R.drawable.a108b,"THIS IS CLASSROOM FOR FIRST YEAR STUDENTS\n BLOCK-3,FIRST FLOOR "));
        list.add(new PlaceModel("COMPUTER LAB 308B",R.drawable.comlab308,"THIS IS COMPUTER LAB FOR ALL COMPUTER SCIENCE STUDENTS.\nBLOCK-3 THIRD FLOOR NEAR BALCONY."));
        list.add(new PlaceModel("ENGLISH LAB 007",R.drawable.b3gfenglab,"THIS IS ENGLISH LAB.FOR ALL FIRST YEAR STUDENTS.\nBLOCK-3 GROUND FLOOR,AT THE CORNER. "));
        list.add(new PlaceModel("CHEMISTRY LAB 113",R.drawable.chelab2,"This is chemistry lab. For all first year students.\n Block-3 first floor. "));
        list.add(new PlaceModel("ELECTRICAL LAB 010",R.drawable.electricallab010groundfloorb3,"THIS IS ELECTRICAL LAB FOR FIRST YEAR STUDENTS.\n BLOCK-3 GROUND FLOOR."));
        list.add(new PlaceModel("ELECTRONIC PHYSICS LAB 111",R.drawable.electronicphysicslabb3firstfloor,"THE IS ELECTRONIC PHYSICS LAB.\n BLOCK-3 FIRST FLOOR"));
        list.add(new PlaceModel("PHYSICS LAB 109",R.drawable.phylab2,"THIS IS PHYSICS LAB FOR FIRST YEAR STUDENTS.\n BLOCK-3 FIRST FLOOR.AT THE CORNER NEAR BLACONY. "));
        list.add(new PlaceModel("CLASSROOM 209",R.drawable.classroom209,"THIS IS CLASSROOM FOR ONLY FIRST YEAR STUDENTS.\n BLOCK-3,SECOND FLOOR."));
        list.add(new PlaceModel("ENERGY AUDITING LAB 008",R.drawable.energyauditinglab008groundflooorb3,"THIS IS ENERGY AUDITING LAB.\n BLOCK-3 ,GROUND FLOOR."));
        list.add(new PlaceModel("FINANCE DEPARTMENT OR FEES COUNTER",R.drawable.admissioncell,"THIS IS FINANCE DEPARTMENT OR FEES COUNTER .\n HERE ALL STUDENTS DEPOSITS THEIR FEES.\n BLOCK-2 GROUND FLOOR"));







        adapter = new ArrayAdapter<PlaceModel>(
                ShardaMapActivity.this,
                android.R.layout.simple_list_item_1,
                list
        );

        listView.setAdapter(adapter);

        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                adapter.getFilter().filter(s.toString());
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ShardaMapActivity.this, MapDetailActivity.class);

                intent.putExtra("item", list.get(position));

                startActivity(intent);
            }
        });
    }
}