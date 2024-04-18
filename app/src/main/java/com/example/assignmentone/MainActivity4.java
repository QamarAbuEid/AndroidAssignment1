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

public class MainActivity4 extends AppCompatActivity {

    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        listView = findViewById(R.id.vegetables);
        ArrayList<Vegetable> arrayList =new ArrayList<>();
        arrayList.add(new Vegetable(R.drawable.ye , "Yellow"));
        arrayList.add(new Vegetable(R.drawable.blue , "Blue"));
        arrayList.add(new Vegetable(R.drawable.red , "Red"));
        arrayList.add(new Vegetable(R.drawable.white , "White"));
        arrayList.add(new Vegetable(R.drawable.green, "Green"));
        Vegetableaddapter vegetableaddapter =new Vegetableaddapter(this , R.layout.list_row1, arrayList);
        listView.setAdapter(vegetableaddapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item from the adapter
                Vegetable selectedVegetable = (Vegetable) parent.getItemAtPosition(position);
                if (selectedVegetable != null) {
                    String selectedItem = selectedVegetable.getName();
                    Toast.makeText(MainActivity4.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}