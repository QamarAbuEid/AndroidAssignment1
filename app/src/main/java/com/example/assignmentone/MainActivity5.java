package com.example.assignmentone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    ListView listView;
    EditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        listView = findViewById(R.id.vegetables);
        editText = findViewById(R.id.edit_text_fruit_name);

        ArrayList<Vegetable> arrayList = new ArrayList<>();
        arrayList.add(new Vegetable(R.drawable.applee, "Apple"));
        arrayList.add(new Vegetable(R.drawable.blueberry, "BlueBerry"));
        arrayList.add(new Vegetable(R.drawable.banana, "Banana"));
        arrayList.add(new Vegetable(R.drawable.grabe, "Grapes"));
        arrayList.add(new Vegetable(R.drawable.mil, "Milon"));
        arrayList.add(new Vegetable(R.drawable.raspberry, "Raspberry"));
        arrayList.add(new Vegetable(R.drawable.orange, "Orange"));
        arrayList.add(new Vegetable(R.drawable.fig, "Fig"));

        Vegetableaddapter vegetableaddapter = new Vegetableaddapter(this, R.layout.list_row1, arrayList);
        listView.setAdapter(vegetableaddapter);

    }

}
