package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_Add;
    TextView text_result;
    EditText input1;
    EditText input2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_Add = findViewById(R.id.button);
        text_result = findViewById(R.id.textView);
        input1 = findViewById(R.id.editTextNumber);
        input2 = findViewById(R.id.editTextNumber2);
        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input1.length()>0 && input2.length()>0)

                {

                    int addedSum = Integer.parseInt(input1.getText().toString()) +

                            Integer.parseInt(input2.getText().toString()) ;

                    text_result.setText("Added Sum = " + Integer.toString(addedSum));

                }
            }
        });
    }
}