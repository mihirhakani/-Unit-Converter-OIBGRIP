package com.example.ani;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;
    RadioGroup radioGr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        radioGr = findViewById(R.id.radioGr);


        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);



        radioGr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
                switch (checkId)
                {
                    case R.id.radioButton1:
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String S = editText.getText().toString();
                                int cm = Integer.parseInt(S);
                                double meter = 0.01 * cm;
                                textView2.setText("The value in meter is " + meter);
                                Toast.makeText(MainActivity.this, "The value in meter is " + meter, Toast.LENGTH_SHORT).show();
                            }
                        });
                    break;
                    case R.id.radioButton2:
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String S = editText.getText().toString();
                                int meter = Integer.parseInt(S);
                                double cm = 100 * meter;
                                textView2.setText("The value in cm is " + cm);
                                Toast.makeText(MainActivity.this, "The value in cm is " + cm, Toast.LENGTH_SHORT).show();
                            }
                        });








                }

            }
        });

    }
}




