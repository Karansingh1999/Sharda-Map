package com.examples.chooseyouroption;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.MyViewHolder> {

    public interface ClickListener {
        void onClicked(EventModel studentModel);
    }

    private ClickListener clickListener;

    private List<EventModel> list;

    public EventListAdapter(List<EventModel> list, ClickListener clickListener) {
        this.clickListener = clickListener;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_for_event_list, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        EventModel studentModel = list.get(i);

        myViewHolder.textViewName.setText(studentModel.getName());
        myViewHolder.textViewDetail.setText(studentModel.getDetails());
        myViewHolder.textViewDate.setText(studentModel.getDate());

        myViewHolder.itemView.setTag(studentModel);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textViewName, textViewDetail, textViewDate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textView_name);
            textViewDetail = itemView.findViewById(R.id.textView_detail);
            textViewDate = itemView.findViewById(R.id.textView_date);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            EventModel studentModel = (EventModel) itemView.getTag();
            clickListener.onClicked(studentModel);
        }
    }
}