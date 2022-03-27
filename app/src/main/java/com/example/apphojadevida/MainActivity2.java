package com.example.apphojadevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity2 extends AppCompatActivity {
    CheckBox miPrimerCheck;
    private Button NEXT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        NEXT = (Button) findViewById(R.id.button3);
        miPrimerCheck = (CheckBox) findViewById(R.id.checkBox);
        miPrimerCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (miPrimerCheck.isChecked()){
                    NEXT.setEnabled(true);
                }else{
                    NEXT.setEnabled(false);
                }
            }
        });


    }

    public void Next(View view){
        Intent Next = new Intent (this, MainActivity3.class);
        startActivity(Next);
    }
    public void Back(View view){
        Intent Back = new Intent (this, MainActivity.class);
        startActivity(Back);
    }
}