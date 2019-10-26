package ru.mirea.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView myTextView = (TextView) findViewById(R.id.textView5);
        myTextView.setText("New text in MIREA");
        Button myButton = (Button) findViewById(R.id.button29);
        myButton.setText("Hello, world!");
        CheckBox check = (CheckBox) findViewById(R.id.checkBox);
        check.setChecked(true);
    }
}
