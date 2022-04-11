package com.example.tugas3wawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Input (View view) {
        EditText inputnamatimA = findViewById(R.id.editTextTextPersonName2);
        EditText inputnamatimB = findViewById(R.id.editTextTextPersonName3);

        String namatimA = inputnamatimA.getText().toString();
        Log.d(TAG, namatimA);
        String namatimB = inputnamatimB.getText().toString();
        Log.d(TAG, namatimB);

        Intent intent = new Intent(this, MainActivity_score.class);
        intent.putExtra("Tim A", namatimA);
        intent.putExtra("Tim B", namatimB);
        startActivity(intent);    }
}