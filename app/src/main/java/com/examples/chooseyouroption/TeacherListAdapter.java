package com.examples.chooseyouroption;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.examples.chooseyouroption.R;

import java.util.List;

public class TeacherListAdapter extends ArrayAdapter<TeacherModel> {

    private List<TeacherModel> list;

    public TeacherListAdapter(Context context, List<TeacherModel> list) {
        super(context, R.layout.row_for_teacher_list);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    private static class ViewHolder {
        TextView textView;
        ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TeacherModel teacherModel = list.get(position);

        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_for_teacher_list, parent, false);
//            viewHolder.textView = convertView.findViewById(R.id.textView_name);
            viewHolder.imageView = convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(teacherModel.getImage());
//        viewHolder.textView.setText(teacherModel.getName());

        return convertView;
    }
}
