package com.example.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText Num1;
    private EditText Num2;

    private Button sum;
    private Button sub;
    private Button Mul;
    private Button Div;

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1=(EditText)findViewById(R.id.editTextNumber);
        Num2=(EditText)findViewById(R.id.editTextNumber2);
        sum=(Button) findViewById(R.id.button);
        sub=(Button) findViewById(R.id.button2);
        Mul=(Button) findViewById(R.id.button3);
        Div=(Button) findViewById(R.id.button4);
        textView=(TextView) findViewById(R.id.textView);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(Num1.getText().toString());
                int n2=Integer.parseInt(Num2.getText().toString());
                int total;
                total=n1+n2;
                textView.setText("Result:"+String.valueOf(total));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(Num1.getText().toString());
                int n2=Integer.parseInt(Num2.getText().toString());
                int total;
                total=n1-n2;
                textView.setText("Result:"+String.valueOf(total));
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(Num1.getText().toString());
                int n2=Integer.parseInt(Num2.getText().toString());
                int total;
                total=n1*n2;
                textView.setText("Result:"+String.valueOf(total));
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(Num1.getText().toString());
                int n2=Integer.parseInt(Num2.getText().toString());
                int total;
                total=n1/n2;
                textView.setText("Result:"+String.valueOf(total));
            }
        });

    }
}