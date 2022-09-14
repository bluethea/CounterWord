package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton = (Button) findViewById(R.id.btn_count);
        EditText editText = (EditText) findViewById(R.id.edit_text_count);
        TextView textViewOutput = (TextView) findViewById(R.id.text_view_output);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String countedText = editText.getText().toString();
                String spinnerText = spinner.getSelectedItem().toString();
                TextCounter tc = new TextCounter();
                if (TextUtils.isEmpty(countedText)) {
                    Toast.makeText(getApplicationContext(), "The EditText field is empty.", Toast.LENGTH_LONG).show();
                }
                else {
                    if (spinnerText.equalsIgnoreCase(getResources().getString(R.string.chars_selection))) {
                        textViewOutput.setText(String.valueOf(tc.countChars(countedText)));
                    }
                    else {
                        textViewOutput.setText(String.valueOf(tc.countWords(countedText)));
                    }
                }
            }
        });
    }
}