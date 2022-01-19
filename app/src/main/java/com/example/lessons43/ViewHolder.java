package com.example.lessons43;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    private ImageView image;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name= itemView.findViewById(R.id.text);
        image=itemView.findViewById(R.id.image);

    }
    public void onBind(Model model){
        name.setText(model.getName());
        image.setImageResource(model.getImage());
    }
}
