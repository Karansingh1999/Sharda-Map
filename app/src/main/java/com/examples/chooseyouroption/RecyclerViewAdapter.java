package com.examples.chooseyouroption;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    public interface ClickListener {
        void onClicked(ImageModel studentModel);
    }

    private ClickListener clickListener;

    private List<ImageModel> list;

    public RecyclerViewAdapter(List<ImageModel> list, ClickListener clickListener) {
        this.clickListener = clickListener;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_listitem, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        ImageModel studentModel = list.get(i);

        myViewHolder.textViewName.setText(studentModel.getName());
        myViewHolder.circleImageView.setImageResource(studentModel.getImage());

        myViewHolder.itemView.setTag(studentModel);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textViewName;
        CircleImageView circleImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.name);
            circleImageView = itemView.findViewById(R.id.image);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            ImageModel studentModel = (ImageModel) itemView.getTag();
            clickListener.onClicked(studentModel);
        }
    }
}
