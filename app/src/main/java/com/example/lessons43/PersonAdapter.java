package com.example.lessons43;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<Model> namePerson = new ArrayList<>();

    public void setNamePerson(ArrayList<Model> namePerson) {
        this.namePerson = namePerson;
    }

    public PersonAdapter(ArrayList<Model> namePerson) {
        this.namePerson = namePerson;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name,parent,false ));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(namePerson.get(position));
    }

    @Override
    public int getItemCount() {
        return namePerson.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name= itemView.findViewById(R.id.name);
            image=itemView.findViewById(R.id.image);
        }

        public void onBind(Model model) {
            name.setText(model.getName());
            image.setImageResource(model.getImage());
        }
    }
}
