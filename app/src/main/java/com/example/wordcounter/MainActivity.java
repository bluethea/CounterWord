package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton = (Button) findViewById(R.id.btn_count);
        EditText editText = (EditText) findViewById(R.id.edit_text_count);
        TextView textViewOutput = (TextView) findViewById(R.id.text_view_output);
        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextCounter tc = new TextCounter();
                textViewOutput.setText(String.valueOf(tc.countChars(editText.getText().toString())));
            }
        });
    }
}