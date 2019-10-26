package ru.mirea.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.widget.Toast;


public class ClickButtons extends AppCompatActivity {
    private Button buttonOK;
    private Button buttonCancel;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_buttons);
        textView = (TextView) findViewById(R.id.tvOut);
        buttonOK = (Button) findViewById(R.id.btnOK);
        buttonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOK = new View.OnClickListener (){
            @Override
            public void onClick(View v){
                textView.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener oclBtnCancel = new View.OnClickListener (){
            @Override
            public void onClick(View v){
                textView.setText("Нажата кнопка Cancel");
            }
        };

        /*public void onMyButtonClick(View view)
        {
            Toast.makeText(this, "Ещё один способ", Toast.LENGTH_SHORT).show();
        }*/

        buttonOK.setOnClickListener(oclBtnOK);
        buttonCancel.setOnClickListener(oclBtnCancel);

    }
}
