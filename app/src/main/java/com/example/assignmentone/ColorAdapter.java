package com.example.assignmentone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Fruit> {

    private Context mContext;
    private int mResource;
    public ColorAdapter (@NonNull Context context  , int Resourse , @NonNull ArrayList<Vegetable> object) {
        super(context , Resourse);
        this.mContext=context;
        this.mResource=Resourse;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView imageView = convertView.findViewById(R.id.vegetablesimage);
        TextView txtName = convertView.findViewById(R.id.image2); // Corrected ID

        // Get the current Vegetable object
        Fruit currentVegetable = getItem(position);

        // Set the image and name to the ImageView and TextView
        if (currentVegetable != null) {
            imageView.setImageResource(currentVegetable.getImage());
            txtName.setText(currentVegetable.getName());
        }

        return convertView;
    }


}
