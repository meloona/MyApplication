package sas.ita.com.myapplication.student_info;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import sas.ita.com.myapplication.R;

/**
 * Created by sasmob on 11/26/2017.
 */

public class Student_Adapter extends RecyclerView.Adapter<Student_Adapter.ViewHolder>{
    ArrayList<Student_Info> student;
    Context context;

    public Student_Adapter(ArrayList<Student_Info> student, Context context) {
        this.student = student;
        this.context = context;
    }

    @Override
    public Student_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.student_info, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Student_Adapter.ViewHolder holder, int position) {
        Student_Info student_info=student.get(position);
        holder.name.setText(student_info.getName());
        holder.image.setImageResource(student_info.getImage());
    }

    @Override
    public int getItemCount() {
        return student.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
           name= (TextView)itemView.findViewById(R.id.name);
           image=(ImageView)itemView.findViewById(R.id.image);
        }
    }
}
