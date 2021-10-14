package com.examples.chooseyouroption;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class FloatingActionItem3 extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    EventListAdapter eventListAdapter;
    List<EventModel> eventList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_item3);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(FloatingActionItem3.this, RecyclerView.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(FloatingActionItem3.this, DividerItemDecoration.VERTICAL));

        eventListAdapter = new EventListAdapter(eventList, new EventListAdapter.ClickListener() {
            @Override
            public void onClicked(EventModel studentModel) {

            }
        });

        recyclerView.setAdapter(eventListAdapter);

        FirebaseFirestore.getInstance()
                .collection("events")
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        progressBar.setVisibility(View.GONE);

                        for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                            EventModel eventModel = documentSnapshot.toObject(EventModel.class);

                            eventList.add(eventModel);
                        }

                        eventListAdapter.notifyDataSetChanged();
                    }
                })
        .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(FloatingActionItem3.this, "Please try later. Couldn't load events.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
