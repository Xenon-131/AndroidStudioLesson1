package ru.mirea.egorovakv.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("New text in MIREA");

        Button myButton = findViewById(R.id.button);
        myButton.setText("MireaButton");

        CheckBox myCheckBox = findViewById(R.id.checkBox);
        myCheckBox.setChecked(true);


    }
}