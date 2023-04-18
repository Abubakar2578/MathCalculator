package com.example.mathcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1 , num2;
    Button sum , subtract , multiply , divide;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.editTextNumberDecimal);
        num2 = findViewById(R.id.editTextNumberDecimal2);
        sum = findViewById(R.id.button);
        subtract = findViewById(R.id.button2);
        multiply = findViewById(R.id.button3);
        divide = findViewById(R.id.button4);

        text = findViewById(R.id.textView);



        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
                text.setText("Sum is: " +  String.format("%.2f", result));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());
                text.setText("Subtract is: " + String.format("%.2f", result));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());
                text.setText("Multilpy is: " + String.format("%.2f", result));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Double.parseDouble(num1.getText().toString()) / Double.parseDouble(num2.getText().toString());
                text.setText("Divide is: " + String.format("%.2f", result));
            }
        });





    }
}