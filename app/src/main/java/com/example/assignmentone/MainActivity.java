package com.example.assignmentone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText_name;
    Button button_save;
    Button button_Hi;
    TextView textView_hi; // Reference to TextView
    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME = "Mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText_name = findViewById(R.id.firstname);
        button_save = findViewById(R.id.Save);
        textView_hi = findViewById(R.id.HiText); // Reference to TextView

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set click listener for the "Hi" Button programmatically
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the entered name from EditText
                String enteredName = editText_name.getText().toString();

                // Concatenate "Hi" with the entered name
                String hiMessage = "Hi " + enteredName;

                // Set the hiMessage to the TextView
                textView_hi.setText(hiMessage);
            }
        });
        // Set click listener for the "Hi" Button programmatically
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the entered name from EditText
                String enteredName = editText_name.getText().toString();

                // Save the entered name to shared preferences
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("entered_name", enteredName);
                editor.apply();

                // Concatenate "Hi" with the entered name
                String hiMessage = "Hi " + enteredName;

                // Set the hiMessage to the TextView
                textView_hi.setText(hiMessage);
            }
        });


    }

    public void openMain2(View view) {
        startActivity(new Intent(this, MainActivity5.class));
    }

    public void openMain3(View view) {
        startActivity(new Intent(this, MainActivity3.class));
    }
    public void openMain4(View view) {
        startActivity(new Intent(this, MainActivity4.class));
    }
}
