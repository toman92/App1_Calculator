package com.example.sean.app1_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText number1;
    private EditText number2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiply;
    private Button btnClear;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find toolbar and
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // initialise edit text fields and finds the view in xml file
        number1 = (EditText) findViewById(R.id.editNum1);
        number2 = (EditText) findViewById(R.id.editNum2);

        // initialise buttons and finds the view in xml file
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnClear = (Button) findViewById(R.id.btnClear);

        // initialise result text view and fin view in xml file
        textResult = (TextView) findViewById(R.id.txtResult);

        // set on click listener to addition button to add 2 numbers
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // First checks that both fields contain a number
                if(number1.getText().length() > 0 && number2.getText().length() > 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double result = num1 + num2;
                    textResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        // Set on click listener to subtract button to subtract 2 numbers
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().length() > 0 && number2.getText().length() > 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double result = num1 - num2;
                    textResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        // set on click listener to divide 2 numbers
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().length() > 0 && number2.getText().length() > 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double result = num1 / num2;
                    textResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        // set on click listener to multiply 2 numbers
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number1.getText().length() > 0 && number2.getText().length() > 0) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());

                    double result = num1 * num2;
                    textResult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        // set on click listener to clear all fields and put cursor in the top edit box
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText("");
                number2.setText("");
                textResult.setText("0.00");
                number1.requestFocus();
            }
        });
    }
}
