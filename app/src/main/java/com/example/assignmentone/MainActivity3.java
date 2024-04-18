package com.example.assignmentone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        listView = findViewById(R.id.vegetables);
        ArrayList<Vegetable> arrayList = new ArrayList<>();
        arrayList.add(new Vegetable(R.drawable.to, "Tomato"));
        arrayList.add(new Vegetable(R.drawable.ca, "Carrot"));
        arrayList.add(new Vegetable(R.drawable.ggg, "Garlic"));
        arrayList.add(new Vegetable(R.drawable.potato, "Potato"));
        arrayList.add(new Vegetable(R.drawable.on, "Onion"));
        arrayList.add(new Vegetable(R.drawable.lettuce, "lettuce"));
        arrayList.add(new Vegetable(R.drawable.eggplant, "eggplant"));
        arrayList.add(new Vegetable(R.drawable.zu, "zucchini"));
        Vegetableaddapter vegetableaddapter = new Vegetableaddapter(this, R.layout.list_row1, arrayList);
        listView.setAdapter(vegetableaddapter);

        // Set item click listener on listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item from the adapter
                Vegetable selectedVegetable = (Vegetable) parent.getItemAtPosition(position);
                if (selectedVegetable != null) {
                    String selectedItem = selectedVegetable.getName();
                    Toast.makeText(MainActivity3.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}