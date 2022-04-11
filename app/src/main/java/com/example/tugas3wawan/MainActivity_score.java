package com.example.tugas3wawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity_score extends AppCompatActivity {

    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_score);
        TextView namaTimA = findViewById(R.id.textView);
        TextView namaTimB = findViewById(R.id.textView4);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namaTimA.setText("Team" + " " + namaA);
        namaTimB.setText("Team" + " " + namaB);
    }

    public void tambah(View view) {
        if (view.getId() == R.id.button) {
            skorA = skorA + 1;
        } else if (view.getId() == R.id.button3) {
            skorA = skorA + 2;
        } else if (view.getId() == R.id.button4) {
            skorA = skorA + 3;
        } else if (view.getId() == R.id.button7) {
            skorB = skorB + 1;
        } else if (view.getId() == R.id.button8) {
            skorB = skorB + 2;
        } else if (view.getId() == R.id.button9) {
            skorB = skorB + 3;
        }
        TextView skorTimA = findViewById(R.id.textView2);
        TextView skorTimB = findViewById(R.id.textView3);
        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }

    public void Reset(View view) {
        if (view.getId() == R.id.button5) {
            skorA = 0;
        } else if (view.getId() == R.id.button6) {
            skorB = 0;
        }
        TextView skortimA = findViewById(R.id.textView2);
        TextView skortimB = findViewById(R.id.textView3);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
}