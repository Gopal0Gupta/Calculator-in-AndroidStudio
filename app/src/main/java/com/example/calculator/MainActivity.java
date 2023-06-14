package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView n1;
    TextView n2;
    TextView n3;
    Button a;
    Button s;
    Button m;
    Button d;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        a = findViewById(R.id.a);
        s = findViewById(R.id.s);
        m = findViewById(R.id.m);
        d = findViewById(R.id.d);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                n3.setText("Addition is : "+sum);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int subs = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
                n3.setText("Substraction is : "+subs);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mult = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                n3.setText("Multiplication is : "+mult);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double div = Double.parseDouble(n1.getText().toString()) / Double.parseDouble(n2.getText().toString());
                n3.setText("Division is : "+div);
            }
        });
    }
}