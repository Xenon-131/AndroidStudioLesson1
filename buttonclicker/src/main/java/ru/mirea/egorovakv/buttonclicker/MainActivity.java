package ru.mirea.egorovakv.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;

    public void changeCheckBox(){
        if (checkBox.isChecked()==true){
            checkBox.setChecked(false);
        }
        else{
            checkBox.setChecked(true);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.textViewStudent);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textViewStudent.setText("Мой номер по списку № 11");
                changeCheckBox();

            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);


    }

    public void onNotMeBtnClick(View v) {
        textViewStudent.setText("Это не я сделал");
        changeCheckBox();
    }
}